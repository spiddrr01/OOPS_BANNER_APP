/**
 * @author Anurag
 * @version 4.0
 * 
 * UC4: Store banner lines in a String array and use a loop to print them
 * 
 * This implementation demonstrates:
 * - Using String arrays to store multiple banner lines
 * - Using enhanced for-loops to iterate through the array
 * - Better modularity and code reusability
 * - Elimination of repetitive individual print statements
 */
public class OOPSBannerApp {
    
    /**
     * Main method - the entry point of the application
     * @param args Command line arguments (not used in UC4)
     */
    public static void main(String[] args) {
        // Declare and populate array with banner lines
        String[] bannerLines = new String[7];
        
        bannerLines[0] = String.join("", " **** ", "**** ", " *** ", " *** ", " **** ");
        bannerLines[1] = String.join("", "*    ", "*    *", "*    *", "*    *", "*    *");
        bannerLines[2] = String.join("", "*    ", "*    *", "*    *", "*    *", "*   * ");
        bannerLines[3] = String.join("", "*    ", "*    *", " *** ", " *** ", "*  *  ");
        bannerLines[4] = String.join("", "*    ", "*    *", "*    *", "*   * ", "* *   ");
        bannerLines[5] = String.join("", "*    ", "*    *", "*    *", "*    *", "**    ");
        bannerLines[6] = String.join("", " **** ", "**** ", " *** ", "*    *", "*     ");
        
        // Use enhanced for-loop to print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
