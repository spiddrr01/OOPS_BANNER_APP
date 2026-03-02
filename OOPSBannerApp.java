/**
 * @author Anurag
 * @version 7.0
 * 
 * UC7: Create a CharacterPattern class to encapsulate character patterns
 * 
 * This implementation demonstrates:
 * - Static inner class for data encapsulation
 * - Encapsulation of character and its banner pattern
 * - Constructor and getter methods for accessing pattern data
 * - Use of StringBuilder for efficient string building
 * - Single Responsibility Principle - CharacterPattern handles pattern data
 */
public class OOPSBannerApp {
    
    /**
     * Static inner class that represents a character and its banner pattern
     */
    private static class CharacterPattern {
        private char character;
        private String[] pattern;
        
        /**
         * Constructor to initialize character and its pattern
         * @param character The character represented
         * @param pattern Array of strings representing each line of the banner
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        
        /**
         * Get the character
         * @return The character
         */
        public char getCharacter() {
            return character;
        }
        
        /**
         * Get the pattern array
         * @return Array of strings representing the banner pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }
    
    /**
     * Main method - the entry point of the application
     * @param args Command line arguments (not used in UC7)
     */
    public static void main(String[] args) {
        // Create character pattern objects
        CharacterPattern o = new CharacterPattern('O', new String[] {
            " **** ",
            "*    *",
            "*    *",
            "*    *",
            "*    *",
            "*    *",
            " **** "
        });
        
        CharacterPattern p = new CharacterPattern('P', new String[] {
            "**** ",
            "*    *",
            "*    *",
            "*    *",
            " *** ",
            "*    ",
            "*    "
        });
        
        CharacterPattern s = new CharacterPattern('S', new String[] {
            " *** ",
            "*    *",
            "*    ",
            " *** ",
            "*   * ",
            "*    *",
            "*    "
        });
        
        // Build and display the banner using StringBuilder for efficiency
        CharacterPattern[] characters = {o, p, p, s};
        
        for (int line = 0; line < 7; line++) {
            StringBuilder sb = new StringBuilder();
            for (CharacterPattern cp : characters) {
                sb.append(cp.getPattern()[line]);
            }
            System.out.println(sb.toString());
        }
    }
}
