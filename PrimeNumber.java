import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
         int num= input.nextInt();

         if(num <=1){
             System.out.println("its prime");
         }
         else {
             int count=0;
            for (int i=2; i < num;i++){
             if (num % i==0){
                 count++;
             }
         }


         if (count==0){
             System.out.println(num + " "+ "its prime number");
         }

         else {
             System.out.println(num+" "+"its not prime number");
         }

    }
}}
