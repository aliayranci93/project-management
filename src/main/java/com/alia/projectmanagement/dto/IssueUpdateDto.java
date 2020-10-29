package com.alia.projectmanagement.dto;

import com.alia.projectmanagement.entity.IssueStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class IssueUpdateDto {

    private Long id;

    private String description;

    private String details;

    private Date date;

    private IssueStatus issueStatus;

    private Long assignee_id;

    private Long project_id;
}