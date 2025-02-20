package com.test.camunda;

import io.camunda.zeebe.client.ZeebeClient;
import io.camunda.zeebe.client.api.response.ActivateJobsResponse;
import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.response.ProcessInstanceEvent;
import io.camunda.zeebe.process.test.api.ZeebeTestEngine;
import io.camunda.zeebe.process.test.assertions.BpmnAssert;
import io.camunda.zeebe.process.test.assertions.JobAssert;
import io.camunda.zeebe.process.test.assertions.ProcessInstanceAssert;
import io.camunda.zeebe.process.test.engine.EngineFactory;
import io.camunda.zeebe.process.test.extension.ZeebeProcessTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ZeebeProcessTest
public class CamundaTest {

    private ZeebeClient zeebeClient;

    @BeforeEach
    void setup(){
        ZeebeTestEngine zeebeTestEngine = EngineFactory.create(26501);
        zeebeTestEngine.start();
        zeebeClient = zeebeTestEngine.createClient();
        zeebeClient.newDeployResourceCommand().addResourceFromClasspath("test.bpmn").send().join();
    }

    @Test
    public void test() {

        ProcessInstanceEvent event = zeebeClient.newCreateInstanceCommand()
                .bpmnProcessId("Process_15zwwp6")
                .latestVersion()
                .send()
                .join();
        System.out.println("instance Created "+event.getProcessInstanceKey());
        ProcessInstanceAssert assertions = BpmnAssert.assertThat(event);

        ActivateJobsResponse response = zeebeClient.newActivateJobsCommand()
                .jobType("<jobType>")
                .maxJobsToActivate(1)
                .send()
                .join();
        ActivatedJob activatedJob = response.getJobs().get(0);
        JobAssert assertions1 = BpmnAssert.assertThat(activatedJob);
    }
}
