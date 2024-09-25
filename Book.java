public class Book{

	private String name;
	private String id;
	private String tittle;
	private Persn auther;
	
	Book(String name,String id,String tittle,Persn auther){
	this.name=name;
	this.id=id;
	this.tittle=tittle;
	this.auther=auther;
	
	}
	public void setTittle(String tittle){
	this.tittle=tittle;
	}
	
	public String getname(){
	return name;
	}
	public String getid(){
	return id;
	}
	public String gettittle(){
	return tittle;
	}
	public Persn getauther(){
	return auther;
	}
	
	@Override
	public String toString(){
	return"The name of book is: "+getname()+"\nBook id:"+getid()+"\nBook tittle:"+gettittle()+"\nAuther name: "+auther.getname()+"\nAuther email: "+auther.getemail();
	}

	@Override
	public Object clone(){
	
	return new Book(name,id,tittle,(Persn)auther.clone());
	}
	
	@Override
	public boolean equals(Object obj){
	
	Book b=(Book)obj;
	return this.getauther().getname().equals(b.getauther().getname());
	
	
	}









	}













