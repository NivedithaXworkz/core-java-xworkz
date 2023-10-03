class ReverseStringBuilt 
 {
    public static void main(String[] args) {
        String message = "It provides a mutable sequence of characters";
        
        
        StringBuilder reversed = new StringBuilder(message);
        
        
        reversed.reverse();
        
        
        String reversedString = reversed.toString();
        
        
        System.out.println("Reversed: " + reversedString);
    }
}