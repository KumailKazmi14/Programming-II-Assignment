import java.util.Random;
public class Horses extends Animals {
	double horseWeight = 0.0;
    public double getWeight() {
    	Random rnd = new Random();
    	horseWeight = 900 + rnd.nextDouble()*900;
    	horseWeight = Math.round((horseWeight*10.0)/10.0);
		return horseWeight;
    	
    }
    public String getHay() {
    	Random rnd = new Random();
    	if(rnd.nextBoolean() == true) {
    		return "Horse has Hay";
    	}
    	else {
    		return "Horse does not have Hay";
    	}
    }
	public void Print() {
		System.out.println("Horse name: "+super.getAnimalName()+"  ||  "+ "Horse weight: "+getWeight()+" lbs"+"  ||  "+ "Horse ID: "+super.getID()+"  ||  "+"Owner name: "+super.getOwnerName()+"  ||  "+"Has Hay? "+getHay());
	}
}
