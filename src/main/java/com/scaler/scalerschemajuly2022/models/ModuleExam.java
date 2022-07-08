package com.scaler.scalerschemajuly2022.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

// ME : M  => M to 1
//  1 : 1
//  M : 1
//      2
// (2, 5)
// (2, 7)
// (2, 9)

// ME:M => M: 1
@Entity
public class ModuleExam extends BaseModel {
    @ManyToOne
    private Module module;  // ModuleExam : Module
                            //      1      :  1//
                            //      M       : 1

    // ME : E
    //  1 : 1
    //  M : 1
    @ManyToOne
    private Exam exam;

    private Date dateOfExam;
}
// if the type of an attribute of a class is
// a data type that is also being persisted
// => we are talking about relation between two classes
// => Must specify what is the cardinality of relation
//    so that Spring Boot can create tables appropriately



// Cardinality between
// ModuleExam : Module => m:1
// (module_id, exam_id) : 1
//                    M          1
// 1 Module can have multiple Exams
// Module with id 2 has exams with id (4, 5, 6)
// => We will have ModuleExam objects like
// (2, 4)
// (2, 5)
// (2, 6)

// ModuleExam {
//   Module module; M:1
//   Exam exam; M : 1
// }
//   module_exams
// module_id | exam_id