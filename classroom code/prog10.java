import java.util.Scanner;
public class prog10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = (num % 3 == 0 && num % 5 == 0) 
                        ? num + " is divisible by both 3 and 5."
                        : num + " is not divisible by both 3 and 5.";

        System.out.println(result);

        sc.close();
    }
}
