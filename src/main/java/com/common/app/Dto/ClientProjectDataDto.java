package com.common.app.Dto;

import com.common.app.Entity.ClientProjectDto;
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
