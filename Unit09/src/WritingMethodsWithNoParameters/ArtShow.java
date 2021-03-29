package WritingMethodsWithNoParameters;

import java.util.*;
public class ArtShow {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String registerString;	
						
		System.out.println("Did you preregister? Enter Y or N: ");					
		registerString  = s.nextLine();
				
		// Test input here. If Y, call discount(), else call noDiscount(). 
        if (registerString.equals("Y")) {
            discount();
        }
        else {
            noDiscount();
        }
		System.exit(0);
	} // End of main() method.
	
	// Write discount method here.
	public static void discount() {
        System.out.println("You are preregistered and qualify for a 5 percent discount.");
    } //end discount()

	// Write noDiscount method here. 
	public static void noDiscount() {
        System.out.println("Sorry, you did not preregister and do not qualify for a 5 percent discount.");
    } //end noDiscount()

} // End of ArtShow class.