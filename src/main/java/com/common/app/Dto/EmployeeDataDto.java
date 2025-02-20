package com.common.app.Dto;

import com.common.app.Entity.EmployeeDto;
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
