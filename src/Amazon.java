import Services.IDeliveryService;

public class Amazon 
{
	private IDeliveryService service;
	
//	//Constructor Injection
//		public Amazon(IDeliveryService service) {
//			super();
//			this.service = service;
//		}
//		
//		public Amazon() 
//		{
//			
//		}
	//Setter Injection
	public void setService(IDeliveryService service) //IDeliveryService service=new FedEx()
	{
		this.service = service;
	}
	
	//this keyword is use to take the value from the parameter and give it to the instance variable

	public Boolean deliverTheProduct(Double amount)
	{

		return service.deliveryProduct(amount);
		
	}

}
