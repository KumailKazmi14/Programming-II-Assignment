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
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Vehicles extends Caravans implements NumberAnimals {
   static boolean suv_trailer;
   static boolean truck_trailer;
   
   public String compactCar() {
	   int ndogs=0, ncats=0;
	   Random rnd = new Random();
	   Scanner input = new Scanner(System.in);
	  Vehicles[] compactCar = new Vehicles[2];
	  System.out.println("Compact Car");
	  try {
	  System.out.print("Enter the number of animals: ");
	  super.numAnimals=input.nextInt();
	  }
	  catch (InputMismatchException e) {
		  input.nextLine();
		  System.out.println("Please enter an integer");
		  System.out.print("Enter the number of animals: ");
		  super.numAnimals = input.nextInt();
	  }
	  while(numAnimals > 2) {
		  System.out.println("Compact Car can only evacuate upto 2 animals");
		  System.out.print("Enter the number of animals: ");
		  super.numAnimals=input.nextInt();
	  }
	  for (int i = 0; i < numAnimals; i++) {
		int  j = rnd.nextInt(numAnimals);
		if (j == 0) {
			Dogs d = new Dogs();
			compactCar[i] = d;
			d.Print();
		    super.numDogs++;
		    ndogs++;
		}
		else {
			Cats c = new Cats();
			compactCar[i] = c;
			c.Print();
		    super.numCats++;
		    ncats++;
		}
	  }
	
	  System.out.println("Compact Car carries "+ndogs+" dogs and "+ncats+" cats");
	  return arrayToString(compactCar);
   }  
   
   public String midSizeCar() {
	   Random rnd = new Random();
	   int ndogs=0, ncats=0;
	   Scanner input = new Scanner(System.in);
	  Vehicles[] midSizeCar = new Vehicles[5];
	  System.out.println("Mid-Size Car");
	  try {
	  System.out.print("Enter the number of animals: ");
	  super.numAnimals=input.nextInt();
	  }
	  catch (InputMismatchException e) {
		  input.nextLine();
		  System.out.println("Please enter an integer");
		  System.out.print("Enter the number of animals: ");
		  super.numAnimals = input.nextInt();
	  }
	  while(numAnimals > 5) {
		  System.out.println("Mid-Size Car can only evacuate upto 5 animals");
		  System.out.print("Enter the number of animals: ");
		  super.numAnimals=input.nextInt();
	  }
	  for (int i = 0; i < numAnimals; i++) {
		int  j = rnd.nextInt(numAnimals);
		if (j == 0 || j == 1) {
			Dogs d = new Dogs();
			midSizeCar[i] = d;
			d.Print();
		    super.numDogs++;
		    ndogs++;
		}
		else {
			Cats c = new Cats();
			midSizeCar[i] = c;
			c.Print();
		    super.numCats++;
		    ncats++;
		}
	  }
	
	  System.out.println("Mid-Size Car carries "+ndogs+" dogs and "+ncats+" cats");
	  return arrayToString(midSizeCar);
   }  
   public boolean SUVhasTrailer() {
	   Random rnd = new Random();
	   if(rnd.nextBoolean() == true) {
		   suv_trailer = true;
		   
           return suv_trailer;
	   }
	   else {
		   suv_trailer = false;
		   return suv_trailer;
	   }
   }
   public String SUV() {
	   int ndogs=0, ncats=0, nhorses=0;
	   int trailerLength = 0;
	   int trailerCapacity;
	   Random rnd = new Random();
	   Scanner input = new Scanner(System.in);
	   Vehicles[] SUV = new Vehicles[10];
	   System.out.println("SUV");
	   SUVhasTrailer();
	  if(suv_trailer == false) {
	  System.out.println("SUV does not have trailer");
	  try {
	  System.out.print("Enter the number of animals: ");
	  super.numAnimals=input.nextInt();
	  }
	  catch (InputMismatchException e) {
		  input.nextLine();
		  System.out.println("Please enter an integer");
		  System.out.print("Enter the number of animals: ");
		  super.numAnimals = input.nextInt();
	  }
	  while(numAnimals > 10) {
		  System.out.println("SUV can only evacuate upto 10 animals");
		  System.out.print("Enter the number of animals: ");
		  super.numAnimals=input.nextInt();
	  }
	  for (int i = 0; i < numAnimals; i++) {
		int  j = rnd.nextInt(numAnimals);
		if (j == 0 || j==1 || j==2 || j==3 || j==4) {
			Dogs d = new Dogs();
			SUV[i] = d;
			d.Print();
		    super.numDogs++;
		    ndogs++;
		}
		else{
			Cats c = new Cats();
			SUV[i] = c;
			c.Print();
		    super.numCats++;
		    ncats++;
		}
	  }
	
	  System.out.println("SUV carries "+ndogs+" dogs and "+ncats+" cats");
   }
	  else if(suv_trailer == true) {
		  numtrailer_2++;
		  System.out.println("SUV has a trailer");
		  trailerLength = 20+rnd.nextInt(10);
		  trailerCapacity = 2;
          System.out.println("Trailer length: "+trailerLength+" ft");
          System.out.println("Trailer capacity: "+trailerCapacity+" spaces");
		  try {
			  System.out.print("Enter the number of animals: ");
			  super.numAnimals=input.nextInt();
		  }
	      catch (InputMismatchException e) {
				  input.nextLine();
				  System.out.println("Please enter an integer");
				  System.out.print("Enter the number of animals: ");
				  super.numAnimals = input.nextInt();
		  }
		  while(numAnimals > 10) {
			System.out.println("SUV can only evacuate upto 10 animals");
			System.out.print("Enter the number of animals: ");
			super.numAnimals=input.nextInt();
		   }
		  for (int i=0; i<numAnimals; i++) {
			  int j = rnd.nextInt(numAnimals);
			  if(i==numAnimals-2 || i==numAnimals-1) {
				  Horses h = new Horses();
				  SUV[i]=h;
				  h.Print();
				  super.numHorses++;
				  nhorses++;
			  }
			  else if(j==0 || j==1 || j==2 || j==3 || j==4) {
				  Dogs d = new Dogs();
					SUV[i] = d;
					d.Print();
				    ndogs++;
			  }
			  else {
				  Cats c = new Cats();
					SUV[i] = c;
					c.Print();
				    ncats++;
			  }
		  }
			  
		  System.out.println("SUV carries "+nhorses+" horses, "+ndogs+" dogs and "+ncats+" cats");
	  }
	  return arrayToString(SUV);
  }
   public boolean truckhasTrailer() {
	   Random rnd = new Random();
	   if(rnd.nextBoolean() == true) {
		   truck_trailer = true;
           return truck_trailer;
	   }
	   else {
		   truck_trailer = false;
		   return truck_trailer;
	   }
   }
   public String truck() {
	   int nhorses=0;
	   int trailerLength = 0;
	   int trailerCapacity;
	   Random rnd = new Random();
	   Scanner input = new Scanner(System.in);
	   Vehicles[] truck = new Vehicles[7];
	   System.out.println("Truck");
	   truckhasTrailer();
	   if(truck_trailer == false) {
			  System.out.println("Truck does not have trailer");
			  try {
			  System.out.print("Enter the number of animals: ");
			  super.numAnimals=input.nextInt();
			  }
			  catch (InputMismatchException e) {
				  input.nextLine();
				  System.out.println("Please enter an integer");
				  System.out.print("Enter the number of animals: ");
				  super.numAnimals = input.nextInt();
			  }
			  while(numAnimals > 3) {
				  System.out.println("Truck can only evacuate upto 3 animals without the trailer");
				  System.out.print("Enter the number of animals: ");
				  super.numAnimals=input.nextInt();
			  }
	          for(int i=0; i<super.numAnimals; i++) {
	        	  Horses h = new Horses();
				  truck[i]=h;
				  h.Print();
				  super.numHorses++;
				  nhorses++;
	          }
	          System.out.println("Truck carries "+nhorses+" horses");
	   } 
	   else if(truck_trailer == true) {
		      super.numtrailer_4++;
			  System.out.println("Truck has a trailer");
			  trailerLength = 20+rnd.nextInt(10);
			  trailerCapacity = 4;
	          System.out.println("Trailer length: "+trailerLength+" ft");
	          System.out.println("Trailer capacity: "+trailerCapacity+" spaces");
			  try {
				  System.out.print("Enter the number of animals: ");
				  super.numAnimals=input.nextInt();
			  }
		      catch (InputMismatchException e) {
					  input.nextLine();
					  System.out.println("Please enter an integer");
					  System.out.print("Enter the number of animals: ");
					  super.numAnimals = input.nextInt();
			  }
			  while(super.numAnimals > 7) {
				System.out.println("Truck can only evacuate upto 7 animals with trailer");
				System.out.print("Enter the number of animals: ");
				super.numAnimals=input.nextInt();
			   }
			  for(int i = 0; i < super.numAnimals; i++ ) {
				  Horses h = new Horses();
				  truck[i]=h;
				  h.Print();
				  super.numHorses++;
				  nhorses++;
			  }
			  if(super.numAnimals==4) {
				  trailerCapacity = trailerCapacity-1;
			  }
			  else if(super.numAnimals==5) {
				  trailerCapacity = trailerCapacity-2;
			  }
			  else if(super.numAnimals==6) {
				  trailerCapacity = trailerCapacity-3;
			  }
			  else if(super.numAnimals==7) {
				  trailerCapacity = trailerCapacity-4;
			  }
			  System.out.println();
			  System.out.println("Truck with trailer carries "+nhorses+" horses");
			  System.out.println();
			  System.out.println("Trailer capacity: "+trailerCapacity+" spaces empty");
	   }
	   
	   return arrayToString(truck);
   }
   public String arrayToString(Vehicles[] v) {
	   
	   String c="";
		for(int index=0;index<v.length;index++) {
			c+=v[index];
		}	   
	   return c;
   }
   public String Vehicle() {
	   Random rnd = new Random();
	   int n = rnd.nextInt(4);
	   if(n==0) {
		   super.numCompactCar++;
		   return compactCar();
	   }
	   else if(n==1) {
		   super.numMidSizeCar++;
		   return midSizeCar();
	   }
	   else if(n==2) {
		   super.numSUV++;
		   return SUV();
	   }
	   else{
		   super.numTruck++;
		   return truck();
	   }
   }
   public String sortVehicles() {
	   String str="";
	   for(int a = 0; a<numCompactCar; a++) {
		   str+="|Compact Car| ";
	   }
	   for(int b = 0; b<numMidSizeCar; b++) {
		   str+="|Mid-Size Car| ";
	   }
	   for(int c = 0; c<numSUV; c++) {
		   str+="|SUV| ";
	   }
	   for(int g = 0; g<numTruck; g++) {
		   str+="|Truck| ";
	   }
	   return str;
   }
   
 @Override
 public int getnumAnimals() {
 return super.numHorses+super.numCats+super.numDogs;
}
   






}