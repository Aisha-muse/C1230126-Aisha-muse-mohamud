import java.util.Scanner;
public class Prime_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int i;
        int y=1;

        System.out.print("Enter the number ");
        x= input.nextInt();

        for (i = 2; i < x; i++) {
            //System.out.println(i);
            if (x % i == 0) {
                y = 0;
                break;
            }
        }
        if (y == 1) {
            System.out.println(" waa prime number");
        } else {
            System.out.println(" ma han prime number!!");
            }

    }
}
