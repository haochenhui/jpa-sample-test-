package com.jpa;

import com.jpa.domain.primary.User;
import com.jpa.domain.secondary.Test;
import com.jpa.repository.primary.UserRep;
import com.jpa.repository.secondary.TestRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
//	@PersistenceUnit
//	private EntityManagerFactory emf;
//	@Autowired
//	TestRep testRep;
	@Autowired
	UserRep userRep;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Override
	public void run(String... strings) throws Exception {
		User user1 = new User("username", "password");
		User user = userRep.save(user1);
//		Test test = testRep.save(new Test(new Date()));
//		Query nativeQuery = emf.createEntityManager().createNativeQuery("SELECT id,createtime FROM test");
//		List<Test> resultList = nativeQuery.getResultList();
//		System.out.println(resultList.get(0).getCreate_time());
	}
}
