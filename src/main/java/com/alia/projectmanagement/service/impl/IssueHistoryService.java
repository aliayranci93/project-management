package com.alia.projectmanagement.service.impl;


import com.alia.projectmanagement.dto.IssueHistoryDto;
import com.alia.projectmanagement.entity.Issue;
import com.alia.projectmanagement.entity.IssueHistory;
import com.alia.projectmanagement.repo.IssueHistoryRepository;
import com.alia.projectmanagement.service.IIssueHistoryService;
import com.alia.projectmanagement.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class IssueHistoryService implements IIssueHistoryService {

    private final IssueHistoryRepository issueHistoryRepository;

    public IssueHistoryService(IssueHistoryRepository issueHistoryRepository, ModelMapper modelMapper) {
        this.issueHistoryRepository = issueHistoryRepository;
        this.modelMapper = modelMapper;
    }
    private final ModelMapper modelMapper;



    @Override
    public IssueHistoryDto save(IssueHistoryDto issueHistory) {
        IssueHistory ih = modelMapper.map(issueHistory, IssueHistory.class);
        ih = issueHistoryRepository.save(ih);
        issueHistory.setId(ih.getId());
        return issueHistory;
    }

    @Override
    public IssueHistoryDto getById(Long id) {
        IssueHistory ih = issueHistoryRepository.getOne(id);
        return modelMapper.map(ih, IssueHistoryDto.class);
    }

    @Override
    public List<IssueHistoryDto> getByIssueId(Long id) {
        return Arrays.asList(modelMapper.map(issueHistoryRepository.getByIssueIdOrderById(id), IssueHistoryDto[].class));
    }

    @Override
    public TPage<IssueHistoryDto> getAllPageable(Pageable pageable) {
        Page<IssueHistory> data = issueHistoryRepository.findAll(pageable);
        TPage<IssueHistoryDto> respnose = new TPage<IssueHistoryDto>();
        respnose.setStat(data, Arrays.asList(modelMapper.map(data.getContent(), IssueHistoryDto[].class)));
        return respnose;
    }

    @Override
    public Boolean delete(IssueHistoryDto issueHistory) {
        issueHistoryRepository.deleteById(issueHistory.getId());
        return Boolean.TRUE;
    }

    @Override
    public void addHistory(Long id, Issue issueDb) {
        IssueHistory history=new IssueHistory();
        history.setIssue(issueDb);
        history.setAssignee(issueDb.getAssignee());
        history.setDate(issueDb.getDate());
        history.setDescription(issueDb.getDescription());
        history.setDetails(issueDb.getDetails());
        history.setIssueStatus(issueDb.getIssueStatus());
        issueHistoryRepository.save(history);
    }

}
