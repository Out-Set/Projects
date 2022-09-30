import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating two while loops outer loop iterates until user enters '0'
        while(true){

            // Taking input from user
            System.out.print("Please enter a number: ");
            int num = sc.nextInt();

            // Set the number as min and max
            int min = num;
            int max = num;

            while(true){
                System.out.print("Please enter a number: ");
                num = sc.nextInt();

                if(num == 0){
                    break;
                }

                // Find largest number
                if(num > max){
                    max = num;
                }

                // Find smallest number
                if(num < min){
                    min = num;
                }                
            }

            // Prints the largest and smallest numbers
            System.out.println("Max number is: "+max);
            System.out.println("Min number is: "+min);

            // Taking input to continue(1) or stop(0)
            System.out.print("Want to continue? (0/1): ");
            int n = sc.nextInt();

            if(n == 0)
                break;
        }
        sc.close();
    }
}
