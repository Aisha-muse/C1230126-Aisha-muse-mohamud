import java.util.Scanner;

public class Sentinal_values {
    public static void main(String[] args) {

    Scanner input= new Scanner(System.in);
    int sum =0;
        System.out.println("Enter a number then enter n or N to exite");
        while (true){
            if (input.hasNextInt()){
                int number= input.nextInt();
                sum +=number;
            }
            else {
                String letter = input.next();
                if (letter.equalsIgnoreCase("n/N")) ;
                {
                    break;

                }



            }

        }
        System.out.println("the sum of numbers is:"+" " + sum);





    }

    }


