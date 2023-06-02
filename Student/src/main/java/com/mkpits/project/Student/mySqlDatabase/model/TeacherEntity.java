package com.mkpits.project.Student.mySqlDatabase.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "teacher")
public class TeacherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "First_Name")
    private String fName;
    @Column(name = "Last_Name")
    private String lName;
    @Column(name = "Email")
    private String email;
    @Column(name = "Mobile_No")
    private String mobile;
}
