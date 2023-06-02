package com.mkpits.project.Student.dtoRequest;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class StudentDto {
    private long id;
    private String f_Name;
    private  String l_Name;
    private String email;

}
