public class Persn{
	private String name;
	private String email;
	
	Persn(String name,String email){
	this.name=name;
	this.email=email;
	}
	
	public void setname(String name){
	this.name=name;
	}
	
	public String getname(){
	return name;
	}
	public String getemail(){
	return email;
	}
	@Override
public String toString(){
	return "The name of auther is: "+name+"\the email of auther is: "+email;
	
}
	@Override
public Object clone(){
	return new Persn(getname(),getemail());
	}
}