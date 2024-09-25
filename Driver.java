public class Driver{
		
	
	public static void main(String args[]){
	
	Persn p1=new Persn("noor","noor@gmail.com");
	Persn p2=(Persn)p1.clone();
	System.out.println(p1);
	System.out.println(p2);

	
	Book b1=new Book("book_name1","id_1","tittle_1",p1);
	//making a clone of book 1 in book 2
	Book b2=(Book)b1.clone();
	System.out.println("                            .............Displaying book 1............................");
	//printing book 1
	System.out.println(b1);
	
	System.out.println("                            ..............Displaying book 2...........................");
	//printing book 2
	System.out.println(b2);
	
	System.out.println("                            ...............Equal or not!..........................");
	if(b1.equals(b2)){
	
	System.out.println("The books are same");

	}
	else
	{System.out.println("The books are not same");
	}



	
	//changing the auther name  of book 2.
	b2.getauther().setname("Maheen");
	b2.setTittle("Tittle2");
	//displaying b1 and b2 after changing the name
	System.out.println("                            ..............After change book 1..........................");

	System.out.println(b1);
	System.out.println("                            ...............After change book 2..........................");
	System.out.println(b2);
	

	System.out.println("                            ...............Equal or not!................................");
	if(b1.equals(b2)){
	
	System.out.println("The books are same");

	}
	else
	System.out.println("The books are not same");
	
	
	
	
	
	}
	
	
	}