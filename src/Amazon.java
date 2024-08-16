import Services.IDeliveryService;

public class Amazon 
{
	private IDeliveryService service;
	
	
	//Constructor Injection
	public Amazon(IDeliveryService service) {
		super();
		this.service = service;
	}
	
	

	public Amazon() {
		super();
		
	}



	//Setter Injection
	public void setService(IDeliveryService service) //IDeliveryService service=new FedEx()
	{
		this.service = service;
	}
	
	//this keyword is use to take the value from the parameter and give it to the instance variable

	public Boolean deliverTheProduct(Double amount)
	{
//		Boolean status=service.deliveryProduct(amount);
//		return status;
		return service.deliveryProduct(amount);
		
	}

}
