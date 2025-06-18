import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter polindrome");
        String text = input.nextLine();
        text.toLowerCase();
        String word = "";

        int i = text.length() - 1;
        while (true) {
            word += text.charAt(i);i--;
            if (i < 0) {
            break;
        }
    }
                 if (text.equals(word)) {
                System.out.println( " " +"its palindrome");
            }
                 else {
                System.out.println(" "+"its not palindrome");


        }

    }}



