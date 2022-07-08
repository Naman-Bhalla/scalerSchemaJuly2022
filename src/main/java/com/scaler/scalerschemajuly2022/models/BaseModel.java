package com.scaler.scalerschemajuly2022.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedDate
    private Date createdAt;

    @LastModifiedDate
    private Date lastModifiedAt;
}
// id | --------- | createdAt | lastModifiedAt |

// students
//  id | name | email | phoneNumber | createdAt | lastModifiedAT|
// 1
// 2
// 3
// 10^18
// UUID

///  id | -------------- | isDeleted | createdAt | lastModifiedAt
