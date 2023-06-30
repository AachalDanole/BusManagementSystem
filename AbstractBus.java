// Abstrct class 
abstract public class AbstractBus implements BusManagement {
	
	@Override
	public void toLogin(String name,String password )
	{
		if(name.equals("Aachal") && password.equals("XYZ123"))
		{
		 System.out.println("======== Logged in Sucessfully========");
		}
		 else
		 {
			 System.out.println("Enter valid username and password");
		 }	 
		
		
	}
	@Override
	public void toLogout()
	{
		System.out.println("Thank you....!!");
	}

	
	
	
}
