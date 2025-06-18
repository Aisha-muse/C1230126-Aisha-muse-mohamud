import java.util.Scanner;

public class Student_grade{
    static String[] names = new String[50];
    static double[] grades = new double[50];
    static int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Show Stats");
            System.out.println("3. Find Student");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            int option = input.nextInt();
            input.nextLine();

            if (option == 1) add(input);
            else if (option == 2) stats();
            else if (option == 3) find(input);
            else if (option == 4) {
                System.out.println("Bye!");
                break;
            } else {
                System.out.println("Wrong choice.");
            }
        }

    }

    static void add(Scanner input) {
        if (count >= 50) {
            System.out.println("Full list.");
            return;
        }
        System.out.print("Name: ");
        String name = input.nextLine();
        if (name.isEmpty()) {
            System.out.println("Name is empty.");
            return;
        }
        System.out.print("Grade: ");
        double grade = input.nextDouble();

        if (grade < 0 || grade > 100) {
            System.out.println("Wrong grade.");
            return;
        }

        names[count] = name;
        grades[count] = grade;
        count++;
        System.out.println("Added");
    }

    static void stats() {
        if (count == 0) {
            System.out.println("No students.");
            return;
        }

        double total = 0, max = grades[0], min = grades[0];
        String top = names[0], low = names[0];

        for (int i = 0; i < count; i++) {
            total += grades[i];
            if (grades[i] > max) {
                max = grades[i];
                top = names[i];
            }
            if (grades[i] < min) {
                min = grades[i];
                low = names[i];
            }
        }

        System.out.println("Average: " + (total / count));
        System.out.println("Top: " + top + " - " + max);
        System.out.println("Low: " + low + " - " + min);
    }

    static void find(Scanner input) {
        System.out.print("Search name: ");
        String name = input.nextLine();

        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                System.out.println("Found: " + names[i] + " " + grades[i]);
                return;
            }
        }
        System.out.println("Not found.");
    }
}
