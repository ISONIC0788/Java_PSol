import java.util.Scanner;

public class Multpr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number here");
        int N = scanner.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(N+"*"+i+"="+N*i);
        }
    }
}
