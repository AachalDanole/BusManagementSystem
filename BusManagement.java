// interface
public interface BusManagement {
	
		void toAddBusDetails(String driverName, String destination,int busCharge,int totalSeat,String busId);
		void toDisplayAllBusDetails();
		void toDisplayBusDetailsById(String id);
		void toUpdateBus(String busId);
		void toDeleteBusById(String busId);
		void toDeleteBuses();
		void toBookBus();
		void toGetFirstBus();
		void toGetLastBus();
		
		
		void toLogin(String name,String password);
		void toLogout();
		default void rule()
		{
			System.out.println("Keep Distance & Use Sanitizer");		}

	}


