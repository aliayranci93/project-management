package com.alia.projectmanagement.api;

/**
 * Created by Ali on Kas,2020
 */

import com.alia.projectmanagement.dto.ProjectDto;
import com.alia.projectmanagement.service.impl.ProjectService;
import com.alia.projectmanagement.util.ApiPaths;
import com.alia.projectmanagement.util.TPage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping(ApiPaths.ProjectCtrl.CTRL)
@Api(description = "Proje Api'leri",value = ApiPaths.ProjectCtrl.CTRL)
@Slf4j
@CrossOrigin
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/pagination")
    @ApiOperation(value = "Proje git Id'ye göre",response = TPage.class)
    public ResponseEntity<TPage<ProjectDto>> getAllByPagination(Pageable pageable) {
        TPage<ProjectDto> data = projectService.getAllPageable(pageable);
        return ResponseEntity.ok(data);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Proje git Id'ye göre",response = ProjectDto.class)
    public ResponseEntity<ProjectDto> getById(@PathVariable(value = "id", required = true) Long id) {
        log.info("ProjectController - getById Çağırıldı. ");
        log.debug("ProjectController - getById Çağırıldı. Id Parametresi :" +id);
        ProjectDto projectDto = projectService.getById(id);
        return ResponseEntity.ok(projectDto);
    }

    @PostMapping("")
    @ApiOperation(value = "Proje Oluştur",response = ProjectDto.class)
    public ResponseEntity<ProjectDto> createProject(@Valid @RequestBody ProjectDto project) {
        return ResponseEntity.ok(projectService.save(project));
    }

    @GetMapping("")
    @ApiOperation(value = "Projeleri Getir",response =ArrayList.class)
    public ResponseEntity<List<ProjectDto>> getAll() {
        List<ProjectDto> data = projectService.getAll();
        return ResponseEntity.ok(data);
    }



    @DeleteMapping("/{id}")
    @ApiOperation(value = "Proje Sil",response = Boolean.class)
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id", required = true) Long id) {
        return ResponseEntity.ok(projectService.delete(id));
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Proje git Id'ye göre",response = ProjectDto.class)
    public ResponseEntity<ProjectDto> updateProject(@PathVariable(value = "id", required = true) Long id, @Valid @RequestBody ProjectDto project) {
        return ResponseEntity.ok(projectService.update(id, project));
    }


}
