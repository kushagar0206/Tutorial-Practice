import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       // String word = sc.next();
        int a = sc.nextInt();
        char b = sc.next().charAt(0);
        int c = sc.nextInt();

        switch (b) {
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);
                break;
        }

    }
}
