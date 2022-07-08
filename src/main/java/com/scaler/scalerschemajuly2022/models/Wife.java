package com.scaler.scalerschemajuly2022.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Wife extends BaseModel {
    @OneToOne(mappedBy = "wife")
    private Husband husband;
}
