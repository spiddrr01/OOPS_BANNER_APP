/**
 * @author Anurag
 * @version 6.0
 * 
 * UC6: Create static helper methods to generate character patterns
 * 
 * This implementation demonstrates:
 * - Encapsulation of character patterns in dedicated helper methods
 * - Reusability of methods for duplicate characters (two O's)
 * - DRY (Don't Repeat Yourself) principle - avoiding hardcoded patterns
 * - Better maintainability and extensibility
 */
public class OOPSBannerApp {
    
    /**
     * Generates the banner pattern for character 'O'
     * Returns a 2D array where each row represents a line of the character
     */
    private static String[] patternO() {
        return new String[] {
            " **** ",
            "*    *",
            "*    *",
            "*    *",
            "*    *",
            "*    *",
            " **** "
        };
    }
    
    /**
     * Generates the banner pattern for character 'P'
     * Returns a 2D array where each row represents a line of the character
     */
    private static String[] patternP() {
        return new String[] {
            "**** ",
            "*    *",
            "*    *",
            "*    *",
            " *** ",
            "*    ",
            "*    "
        };
    }
    
    /**
     * Generates the banner pattern for character 'S'
     * Returns a 2D array where each row represents a line of the character
     */
    private static String[] patternS() {
        return new String[] {
            " *** ",
            "*    *",
            "*    ",
            " *** ",
            "*   * ",
            "*    *",
            "*    "
        };
    }
    
    /**
     * Main method - the entry point of the application
     * @param args Command line arguments (not used in UC6)
     */
    public static void main(String[] args) {
        // Get individual character patterns
        String[] o1 = patternO();
        String[] p1 = patternP();
        String[] p2 = patternP();
        String[] s1 = patternS();
        
        // Build and display the banner line by line
        for (int i = 0; i < 7; i++) {
            System.out.println(String.join("", o1[i], p1[i], p2[i], s1[i]));
        }
    }
}
