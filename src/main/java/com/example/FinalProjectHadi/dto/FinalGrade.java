package com.example.FinalProjectHadi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FinalGrade {
    private Long grade;
    private Long id;
    private String name;

}
