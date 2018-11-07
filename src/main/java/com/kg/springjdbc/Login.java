package com.kg.springjdbc;

public class Login {
    private int userid;  
    private String username;  
    private String password;  

    //no-arg and parameterized constructors  
    //getters and setters  
    Login() {
    }
    Login(int userid,String username,String password){
        this.userid=userid;
        this.username=username;
        this.password=password;
    }
    /**
     * @return the userid
     */
    public int getuserid() {
        return userid;
    }
    /**
     * @param userid the userid to set
     */
    public void setuserid(int userid) {
        this.userid = userid;
    }
    /**
     * @return the username
     */
    public String getusername() {
        return username;
    }
    /**
     * @param username the username to set
     */
    public void setusername(String username) {
        this.username = username;
    }
    /**
     * @return the password
     */
    public String getpassword() {
        return password;
    }
    /**
     * @param password the password to set
     */
    public void setpassword(String password) {
        this.password = password;
    }
    
    }