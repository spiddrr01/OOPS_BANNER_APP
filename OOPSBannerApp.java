/**
 * @author Anurag
 * @version 2.0
 * 
 * UC2: Display "OOPS" in a large banner using spaces and asterisks
 * 
 * This implementation demonstrates:
 * - Using individual print statements for each line of the banner
 * - String concatenation with the + operator to create visual patterns
 * - ASCII art composition using asterisks and spaces
 * - Manual string concatenation approach (drawback: creates multiple String objects)
 */
public class OOPSBannerApp {
    
    /**
     * Main method - the entry point of the application
     * @param args Command line arguments (not used in UC2)
     */
    public static void main(String[] args) {
        System.out.println(" **** **** " + " *** " + " *** " + " **** ");
        System.out.println("*    *    *" + "*    *" + "*    *" + "*    *");
        System.out.println("*    *    *" + "*    *" + "*    *" + "*   * ");
        System.out.println("*    *    *" + " *** " + " *** " + "*  *  ");
        System.out.println("*    *    *" + "*    *" + "*   * " + "* *   ");
        System.out.println("*    *    *" + "*    *" + "*    *" + "**    ");
        System.out.println(" **** **** " + " *** " + "*    *" + "*     ");
    }
}
