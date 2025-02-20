package com.springboot.demo.Dto;

import com.springboot.demo.Entity.ClientDto;
import com.springboot.demo.Entity.EmployeeDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDataDto {

    String message;
    List<EmployeeDto> data;
}
