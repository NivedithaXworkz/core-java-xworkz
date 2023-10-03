class ReverseString {
    public static void main(String[] reversing) {
        String name = "Niveditha";
		//  empty string  to store the reversed string
        String reverse= "";

        for (int i = name.length() - 1; i >= 0; i--) {
			// Concatenate each character to the "reverse" string in reverse order
            reverse+= name.charAt(i);
        }

        System.out.println("Reversed name: " + reverse);
    }
}