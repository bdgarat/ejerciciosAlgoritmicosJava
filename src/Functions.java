public class Functions {

    public String reverse (String input, boolean caseSensitive) {
        StringBuilder reversed = new StringBuilder();

        for(int i = 0; i < input.length(); i++) {
            Character c = input.charAt((input.length() - 1) - i);
            if(!caseSensitive) {
                c =  Character.toLowerCase(c);
            }
            reversed.append(c);
        }
        return reversed.toString();
    }

    public boolean palindrome (String input, boolean caseSensitive) {
        int inputLength = 0;
        while (inputLength < input.length()) {
            Character c1 = input.charAt(inputLength);
            Character c2 = input.charAt((input.length() - 1) - inputLength);
            if(!caseSensitive) {
                c1 =  Character.toLowerCase(c1);
                c2 =  Character.toLowerCase(c2);
            }
            if(c1 != c2) {
                return false;
            }
            inputLength++;
        }
        return true;
    }

}
