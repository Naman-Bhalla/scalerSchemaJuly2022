package com.scaler.scalerschemajuly2022.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class StudentModuleExam extends BaseModel {
    @ManyToOne
    private Student student;
    @ManyToOne
    private ModuleExam moduleExam;
    private int marks;
}

// SME : S
// 1   : 1
// M    : 1

// SME : ME
//   1 : 1
//   M  : 1
// I have an object with ME id = 21
// For that module, that exam can be given by M students