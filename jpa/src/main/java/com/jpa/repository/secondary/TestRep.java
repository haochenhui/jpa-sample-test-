package com.jpa.repository.secondary;

import com.jpa.domain.secondary.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hch on 2017/6/14.
 */
//@Repository
public interface TestRep extends JpaRepository<Test,Integer>{
}
