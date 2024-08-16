import Services.BlueDart;
import Services.FirstFlight;

public class LaunchApp {

	public static void main(String[] args) 
	{
		//Target Class
		Amazon amz=new Amazon(new FirstFlight());//Constructor Dependency Injection.
		
		//FedEx, BlueDart, FirstFlight are Dependent Object whose method are used.
		//amz.setService(new FedEx());
		amz.setService(new BlueDart());//Setter Dependency Injection.
		//Inserting Dependent Object to the Target Class Known as Dependency Injection.
		Boolean status=amz.deliverTheProduct(454.4);
		
		if(status)
			System.out.println("Delivered Successfully");
		else
			System.out.println("Failed to Deliver");

	}

}
