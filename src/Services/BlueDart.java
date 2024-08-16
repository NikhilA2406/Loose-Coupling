package Services;

public class BlueDart implements IDeliveryService {

	@Override
	public Boolean deliveryProduct(Double amount) 
	{
		System.out.println("The Product is delivered using BlueDart Service and amount is "+amount);
		return true;
	}

}
