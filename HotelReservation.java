package jaime;

import java.util.*;

public class HotelReservation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] hotel = new int [7][5];
		
		boolean run = true;
		
		while(run) {
			System.out.print("=== Hotel Reservation ===");
			System.out.print("\n1.Views Room\n2. Check In\n3. Check Out\n4. Exit\n");
			System.out.print("Enter your choice: ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				for (int i = 0; i<hotel.length; i++) {
					System.out.print("Floor " + (7-1) + ": ");
					for (int j = 0; j<hotel[i].length; j++) {
						System.out.print(" [" + hotel[i][j] + "]");
					}
					System.out.println();
				} 
				
				break;
				
				
			case 2:
				System.out.print("Enter Floor (1-7): ");
				int floor = sc.nextInt();
				System.out.print("Enter Room (1-5): ");
				int room = sc.nextInt() -1;
				
				if (floor >= 0 && floor <7 && room >= 0 && room <5) {
					if (hotel[floor][room] == 0) {
						hotel[floor][room] = 1;
						System.out.println("\nCheck-In Successful!");
					} else {
						System.out.println("Room already Occupied.");
					}
					} else {
						System.out.println("Invalid Floor or Room Number.");
					}
				
				System.out.println();
				
				break;
				
				
			case 3:
				System.out.print("Enter Floor (1-7): ");
				int floor1 = sc.nextInt();
				System.out.print("Enter Room (1-5): ");
				int room1 = sc.nextInt() -1;
				
				if (floor1 >= 0 && floor1 <7 && room1 >= 0 && room1 <5) {
					if (hotel[floor1][room1] == 1) {
						hotel[floor1][room1] = 0;
						System.out.println("\nCheck-Out Successful!");
					} else {
						System.out.println("Room already Empty.");
					}
					} else {
						System.out.println("Invalid Floor or Room Number.");
					}
				
				System.out.println();
				
				break;
				
			case 4:
				System.out.println("\n!Thank you for Reserving at our Hotel!");
				run = false;
				
				break;
				
			default:
				System.out.println("Invalid Choices!!");
				break;
				
				}
						
					
				
			}
		}
		
		
		
	}


