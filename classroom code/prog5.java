import java.util.Scanner;
public class prog5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;
        int cube = num * num * num;

        System.out.println("Square of " + num + " = " + square);
        System.out.println("Cube of " + num + " = " + cube);

        sc.close();
    }
}
