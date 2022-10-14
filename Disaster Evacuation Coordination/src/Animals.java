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
public class Animals extends Vehicles {
String animalName, ownerName;
 int ID = 0000;
 
public String getAnimalName() {
		Random rnd = new Random();
		String[] animalNameList = {"Abby", "Nancy", "Rocky", "Stuart", "Alice", "Aries", "Bruno", "Cookie", "Dixie", "Eddie", "Milo" , "Luna", "Lola", "Zoe", "Peach", "Loki", "Tom", "Jerry", "Snowbell", "Apollo", "Augustus", "Elixir", "Flash", "Lucky", "Ruth", "Reggie", "Sky", "Zeus", "Thor", "Yoda"};
		animalName = animalNameList[rnd.nextInt(animalNameList.length)];
		return animalName;
}


public String getOwnerName() {
	Random rnd = new Random();
	String [] ownerNameList = {"James", "David", "Mary", "Samantha", "Elizabeth", "Daniel", "Robert", "John", "William", "Richard", "Lisa", "Jennifer", "Debra", "Matt", "Christian", "Nicholas", "Andrew", "Steven", "Paul", "Sandra", "Amber", "Rebecca", "Bill", "Brian", "Jason", "Amanda", "Diane", "Tyler", "Jose", "Peter"};	
	ownerName = ownerNameList[rnd.nextInt(ownerNameList.length)];
	return ownerName;
	}
	

public int getID() {
	Random rnd = new Random();
	ID = 4999 + rnd.nextInt(5000);
	return ID;
}
}