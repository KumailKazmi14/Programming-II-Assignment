import java.util.Random;

public class Cats extends Animals {
	double catWeight = 0.0;
	static boolean haslitterBox;
    public double getWeight() {
    	Random rnd = new Random();
    	catWeight = 5 + rnd.nextDouble()*30;
    	catWeight = Math.round((catWeight*10.0)/10.0);
		return catWeight;
    	
    }
    public String getLitterBox() {
    	Random rnd = new Random();
    	if(rnd.nextBoolean() == true) {
    		haslitterBox= true;
    		return "Cat has Litter Box";
    	}
    	else {
    		haslitterBox = false;
    		return "Cat does not have Litter Box";
    	}
    }
    public String litterBoxCleaned() {
    	String litterboxClean;
    	Random rnd = new Random(); 
    	if(haslitterBox == false) {
    		return "No Litter Box";
    	}
    	else {
    	String[] timesOfClean = {"Morning", "Afternoon", "Evening", "Night", "Previous Day"};
    	litterboxClean = timesOfClean[rnd.nextInt(timesOfClean.length)];
    	return litterboxClean;
       }
    }
	 public void Print() {
		System.out.println("Cat name: "+super.getAnimalName()+"  ||  "+"Cat weight: "+getWeight()+" lbs"+"  ||  "+ "Cat ID: "+super.getID()+"  ||  "+ "Owner name: "+super.getOwnerName()+"  ||  "+"Has Litter Box? "+getLitterBox()+"  ||  "+"Litter Box Cleaned: "+litterBoxCleaned());
	 }
	}

