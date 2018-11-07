package com.kg.springjdbc;

import org.springframework.jdbc.core.JdbcTemplate;
  
public class LoginDao {
private JdbcTemplate jdbcTemplate;  
  
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
    this.jdbcTemplate = jdbcTemplate;  
}  


  
public int savelogin(Login e){  
    String query="insert into login values('"+e.getuserid()+"','"+e.getusername()+"','"+e.getpassword()+"')";  
    return jdbcTemplate.update(query);  
}  
public int updatelogin(Login e){  
    String query="update login set username='"+e.getusername()+"',password='"+e.getpassword()+"' where userid='"+e.getuserid()+"' ";  
    return jdbcTemplate.update(query);  
}  
public int deletelogin(Login e){  
    String query="delete from login where userid='"+e.getuserid()+"' ";  
    return jdbcTemplate.update(query);  
}  
  
}  