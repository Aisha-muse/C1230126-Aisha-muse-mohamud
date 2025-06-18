import java.util.Random;
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {

              Scanner scanner = new Scanner(System.in);

                System.out.print("Enter length: ");
                int length = scanner.nextInt();

                String chars = "ABCabc123!@";
                Random ran =new Random();
                String password = "";
                for (int i = 0; i < length; i++) {
                    int index = ran.nextInt(chars.length());
                    password += chars.charAt(index);
                }

                System.out.println("Password: " + password);

            }
        }


