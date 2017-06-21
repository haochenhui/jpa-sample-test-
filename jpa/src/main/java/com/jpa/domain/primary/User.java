package com.jpa.domain.primary;



import javax.persistence.*;


//jpa默认命名规范是属性名全小写。
@Entity
@Table
public class User{

  @Id @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private String username,password;

  public User(){}

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public User(String username, String password) {
    this.username = username;
    this.password = password;
  }
}
