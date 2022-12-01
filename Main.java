
/*
Write a program that reads a text and then writes on the screen a palindrome by writing the same text followed
by the same text in reversed order. For example, if the user enters the text “It was a dark and stormy night” the
program must output “It was a dark and stormy nightthgin ymrots dna krad a saw tI”.
 */

class PalindromeCreator {
    public static void main(String[] args) {
        System.out.println("enter your word: ");
        String word = System.console().readLine();
        int length = word.length() - 1;

        String wordTwo = "";

        for (int i = length; i > -1; i--) {
            wordTwo += word.charAt(i);
        }

        System.out.println(wordTwo);
    }
}