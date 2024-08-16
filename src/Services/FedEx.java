package Services;

public class FedEx implements IDeliveryService {

	@Override
	public Boolean deliveryProduct(Double amount) 
	{
		System.out.println("The Product is delivered using FedEx Service and amount is "+amount);
		return true;
	}

}
