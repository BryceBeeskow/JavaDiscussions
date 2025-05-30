package com.mycompany.fish;

/**
 *
 * @author bryce
 */



/**
 * Using abstract classes are advantageous when you want to define a template with partial 
 * implementation and when multiple subclasses share common fields/methods but still need 
 * to  implement specifics.
 * 
 * all fish have a name, type, state but different sizes.
 */
public abstract class Fish {
    String fishName;
    String fishType;
    String stateFish;
    
    public Fish(String fishName, String fishType, String stateFish) {
        this.fishName = fishName;
        this.fishType = fishType;
        this.stateFish = stateFish;
    }

    //  method shared by all fish
    public void describe() {
        System.out.println("Fish Name: " + fishName);
        System.out.println("Fish Type: " + fishType);
        System.out.println("State Fish Of: " + stateFish);
    }
    
    // Abstract method that must be implemented by all subclasses
    public abstract String sizeOfFish();
    
    
    public static void main(String[] args) {
        Fish[] fish = {
            new FishType("Walleye", "Freshwater", "Minnesota"),
            new FishType("Humuhumunukunukuapua'a", "Saltwater", "Hawaii"),
            new FishType("Large Mouth Bass", "Freshwater", "Florida"),
            new FishType("Atlantic Sailfish", "Saltwater", "Florida")
        };
        
        for(Fish f: fish){
            f.describe();
            System.out.println("Typical size of a " + f.fishName+ " is " + f.sizeOfFish());
            System.out.println();
        }
   
        
    }
}


// Subclass that extends the abstract class and provides specific implementation
class FishType extends Fish{
    public FishType(String fishName, String fishType, String stateFish){
        super(fishName, fishType, stateFish);
    }
    
    @Override
public String sizeOfFish() {
    String name = fishName.toLowerCase();
    if(name.equals("walleye")){
        return "22-42 inches";
    } else if (name.contains("humuhumu")) {
        return "10 inches";
    } else if (name.contains("bass")) {
        return "12-24 inches";
    } else if (name.contains("sailfish")) {
        return "7.5-11 feet";
    } 
    return "Unknown size";
}
}