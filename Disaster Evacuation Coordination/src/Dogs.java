import java.util.Random;
public class Dogs extends Animals {
    double dogWeight = 0.0;
    public double getWeight() {
    	Random rnd = new Random();
    	dogWeight = 50 + rnd.nextDouble()*90;
    	dogWeight = Math.round((dogWeight*10.0)/10.0);
		return dogWeight;
    	
    }
    public String getLeash() {
    	Random rnd = new Random();
    	if(rnd.nextBoolean() == true) {
    		return "Dog has Leash";
    	}
    	else {
    		return "Dog does not have Leash";
    	}
    }
    public String lastPottyBreak() {
    	String pottyBreak;
    	Random rnd = new Random(); 
    	String[] timesOfBreak = {"Morning", "Afternoon", "Evening", "Night"};
    	pottyBreak = timesOfBreak[rnd.nextInt(timesOfBreak.length)];
    	return pottyBreak;	
    }
	public void Print() {
		System.out.println("Dog name: "+super.getAnimalName()+"  ||  "+ "Dog weight: "+getWeight()+" lbs" + "  ||  "+ "Dog ID: "+super.getID()+"  ||  "+"Owner name: "+super.getOwnerName()+"  ||  "+"Has Leash? "+getLeash()+"  ||  "+"Last Potty Break: "+lastPottyBreak());
	}
}
