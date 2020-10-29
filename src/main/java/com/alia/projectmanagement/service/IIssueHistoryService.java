package com.alia.projectmanagement.service;

import com.alia.projectmanagement.dto.IssueHistoryDto;
import com.alia.projectmanagement.entity.Issue;
import com.alia.projectmanagement.util.TPage;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IIssueHistoryService {

    IssueHistoryDto save(IssueHistoryDto issueHistory);

    IssueHistoryDto getById(Long id);

    List<IssueHistoryDto> getByIssueId(Long id);

    TPage<IssueHistoryDto> getAllPageable(Pageable pageable);

    Boolean delete(IssueHistoryDto issueHistory);

    void addHistory(Long id, Issue issue);
}
