package com.mkpits.project.Student.h2Database.repository;

import com.mkpits.project.Student.h2Database.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentEntity,Long> {

}
