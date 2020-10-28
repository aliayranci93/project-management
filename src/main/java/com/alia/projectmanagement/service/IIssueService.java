package com.alia.projectmanagement.service;

import com.alia.projectmanagement.dto.IssueDto;
import com.alia.projectmanagement.entity.Issue;
import com.alia.projectmanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface IIssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(Long issue);

    IssueDto update(Long id, IssueDto project);

}
