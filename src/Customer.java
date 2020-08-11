import java.sql.*;
public class Customer
 {
	private String name,username,email,password,phonenumber;
        private int userID;
	private double wallet;
	boolean checkTotal(double tripFare)
                /*Checks if total amount is sufficient for booking*/
	{
		if(wallet<300.0||wallet<tripFare)
			return false;
		else
			return true;
	}
        public double getwallet()
        {
            return wallet;
        }
        public String getusername()
        {
            return username;
        }
        public String getname()
        {
            return name;
        }
        public String getphonenumber()
        {
            return phonenumber;
        }
        public int getuserID()
        {
            return userID;
        }
        public String getemail()
        {
            return email;
        }
        public void setname(String name)
        {
            this.name=name;
        }
        public void setusername(String username)
        {
            this.username=username;
        }
        public void setuserID(int userID)
        {
            this.userID=userID;
        }
        public void setpassword(String password)
        {
            this.password=password;
        }
        public void setemail(String email)
        {
            this.email=email;
        }
        public void setphonenumber(String phonenumber)
        {
            this.phonenumber=phonenumber;
        }
        public void setwallet(double wallet)
        {
            this.wallet=wallet;
        }
}
