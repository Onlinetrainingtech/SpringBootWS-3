package com.example.EveSpringB2Rest;

public class User
{
   private int userid;
   private String uname;
   private String useremail;
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUseremail() {
	return useremail;
}
public void setUseremail(String useremail) {
	this.useremail = useremail;
}
public User(int userid, String uname, String useremail) {
	super();
	this.userid = userid;
	this.uname = uname;
	this.useremail = useremail;
}
   
   public User()
   {
	   
   }
}
