import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner("123 abcd ");
        sc.skip("\\d+");
        System.out.println(sc.next());
        sc.close();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int age = scanner.nextInt();
        System.out.printf("%-20s%04d%n" ,name,age);
        scanner.close();
    }
}
