package org.roehampton.sd3.ecoTidy;

public abstract class User {
    private String name;
    private String userId;
    private String email;
    private String phoneNum;

    public User(String name, String userId, String email, String phoneNum){
        this.name = name;
        this.userId = userId;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public String getName(){
        return name;
    }

    public String getUserId(){
        return userId;
    }

    public String getEmail(){
        return email;
    }

    public String getPhoneNum(){
        return phoneNum;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }

    public  void displayInfo(){
        System.out.println(name + ", " + userId + ", " + email + ", " + phoneNum);
    }

//    public void register();
//    public void login();
//    public void Logout();
}
