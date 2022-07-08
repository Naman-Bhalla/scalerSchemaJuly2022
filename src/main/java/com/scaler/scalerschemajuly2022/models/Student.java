package com.scaler.scalerschemajuly2022.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Student extends BaseModel {
    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private String password;
    @ManyToMany(mappedBy = "enrolledStudents")
    private List<Module> enrolledModules;
}

// Every batc

// S : M
// 1 -> M
// M <- 1