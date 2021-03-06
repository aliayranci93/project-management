package com.alia.projectmanagement.dto;

import com.alia.projectmanagement.entity.IssueStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor

public class IssueDetailDto {

    private Long id;

    private String description;

    private String details;

    private Date date;

    private IssueStatus issueStatus;

    private UserDto assignee;

    private ProjectDto project;


    private List<IssueHistoryDto> issueHistories;
}
