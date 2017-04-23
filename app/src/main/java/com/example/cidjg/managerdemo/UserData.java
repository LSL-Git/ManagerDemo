package com.example.cidjg.managerdemo;

/**
 * Created by CIDjg on 2017/4/20.
 */
public class UserData {
    private String userName;                  //用户名
    private String userPwd;                   //用户密码
    private int userId;                       //用户ID号
    public int pwdresetFlag=0;
    //获取用户名
    public String getUserName() {
        return userName;
    }
    //设置用户名
    public void setUserName(String userName) {
        this.userName = userName;
    }
    //获取用户密码
    public String getUserPwd() {
        return userPwd;
    }
    //设置用户密码
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
    //获取用户id
    public int getUserId() {
        return userId;
    }
    //设置用户id
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public UserData(String userName, String userPwd) {  //这里只采用用户名和密码
        super();
        this.userName = userName;
        this.userPwd = userPwd;
    }

}


