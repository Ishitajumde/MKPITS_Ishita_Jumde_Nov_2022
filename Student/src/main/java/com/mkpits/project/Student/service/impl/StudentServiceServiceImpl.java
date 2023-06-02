package com.mkpits.project.Student.service.impl;

import com.mkpits.project.Student.dtoRequest.StudentDto;
import com.mkpits.project.Student.h2Database.model.StudentEntity;
import com.mkpits.project.Student.h2Database.repository.StudentRepo;
import com.mkpits.project.Student.mySqlDatabase.model.TeacherEntity;
import com.mkpits.project.Student.mySqlDatabase.repository.TeacherRepo;
import com.mkpits.project.Student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentServiceServiceImpl implements StudentService {
    @Autowired
    public TeacherRepo teacherRepo;
    @Autowired
    public StudentRepo studentRepo;


    @Override
    public List<StudentDto> getData() {
        List<StudentDto> studentDtoList = new ArrayList<>();
        List<TeacherEntity> teacherEntityList = teacherRepo.findAll();
        teacherEntityList.stream().forEach(teacherEntity -> {
            StudentDto studentDto = StudentDto.builder()
                    .f_Name(teacherEntity.getFName())
                    .l_Name(teacherEntity.getLName())
                    .email(teacherEntity.getEmail())
                    .build();
            studentDtoList.add(studentDto);
        });
        return studentDtoList;
    }
    @Override
    public List<StudentDto> addData(StudentDto studentDto) {
        List<StudentDto> studentDtoList = new ArrayList<>();
        //add data in h2
        StudentEntity studentEntity = StudentEntity.builder()
                .firstName(studentDto.getL_Name())
                .lastName(studentDto.getL_Name())
                .email(studentDto.getEmail())
                .build();
        StudentEntity afterSave = studentRepo.save(studentEntity);
        studentDto.setId(afterSave.getId());
        studentDtoList.add(studentDto);

        //add data in sql
        TeacherEntity teacherEntity = TeacherEntity.builder()
                .fName(studentDto.getF_Name())
                .lName(studentDto.getL_Name())
                .email(studentDto.getEmail())
                .build();

        TeacherEntity afterSave1 = teacherRepo.save(teacherEntity);
        studentDto.setId(afterSave1.getId());
        studentDtoList.add(studentDto);

        return studentDtoList;
    }

}