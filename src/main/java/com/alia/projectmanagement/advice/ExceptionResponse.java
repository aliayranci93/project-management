package com.alia.projectmanagement.advice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by Ali on Kas,2020
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {
        private Date date;
        private String message;

}
