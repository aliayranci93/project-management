package com.alia.projectmanagement.api;

import com.alia.projectmanagement.dto.ProjectDto;
import com.alia.projectmanagement.service.impl.ProjectService;
import com.alia.projectmanagement.util.ApiPaths;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Ali on Kas,2020
 */
@RestController
@RequestMapping("/versions")
@Api(value = ApiPaths.ProjectCtrl.CTRL, description = "Proje Api'leri Versiyonlu")
@CrossOrigin
public class ProjectVersionApi {

    @Autowired
    private ProjectService projectService;

    @GetMapping(value = "/{id}",params = "version=1")
    @ApiOperation(value = "Id 'ye Göre Proje Getir V1", response = ProjectDto.class)
    public ResponseEntity<ProjectDto> getByIdV1(@PathVariable(value = "id", required = true) Long id) {
        //id v1
        ProjectDto projectDto = projectService.getById(id);
        return ResponseEntity.ok(projectDto);
    }

    @GetMapping(value = "/{id}", params = "version=2")
    @ApiOperation(value = "Id 'ye Göre Proje Getir V2", response = ProjectDto.class)
    public ResponseEntity<ProjectDto> getByIdV2(@PathVariable(value = "id", required = true) Long id) {
        //id v2
        ProjectDto projectDto = projectService.getById(id);
        return ResponseEntity.ok(projectDto);
    }
}