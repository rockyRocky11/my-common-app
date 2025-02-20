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
@Table(name = "Client")
public class ClientDto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_seq")
    @SequenceGenerator(name = "client_seq", sequenceName = "client_SEQ", allocationSize = 1)
    int id;
    @Column(name = "Contact_Person_Name")
    String contactPersonName;
    @Column(name = "Company_Name")
    String companyName;
    @Column(name = "Address")
    String address;
    @Column(name = "City")
    String city;
    @Column(name = "Postal_Code")
    String postalCode;
    @Column(name = "Province")
    String province;
    @Column(name = "Employee_Strength")
    int employeeStrength;
    @Column(name = "GST_NO")
    String gstNo;
    @Column(name = "Contact_No")
    String contactNo;
    @Column(name = "Reg_No")
    String regNo;

}
