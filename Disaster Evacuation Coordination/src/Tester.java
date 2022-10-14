/*
Name: Mohammad Kumail Kazmi
FIU email: mkazm004@fiu.edu
PantherID: 6357466
CLASS: COP 3337 � Spring 2022
ASSIGNMENT # 1
DATE: April 5th, 2022
I hereby swear and affirm that this work is solely my own, and not the work 
or the derivative of the work of someone else.
*/
import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		int daycounter=0;
		Scanner input = new Scanner(System.in);
		String choice;
		System.out.println("Welcome to the Disaster Evacuation App!!!");
		System.out.print("Please enter your name: ");
		String coordinatorName = input.nextLine();
		 Caravans C = new Caravans();
		while(coordinatorName.equals("")) {
			System.out.println("Must enter name");
			System.out.print("Please enter your name: ");
		    coordinatorName = input.nextLine();
		}
		System.out.println("Hello "+coordinatorName+ "!" );
		System.out.println("We appreciate your efforts in helping rescue cute fuzzy animals."); 
		System.out.println("A disaster has struck and we need to evacuate the animals immediately.");
		System.out.println("Let's begin!");
		do {
		System.out.println("You are on day # "+(++daycounter));
		System.out.println("Create a New Caravan(Press C)");
		System.out.println("Quit the Program(Press Q)");
		System.out.print("Choose(C or Q): ");
	    choice = input.next();
	    System.out.println();
	    if(choice.equals("C")) {	 
		C.Caravan();	
	    }
	   else if(choice.equals("Q")) {
       System.out.println("Thank you for Saving Cute Fuzzy Animals");
       }
	    else {
	    	System.out.println("Invalid choice! Please re-enter choice.");
	    	--daycounter;
	    }
		}while(!(choice.equals("Q")));
		System.out.println("You have saved animals for "+C.numDays+ " days");
		System.out.println(C.toString());
		System.out.println("Total number of Trips: "+C.numTrips);
		System.out.println("Total number of Successful Trips: "+C.numSuccessfulTrips);
		System.out.println("Success Percentage: "+((C.numSuccessfulTrips/C.numTrips)*100)+ "%");
		System.out.println("Total number of Failed Trips: "+C.nFail);
		System.out.println("Failure Percentage: "+((C.nFail/C.numTrips)*100)+ "%");
		System.out.println("User Classification: "+C.userClassification());
	}

}
