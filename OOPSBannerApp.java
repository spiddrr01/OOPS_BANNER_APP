/**
 * @author Anurag
 * @version 8.0
 * 
 * UC8: Use HashMap to store and retrieve character patterns
 * 
 * This implementation demonstrates:
 * - Using HashMap for efficient character pattern lookup
 * - Centralized pattern storage using generic data structure
 * - O(1) lookup time for pattern retrieval by character
 * - Better scalability for adding new characters
 * - Separation of pattern storage and display logic
 * - Use of nested loops to build banner using map entries
 * - Advanced OOP principles through abstraction and encapsulation
 */
import java.util.HashMap;
import java.util.Map;

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
     * Initialize and return the character pattern map
     * @return HashMap containing characters mapped to their patterns
     */
    private static Map<Character, String[]> initializePatterns() {
        Map<Character, String[]> patterns = new HashMap<>();
        
        patterns.put('O', new String[] {
            " **** ",
            "*    *",
            "*    *",
            "*    *",
            "*    *",
            "*    *",
            " **** "
        });
        
        patterns.put('P', new String[] {
            "**** ",
            "*    *",
            "*    *",
            "*    *",
            " *** ",
            "*    ",
            "*    "
        });
        
        patterns.put('S', new String[] {
            " *** ",
            "*    *",
            "*    ",
            " *** ",
            "*   * ",
            "*    *",
            "*    "
        });
        
        return patterns;
    }
    
    /**
     * Renders the banner using the provided character sequence and pattern map
     * @param word The word to display
     * @param patterns The HashMap containing character patterns
     */
    private static void renderBanner(String word, Map<Character, String[]> patterns) {
        // Iterate through each line of the banner (7 lines)
        for (int line = 0; line < 7; line++) {
            StringBuilder banner = new StringBuilder();
            
            // For each character in the word, append its pattern line
            for (char c : word.toCharArray()) {
                if (patterns.containsKey(c)) {
                    banner.append(patterns.get(c)[line]);
                }
            }
            
            System.out.println(banner.toString());
        }
    }
    
    /**
     * Main method - the entry point of the application
     * @param args Command line arguments (not used in UC8)
     */
    public static void main(String[] args) {
        // Initialize the pattern map
        Map<Character, String[]> patterns = initializePatterns();
        
        // Render the "OOPS" banner
        renderBanner("OPPS", patterns);
    }
}
