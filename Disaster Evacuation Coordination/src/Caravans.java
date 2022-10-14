/*
Name: Mohammad Kumail Kazmi
FIU email: mkazm004@fiu.edu
PantherID: 6357466
CLASS: COP 3337 – Spring 2022
ASSIGNMENT # 1
DATE: April 5th, 2022
I hereby swear and affirm that this work is solely my own, and not the work 
or the derivative of the work of someone else.
*/
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
public class Caravans implements Location {
protected int numCaravans=0,numVehicles=0,numDays=0;
protected boolean A_Used=false, B_Used=false, C_Used=false;
protected int numCompactCar=0, numMidSizeCar=0, numSUV=0, numTruck=0;
protected int numAnimals=0, numDogs=0, numCats=0, numHorses=0;
protected int numtrailer_2=0, numtrailer_4=0;  
protected double nFail=0.0,numSuccessfulTrips=0.0, numTrips=0.0;
protected double Sperc= 0.0, Fperc=0.0;
protected double numFailures=0;
static boolean caravanfull;
static int Caravancount =  0;
protected String temp="";
String [] C;


public class CaravanFullException extends Exception{
	String msg;
	CaravanFullException(String str){
		msg = str;
	}
	public String toString() {
		return ("Caravan Full Exception Occured: "+msg);
	}
}
public String[] Caravan() {
	Scanner input1 = new Scanner(System.in);
	Vehicles v = new Vehicles();
	int spaceleft = 0;
	boolean check = true;
	System.out.println("Day #"+(++numDays));
	
	try {
		System.out.print("Enter number of Caravans: ");
		numCaravans=input1.nextInt();
		if(numCaravans > 3) {
			throw new Exception("Only up to 3 Caravans can go in a day");
		}
	}
	catch (InputMismatchException e) {
		System.out.println("Please enter an integer");
		System.out.print("Enter number of Caravans: ");
		numCaravans=input1.nextInt();
	}
	catch (Exception e) {
	   System.out.println(e.getMessage());
	   System.out.print("Enter number of Caravans: ");
	   numCaravans=input1.nextInt();
	}
	while(numCaravans > 0) {
	for(int i=0;i<numCaravans; i++) {
		System.out.println("Caravan # "+(++Caravancount));
		System.out.print("Enter number of Vehicles: ");
		numVehicles = input1.nextInt();
		input1.nextLine();
		C = new String[10];
		try {
			if (numVehicles>10) {
				throw new CaravanFullException("Only up to 10 Vehicles can go in one Caravan");
			}
		}
		catch(CaravanFullException e) {
			System.out.println(e);
			System.out.print("Enter number of Vehicles: ");
			numVehicles=input1.nextInt();
		}
		
	   
       for(int j=0;j<numVehicles;j++) {	
       C[j]=v.Vehicle();
       System.out.println();
        }
        spaceleft=10-numVehicles;
		System.out.println("Number of spaces left in Caravan: "+spaceleft);
		if(numVehicles == 10) {
			caravanfull=true;
			System.out.println();
			System.out.println("Caravan # "+Caravancount+" is full");
			System.out.println(v.toString());
			System.out.println();
			System.out.println("CARAVAN SORTED");
         	System.out.println(v.sortVehicles());
		    System.out.println();
		    check=false;
		}else {
			System.out.print("Do you want to add more vehicles? (y/n): ");
     		Scanner scnr = new Scanner(System.in);
         	String ch = scnr.nextLine();
			while(ch.equalsIgnoreCase("y")) {
				 for(int index=numVehicles;index<C.length;index++) {	
				       C[index]=v.Vehicle();
				       System.out.println();
				       if(index==9) {
				    	   caravanfull = true;
				    	   System.out.println("Caravan # "+Caravancount+" is full");  
				       }
				  }
				 break;
			}
				System.out.println();
				System.out.println("Caravan # "+Caravancount+" info:");
				System.out.println(v.toString());
				System.out.println();
				System.out.println("CARAVAN SORTED");
             	System.out.println(v.sortVehicles());
             	check=false;
		    }
			    System.out.println();
				Route();
				check=true;
				numCaravans--;
				continue;
	}
				System.out.println();
		}
			this.numHorses=v.numHorses;
			this.numDogs=v.numDogs;
			this.numCats=v.numCats;
			this.numCompactCar=v.numCompactCar;
			this.numMidSizeCar=v.numMidSizeCar;
			this.numSUV=v.numSUV;
			this.numTruck=v.numTruck;
			this.numtrailer_2=v.numtrailer_2;
			this.numtrailer_4=v.numtrailer_4;
			
	return C;
 }

@Override
public void Route(){
	Scanner input2 = new Scanner(System.in);
	Random rnd = new Random();
	String route;

	

	if(caravanfull == true) {
		System.out.print("Do you want to send the caravan to a route?(s to send/n to not): ");
		if(input2.nextLine().equalsIgnoreCase("s")){
			System.out.print("Choose the route you want the caravan to go(A,B,C): ");
			route=input2.nextLine();
			if(route.equalsIgnoreCase("A")) {
				if(A_Used == false) {
					A_Used=true;
					System.out.println("Caravan # "+Caravancount+" is sent to route A");
					System.out.println("Now, route A cannot be used until next day");
					numTrips++;
					Probability(route);

				}
				else {
					System.out.println("Route A has been used");
					System.out.print("Choose another route B or C: ");
					route=input2.nextLine();
					if(route.equalsIgnoreCase("B")) {
					System.out.println("Caravan # "+Caravancount+" is sent to route B");
					System.out.println("Now, route B cannot be used until next day");
					numTrips++;
					Probability(route);
					}
					else {
						System.out.println("Caravan # "+Caravancount+" is sent to route C");
						System.out.println("Now, route C cannot be used until next day");
						numTrips++;
						Probability(route);
					}
				}
			}
			else if(route.equalsIgnoreCase("B")) {
				if(B_Used==false) {
				B_Used=true;
				System.out.println("Caravan # "+Caravancount+" is sent to route B");
				System.out.println("Now, route B cannot be used until next day");
				numTrips++;
				Probability(route);
			}
				else {
					System.out.println("Route B has been used");
					System.out.print("Choose another route A or C: ");
					route=input2.nextLine();
					if(route.equalsIgnoreCase("A")) {
					System.out.println("Caravan # "+Caravancount+" is sent to route A");
					System.out.println("Now, route A cannot be used until next day");
					numTrips++;
					Probability(route);
					}
					else {
						System.out.println("Caravan # "+Caravancount+" is sent to route C");
						System.out.println("Now, route C cannot be used until next day");
						numTrips++;
						Probability(route);
					}
				}
			}
			else if(route.equalsIgnoreCase("C")) {
				if(C_Used == false) {
					C_Used=true;
				    System.out.println("Caravan # "+Caravancount+" is sent to route C");
				    System.out.println("Now, route C cannot be used until next day");
				    numTrips++;
					Probability(route);
				}
				else {
					System.out.println("Route C has been used");
					System.out.print("Choose another route A or B: ");
					route=input2.nextLine();
					if(route.equalsIgnoreCase("A")) {
					System.out.println("Caravan # "+Caravancount+" is sent to route A");
					System.out.println("Now, route A cannot be used until next day");
					numTrips++;
					Probability(route);
					}
					else {
						System.out.println("Caravan # "+Caravancount+" is sent to route B");
						System.out.println("Now, route B cannot be used until next day");
						numTrips++;
						Probability(route);
					}
				}
			}
			}
		System.out.println("No. of Failures: "+nFail+" and No. of Successes: "+numSuccessfulTrips);
		}else {
			System.out.println("Ok! Thank you");
		}
	}

