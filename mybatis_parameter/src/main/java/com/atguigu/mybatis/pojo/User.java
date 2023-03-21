package com.atguigu.mybatis.pojo;

/**
 * @author Happy Day !
 * @createTime 2023-03-21 17:54
 */
public class User {
     private  Integer id;
     private  String username;
     private  String password;
     private  Integer age;
     private  String  gender;
     private  String email;

     public User() {

     }

     public User(Integer id, String username, String password, Integer age, String gender, String email) {
          this.id = id;
          this.username = username;
          this.password = password;
          this.age = age;
          this.gender = gender;
          this.email = email;
     }

     @Override
     public String toString() {
          return "User{" +
                  "id=" + id +
                  ", username='" + username + '\'' +
                  ", password='" + password + '\'' +
                  ", age=" + age +
                  ", gender='" + gender + '\'' +
                  ", email='" + email + '\'' +
                  '}';
     }

     public void setId(Integer id) {
          this.id = id;
     }

     public void setUsername(String username) {
          this.username = username;
     }

     public void setPassword(String password) {
          this.password = password;
     }

     public void setAge(Integer age) {
          this.age = age;
     }

     public void setGender(String gender) {
          this.gender = gender;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     public Integer getId() {
          return id;
     }

     public String getUsername() {
          return username;
     }

     public String getPassword() {
          return password;
     }

     public Integer getAge() {
          return age;
     }

     public String getGender() {
          return gender;
     }

     public String getEmail() {
          return email;
     }
}
