package com.common.app.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "ClientProject")
public class ClientProjectDto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clientProject_seq")
    @SequenceGenerator(name = "clientProject_seq", sequenceName = "clientProject_SEQ", allocationSize = 1)
    int clientProjectID;
    @Column(name = "Lead_By_Emp_Id")
    int leadByEmpId;
    @Column(name = "Project_Name")
    String projectName;
    @Column(name = "Start_Date")
    String startDate;
    @Column(name = "Expected_End_Date")
    String expectedEndDate;
    @Column(name = "Completed_Date")
    String completedDate;
    @Column(name = "Contact_Person")
    String contactPerson;
    @Column(name = "Contact_Person_Contact_No")
    String contactPersonContactNo;
    @Column(name = "Total_Emp_Working")
    int totalEmpWorking;
    @Column(name = "Project_Cost")
    double projectCost;
    @Column(name = "Project_Details")
    String projectDetails;
    @Column(name = "Contact_Person_Email_Id")
    String contactPersonEmailId;
    @Column(name = "Client_Id")
    String clientId;
}
