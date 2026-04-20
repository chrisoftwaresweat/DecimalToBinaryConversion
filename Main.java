import java.util.Scanner;
//DECIMAL TO BINARY CONVERSION
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int binary = 0, place = 1;
        int remainder;

        //user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0){
            System.out.println("Please enter a non-negative integer.");
        }
        else if (number == 0){
            System.out.println("Binary equivalent: 0");
        }
        else {
            while (number > 0){
                remainder = number % 2;
                binary += remainder * place; //instead of sorting it later, we sort it as we get the remainder values
                place *= 10;
                number /= 2;
            }

            System.out.printf("Binary equivalent: %d", binary);
        }

        scanner.close();
    }
}