package com.springboot.demo.Dto;

import com.springboot.demo.Entity.ClientProjectDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientProjectDataDto {

    String message;
    List<ClientProjectDto> data;
}
