package com.mkpits.project.Student.service;

import com.mkpits.project.Student.dtoRequest.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> getData();
    List<StudentDto> addData(StudentDto studentDto);
}
