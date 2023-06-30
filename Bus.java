
//Bus class 

import java.util.*;
import java.lang.*;

public class Bus extends AbstractBus implements Comparable <Bus> {
        private String adminName,password,busId3;
		private String sourceName,destinationName,customrDestinationName;
		private int busCharge;
		private int mobileNo,age,noOfPassenger;
		private  int totalSeat;
		
		private String driverName,busId;
		private String customerName;
		private static final Scanner scan = new Scanner(System.in); 
		private List<Bus> busList = new ArrayList<Bus>();

			Bus(){
				 rule();
			}

			public Bus(String driverName, String destinationName,int busCharge,int totalSeat)
			{
				this.driverName = driverName;
				this.destinationName = destinationName;
				this.busCharge = busCharge;
				this.totalSeat = totalSeat;
			}
			
			public Bus(String driverName, String destinationName,int busCharge,int totalSeat,String busId)
			{
				this( driverName, destinationName,busCharge,totalSeat);
				this.busId=busId;

			}

			public String getbusId() {
				return busId;
			}
			
			public String getbusDestination() {
				return destinationName ;
			}

			
			 // to add new  buses
			@Override
			public void toAddBusDetails(String driverName, String destinationName,int busCharge,int totalSeat,String busId ) 
			{
				Bus obj = new Bus(driverName,destinationName,busCharge,totalSeat,busId);
				busList.add(new Bus(driverName,destinationName,busCharge,totalSeat,busId));
			}
			
			
			
			
			 // to display all  bus details
			
			@Override
			public void toDisplayBusDetailsById(String id)
			{
				Iterator <Bus> busListRef = busList.iterator();
				boolean flag = false;
						while (busListRef.hasNext())
						{
							Bus bus= busListRef.next(); 
						
						
						if (bus.getbusId().equalsIgnoreCase(id))
						{

						flag = true;
					
						System.out.println(bus);
						break;
				
						}
						} 
				
				
			}
              // to display all bus details
			@Override
			public void toDisplayAllBusDetails() {
				Iterator<Bus> busListRef = busList.iterator();

				while(busListRef.hasNext()) {
					System.out.println(busListRef.next());
				}
			}
			
			public String toString()
			{
				return driverName + " " + destinationName + " " + busCharge +" "+ totalSeat +" "+ busId;
				
			}
			
			
			
			
			 // to delete specific  bus
			
			
			
				@Override
			public void toDeleteBusById(String busId) {
				Iterator<Bus> busListRef = busList.iterator();
				boolean flag = false;
				int index = -1;
				while(busListRef.hasNext()) {
					Bus bus1 = busListRef.next();
					index++;
					if(bus1.getbusId().equalsIgnoreCase(busId)) {
						flag = true;
						busList.remove(index);
						System.out.println("record deleted");
						break;
					}
				}
				if(flag == false)
					System.out.println("Bus id  not found");
			}
			
				
				
				
				 // to update  bus
			@Override
			public void toUpdateBus(String busId) {
				
				Iterator<Bus> busListRef = busList.iterator();
				boolean flag = false;
				int index = -1;
				while(busListRef.hasNext()) {
					index++;
					Bus bus1 = busListRef.next();
					if(bus1.getbusId().equalsIgnoreCase(busId)) {
						flag = true;
						
						System.out.println("Enter Drivername");
						String driverName = scan.next(); 
						
						System.out.println("Enter the destination");
						String destinationName = scan.next();
						
						System.out.println("Enter bus charge");
						int busCharge = scan.nextInt();
						
						System.out.println("Enter total seats");
						int totalSeat = scan.nextInt();
						
						
						
						busList.set(index, new Bus(driverName,destinationName,busCharge,totalSeat,busId));
						System.out.println("record updated");
						break;
					}
				}
				if(flag == false)
					System.out.println("Bus not found");
			}
			
			
			
			
			 // to print book bus
			
			
             public void toBookBus()
             {
            	 System.out.println("Enter name"); 
            	 customerName=scan.next();
            	 
            	 System.out.println("Enter Mobile");  
            	 mobileNo=scan.nextInt();
            	 
            	 
            	 System.out.println("Enter your Destination"); 
            	 customrDestinationName = scan.next();
            	 
            	 System.out.println("Enter your number of passengers"); 
            	 noOfPassenger = scan.nextInt();
            	 
            	 
            	 Iterator <Bus> busListRef = busList.iterator();
 				boolean flag = false;
            	 while (busListRef.hasNext())
					{
						Bus bus1 = busListRef.next(); 
					
					
					if (bus1.getbusDestination().equalsIgnoreCase( customrDestinationName)  )
					{

					   
						   System.out.println( "Your booking is confirmed for"+ "  "+customrDestinationName);
						   
					   }
					   else
					   {
						   System.out.println( "Sorry no bus available");
					   }

				
			
					
					}
            	 
            	 
            	 
            	 
              }
             
             
             
             
             // to print first bus
             
             public void toGetFirstBus() 
             {
            	 if (!busList.isEmpty())

            		 System.out.println( busList.get(0));



            		 else

            		 System.out.println("There is no bus .....!!");
            	 
            	 
             }
             
             
             // to print last bus
             
             public void toGetLastBus()
             {
            	 
            	 if (!busList.isEmpty())

            		 System.out.println( busList.get(busList.size()-1));
                 else

            		 System.out.println("No buses are  avilable....!! ");
            	 
            	 
            	 
             }
             
            public int getbusCharge()
            {
            	return busCharge;
            }
             
             
            // to sort bus 
             public void toSort()
             { 
            	 
            	 Collections.sort(busList);
            	 toDisplayAllBusDetails();
            	 
             }
             
             
             
             // to compare bus by id
             public int compareTo(Bus busobj) {
         		
         		int  cost = busobj.getbusCharge();
         		return this.busCharge - cost;  
         	}

			@Override
			public void toDeleteBuses() {
				// TODO Auto-generated method stub
				
			}

			

			
		


			
			
		
		}
		

	



