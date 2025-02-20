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
@Table(name = "Employee")
public class EmployeeDto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_seq")
    @SequenceGenerator(name = "employee_seq", sequenceName = "employee_SEQ", allocationSize = 1)
    int empID;
    @Column(name = "Employee_Name")
    String employeeName;
    @Column(name = "Employee_Code")
    String employeeCode;
    @Column(name = "Employee_Email_Id")
    String employeeEmailID;
    @Column(name = "Employee_Designation")
    String employeeDesignation;
    @Column(name = "Employee_Role")
    String employeeRole;

}
