package com.jpa.repository.primary;

import com.jpa.domain.primary.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hch on 2017/6/14.
 */
//@Repository
public interface UserRep extends JpaRepository<User,Integer>{
}
