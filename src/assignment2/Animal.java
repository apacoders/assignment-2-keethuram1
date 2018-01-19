package assignment2;

/**
 * REQUIREMENT 3:
 * 
 * The class must have an immutable String called speakParameter (note camel case)
 * 
 * REQUIREMENT 4:
 * 
 * The class must have a non-static method called speak which prints the speakParameter
 * onto the screen.
 * 
 * 
 * @author KeethuRamalingam
 */
public class Animal {
    
    private final String speakParameter;
    
    public Animal(String speakParameter) {
        this.speakParameter = speakParameter;
    }
    
    public void speak(){
        System.out.println(this.speakParameter);
    }
}
