package it.figuccia;

public class Start {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "How are you?";

        //this array use charAt(0) for first character adl length()-1 for last character
        char[] charArray = {string1.charAt(0), string1.charAt(1), string2.charAt(string2.length()-2), string2.charAt(string2.length()-1)};
        System.out.println(charArray);
    }
}
