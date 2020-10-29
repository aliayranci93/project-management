package com.alia.projectmanagement.dto;

import com.alia.projectmanagement.entity.IssueStatus;
import lombok.Data;

import java.util.Date;

@Data
public class IssueHistoryDto {

    private Long id;

    private IssueDto issue;

    private String description;

    private Date date;

    private IssueStatus issueStatus;

    private String details;

    private UserDto assignee;
}