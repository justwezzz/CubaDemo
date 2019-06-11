package com.company.cubademo.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "CUBADEMO_FOREIGN_ENTITY")
@Entity(name = "cubademo_ForeignEntity")
public class ForeignEntity extends StandardEntity {
    private static final long serialVersionUID = 2706980504979786346L;

    @Column(name = "F")
    protected String f;

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }
}