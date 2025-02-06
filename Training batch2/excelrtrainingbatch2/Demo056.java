import java.util.Scanner;
public class Demo056 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        
        int number1 = sc.nextInt();
        
        int sum = 0;
        while (number1 > 0) {
            int digit = number1 % 10;
            sum += digit * digit * digit;
            number1 /= 10;
        }
        System.out.println("Sum of cubes are: " + sum);
    }
}