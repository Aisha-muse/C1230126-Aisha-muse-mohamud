import java.util.Scanner;
public class Plindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String user;
        String sum= "";

        System.out.print("enter the number or word!!!");
        user= input.nextLine();

        for (int i = user.length() - 1; i >=0; i--) {
            sum= sum+user.charAt(i);
        }

        if (user.equals(sum)) {
            System.out.println(" waa palindrome.");
        } else {
            System.out.println(" ma aha palindrome.");
   }

    }
}
