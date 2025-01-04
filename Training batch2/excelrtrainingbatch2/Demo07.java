import java.util.Scanner;
public class Demo07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your phone number");
        int a=scanner.nextInt();
        System.out.println("Enter your name");
        String b =scanner.nextLine();
        System.out.println("Enter your age");
        int c=scanner.nextInt();
        System.out.println("hello"+b+"ur age is"+c+"phone no. is"+a);

    }
}