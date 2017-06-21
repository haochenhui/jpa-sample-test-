package com.jpa.domain.secondary;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by breeze on 2017/2/22.
 */
@Entity
@Table
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date create_time;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Test(Date create_time) {
        this.create_time = create_time;
    }
}
