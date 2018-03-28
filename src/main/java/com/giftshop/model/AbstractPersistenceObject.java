package com.giftshop.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by O HERNANDEZ
 * on 27/03/2018.
 */

@MappedSuperclass
public abstract class AbstractPersistenceObject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id = null;

    public Long getId() {
        return id;
    }

    protected void setId(Long id) {
        this.id = id;
    }
}
