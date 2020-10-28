package com.alia.projectmanagement.service;

import com.alia.projectmanagement.dto.ProjectDto;
import com.alia.projectmanagement.util.TPage;
import org.springframework.data.domain.Pageable;

import java.util.List;
public interface IProjectService {
    ProjectDto save(ProjectDto project);

    ProjectDto getById(Long id);

    ProjectDto getByProjectCode(String projectCode);

    List<ProjectDto> getByProjectCodeContains(String projectCode);

    TPage<ProjectDto> getAllPageable(Pageable pageable);

    Boolean delete(ProjectDto project);

    ProjectDto update(Long id, ProjectDto project);
}
