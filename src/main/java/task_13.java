import java.util.Scanner;

public class task_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        String S = scanner.nextLine();

        int X = Integer.parseInt(S);

        double Y = (double) X;

        System.out.println(S);
        System.out.println(X);
        System.out.println(Y);

        scanner.close();
    }
}
