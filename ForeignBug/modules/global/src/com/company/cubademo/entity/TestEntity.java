package com.company.cubademo.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "CUBADEMO_TEST_ENTITY")
@Entity(name = "cubademo_TestEntity")
public class TestEntity extends StandardEntity {
    private static final long serialVersionUID = 7497515651887369143L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "A_ID", unique = true)
    protected ForeignEntity a;

    @Column(name = "B")
    protected String b;

    public void setA(ForeignEntity a) {
        this.a = a;
    }

    public ForeignEntity getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

}