	public void Probability(String str) {
	  Random rnd = new Random();
	  double chance=0.0;
      boolean chanceFailure=rnd.nextBoolean();
      if(str.equalsIgnoreCase("A")) {
      if(chanceFailure==true) {
			chance=0.2;
			numFailures=numTrips*chance;
		    numFailures=Math.round(numFailures);
		    nFail++;
		    System.out.println("Trip Failed");
		}
		else {
		     numSuccessfulTrips++;
		     System.out.println("Trip Succesful");
		}
      }
      else if(str.equalsIgnoreCase("B")) {
    	  if(chanceFailure==true) {
				chance=0.3;
				numFailures=numTrips*chance;
				numFailures=Math.round(numFailures);
				nFail++;
				System.out.println("Trip Failed");
			}
			else {
				numSuccessfulTrips++;
				System.out.println("Trip Succesful");
			}
      }
      else if(str.equalsIgnoreCase("C")) {
    	  if(chanceFailure==true) {
				chance=0.5;
				numFailures=numTrips*chance;
				numFailures=Math.round(numFailures);
				nFail++;
				System.out.println("Trip Failed");		
		    }
			else {
				numSuccessfulTrips++;
				System.out.println("Trip Succesful");
			}
      }
     }
      
      @Override
      public String toString() {
      	return "Number of Compact Cars: " + numCompactCar + ", Number of Mid-Size Cars: " + numMidSizeCar + ", Number of SUVs: " + numSUV
      			+ ", Number of Trucks: " + numTruck + "\nTotal Number of Animals Saved: " + (numHorses+numCats+numDogs) + ", Number of Total Dogs Saved: " + numDogs + ", Number of Total Cats Saved: " + numCats
      			+ ", Number of Total Horses Saved: " + numHorses + "\nNumber of Size 2 Trailers: " + numtrailer_2 + ", Number of Size 4 Trailers: " +numtrailer_4;
      }
      public String userClassification() {
    	  if(numSuccessfulTrips<6) {
    		  return "Beginner";
    	  }
    	  else if(numSuccessfulTrips>=7 && numSuccessfulTrips<=12) {
    		  return "Amateur";
    	  }
    	  else if(numSuccessfulTrips>=13 && numSuccessfulTrips<=18) {
    		  return "Intermediate";
    	  }
    	  else if(numSuccessfulTrips>=19 && numSuccessfulTrips<=24) {
    		  return "Advanced";
    	  }
    	  else if(numSuccessfulTrips>=25) {
    		  return "Expert";
    	  }
    	  else {
    		  return "No experience";
    	  }
      }
  }
  



