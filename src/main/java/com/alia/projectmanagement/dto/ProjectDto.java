package com.alia.projectmanagement.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "Proje Veri Aktarım Objesi")
public class ProjectDto {
    @ApiModelProperty(value = "Proje ID")
    private Long id;
    @NotNull
    @ApiModelProperty(required = true,value = "Proje ismi")
    private String projectName;
    @NotNull
    @ApiModelProperty(required = true,value = "Proje Kodu")
    private String projectCode;



    private Long managerId;

    private UserDto manager;
}