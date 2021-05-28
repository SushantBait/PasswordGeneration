
public class Test {
    protected static final int MAX_LENGTH = 10;
 
    private static java.util.Random r = new java.util.Random();
    private static final String DIGITS = "0123456789";
    private static final String LOCASE_CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPCASE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String SYMBOLS = "!@#%*$[](){}";
    private static final String ALL = DIGITS + LOCASE_CHARACTERS + UPCASE_CHARACTERS + SYMBOLS;
    private static final char[] upcaseArray = UPCASE_CHARACTERS.toCharArray();
    private static final char[] locaseArray = LOCASE_CHARACTERS.toCharArray();
    private static final char[] digitsArray = DIGITS.toCharArray();
    private static final char[] symbolsArray = SYMBOLS.toCharArray();
    private static final char[] allArray = ALL.toCharArray();
 

    public static String generatePassword() {
        StringBuilder sb = new StringBuilder();
         sb.append(locaseArray[r.nextInt(locaseArray.length)]);
         sb.append(upcaseArray[r.nextInt(upcaseArray.length)]);
         sb.append(digitsArray[r.nextInt(digitsArray.length)]);
         sb.append(symbolsArray[r.nextInt(symbolsArray.length)]);

        for (int i = 0; i < MAX_LENGTH - 4; i++) {
            sb.append(allArray[r.nextInt(allArray.length)]);
        } 
        return sb.toString();
    }
 
   public static void main(String[] args) {
        
       String thePassword = Test.generatePassword();
       System.out.println("Auto-Generated password is: " + thePassword);
   }
}