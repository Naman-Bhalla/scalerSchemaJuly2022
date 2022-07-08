package com.scaler.scalerschemajuly2022.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Husband extends BaseModel {
    @OneToOne
    private Wife wife;
}
