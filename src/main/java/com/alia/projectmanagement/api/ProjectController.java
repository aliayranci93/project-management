package com.alia.projectmanagement.api;

import com.alia.projectmanagement.dto.ProjectDto;
import com.alia.projectmanagement.service.impl.ProjectService;
import com.alia.projectmanagement.util.TPage;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("api/projects/pagination")

    public ResponseEntity<TPage<ProjectDto>> getAllByPagination(Pageable pageable) {
        TPage<ProjectDto> data = projectService.getAllPageable(pageable);
        return ResponseEntity.ok(data);
    }

    @GetMapping("api/projects/{id}")
    public ResponseEntity<ProjectDto> getById(@PathVariable(value = "id", required = true) Long id) {
        ProjectDto projectDto = projectService.getById(id);
        return ResponseEntity.ok(projectDto);
    }

    @PostMapping("api/projects")
    public ResponseEntity<ProjectDto> createProject(@Valid @RequestBody ProjectDto project) {
        return ResponseEntity.ok(projectService.save(project));
    }

    @GetMapping("api/projects")
    public ResponseEntity<List<ProjectDto>> getAll() {
        List<ProjectDto> data = projectService.getAll();
        return ResponseEntity.ok(data);
    }



    @DeleteMapping("api/projects/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id", required = true) Long id) {
        return ResponseEntity.ok(projectService.delete(id));
    }

    @PutMapping("api/projects/{id}")

    public ResponseEntity<ProjectDto> updateProject(@PathVariable(value = "id", required = true) Long id, @Valid @RequestBody ProjectDto project) {
        return ResponseEntity.ok(projectService.update(id, project));
    }


}
