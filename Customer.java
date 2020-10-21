
public class Customer 
{
 private int cust_id;
 private String cust_name;
 private  String Address;
 private int Phone_no;
 private String Email;
 
 


public Customer()
{
	cust_id = 101;
	cust_name = "shakti";
	Address = "12 no pati shyamnagar latur";
	Phone_no =567890;
	Email = Email;
}
 public int getCust_id() {
		return cust_id;
	}
public void setCust_id(int cust_id) {
	this.cust_id = cust_id;
}
public String getCust_name() {
	return cust_name;
}
public void setCust_name(String cust_name) {
	this.cust_name = cust_name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}

public int getPhone_no() {
	return Phone_no;
}
public void setPhone_no(int phone_no) {
	Phone_no = phone_no;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public void showDetails() {
 
System.out.println("cust_id:"+cust_id+",cust_name:"+cust_name+",address:"+Address+",phone_no:"+Phone_no+",Email:"+Email+" ");
}
}

