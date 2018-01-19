package assignment2;
import java.util.*;
/**
 * Instructions for this assignment.  Download this template from GitHub, fill in
 * the author comment below with your name and implement the requirements below.
 * 
 * If code is turned in and cannot be compiled, you will receive 0 points.
 * If a requirement is not implemented, you will receive 0 points.
 * Requirements are worth 50 points each.
 * 
 * @author KeethuRamalingam
 * 
 * Requirements for main method
 * 
 * REQUIREMENT 1:
 * 
 * Create a ListArray of animal objects and place in that array animal objects with
 * the following specifications:
 * 
 * an Animal object that goes "Woof" when the speak method is called (see the Animal class for details)
 * an Animal object that goes "Meow" when the speak method is called
 * an Animal object that goes "Narly" when the speak method is called
 * an Animal object that goes "Squeek" when the speak method is called
 * 
 * REQUIREMENT 2:
 * 
 * In a loop, call all the speak methods on the animal objects in the ArrayList.
 * The loop must be written such that if I add another animal object to the ArrayList
 * then the loop does not have to be updated to call the speak method.
 * 
 * 
 */
public class Assignment2 {

    public static void main(String[] args) {
        
        Animal dog = new Animal("Woof");
        Animal cat = new Animal("Meow");
        Animal californian = new Animal("Narly");
        Animal mouse = new Animal("Squeek");

        List<Animal> animals = new ArrayList();

        animals.add(cat);
        animals.add(dog);
        animals.add(californian);
        animals.add(mouse);

        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).speak();
        }

    }
    
}
