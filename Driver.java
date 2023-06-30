
//main class
	import java.util.ArrayList;
	import java.util.Scanner;

	public class Driver {
		private static final Scanner scan = new Scanner(System.in);
		private static final Bus obj1 = new Bus();
		static void showMenu() {
			System.out.println("Press 1 to Login");
			System.out.println();
			System.out.println("Press 2 to Add your bus ");
			System.out.println();
			System.out.println("Press 3 to Book your bus ");
			System.out.println();
			System.out.println("Press 4 to show bus Details by id");
			System.out.println();
			System.out.println("Press 5to update bus");
			System.out.println();
			System.out.println("Press 6 to show All bus Details  ");
			System.out.println();
			System.out.println("Press 7 to deletebus by id");
			System.out.println();
			System.out.println("Press 8 to delete all bus");
			System.out.println();
			System.out.println("Press 9 to get First bus");
			System.out.println();
			System.out.println("Press 10 to get Last bus");
			System.out.println();
			System.out.println("Press 11 to Sort bus");
			System.out.println();
			System.out.println("Press 12 to Logout");
			System.out.println();
		}

		public static void main(String args[]) {
			
			int option;
			do { /// login 
				showMenu();
				System.out.print("=====Enter your option=====");
				option = scan.nextInt();
				switch(option) {
				case 1: //login
					System.out.println("Enter the username");
					String name = scan.next();
					System.out.println("Enter the password");
					String password = scan.next();
					obj1.toLogin(name, password);
					break;
					
					
					
				case 2:               // to add new  buses                                 
					
					System.out.println("Add Bus");
					
					System.out.println("Enter Drivername");
					String driverName = scan.next(); 
					
					System.out.println("Enter the destination");
					String destinationName = scan.next();
					
					System.out.println("Enter bus charge");
					int busCharge = scan.nextInt();
					
					System.out.println("Enter total seats");
					int totalSeat = scan.nextInt();
					
					System.out.println(" Enter Bus Id");
					String busId = scan.next();
					
					

					obj1.toAddBusDetails( driverName, destinationName,busCharge, totalSeat,busId);
				    break;
				    
				case 3:	
					// Book bus 
					obj1.toBookBus();
						break;
					
					
				case 4:	
					// Show data by Specific id
					System.out.println("Enter bus Id ");
						String id;
						id=scan.next();
						obj1.toDisplayBusDetailsById(id);
						break;
						
				case 5:
					
					// update bus
					System.out.println("Enter bus Id to update details");
			         String busId2 ;
			         busId2= scan.next();
					
					obj1.toUpdateBus(busId2);
					break;
					
	
				case 6:
					/// Show all bus data  
					System.out.println("Enter your designation..");
					String designation = scan.next();
					System.out.println("Enter your passcode..");
					int passcode = scan.nextInt();
					String checkdesignation="Admin";
					int checkpassword=0000;
					
					
					if(designation.equalsIgnoreCase(checkdesignation) && checkpassword==passcode) 
					{
					obj1.toDisplayAllBusDetails();
					}
						break;
						
						
				case 7:
					// * Delete Some Records*/
						System.out.println("Delete the Bus by id:");
						System.out.println("Enter the bus ID");
						String busId1=scan.next();
						System.out.println("Delete the busby id:");
						obj1.toDeleteBusById(busId1);
						break;
						
						
						
				case 8:
					// * Delete All Records*/
					System.out.println("Delete All Bus:");
					obj1.toDeleteBuses();
					break;
					
					
				case 9:   // get 1st bus
					obj1. toGetFirstBus() ;
					break;
					
				case 10:   // get last bus
					obj1. toGetLastBus() ;
					break;
					
					
				case 11:   // sort bus
					obj1. toSort() ;
					break;
					 
				case 12:
					/*Logout*/
					obj1.toLogout();
					break;
					
					
				
				default :
					
						System.out.println("Enter proper options...");
				}
			}
			while(option != 12);
		}
	}


