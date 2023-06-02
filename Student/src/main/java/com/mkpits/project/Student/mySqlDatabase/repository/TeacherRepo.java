package com.mkpits.project.Student.mySqlDatabase.repository;

import com.mkpits.project.Student.mySqlDatabase.model.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepo extends JpaRepository<TeacherEntity,Long> {

}
