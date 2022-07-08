package com.scaler.scalerschemajuly2022.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class Module extends BaseModel {
    private String name;
    @ManyToMany
    private List<Student> enrolledStudents;

    @OneToMany(mappedBy = "module")
    private List<ModuleExam> moduleExams;
}

// Module : ME
//  1     :   M
//  1     :   1
//  1     to   M
