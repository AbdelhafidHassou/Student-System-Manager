package com.studentManagerSystem.Student.Manager.System.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private String studentFName;
    private String studentLName;
    private String studentBDay;
    private String studentAddress;
    private int studentMarks;
}
