import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3  ; i++) {
            String s1 = scanner.next();
            int x = scanner.nextInt();
            System.out.printf("%-15s%03d%n", s1,x);


        }
        scanner.close();
        Scanner sc = new Scanner("    Hellow    world ");
        sc.skip("\\s*");
        System.out.println(sc.next());
        sc.close();
        Scanner scc = new Scanner("123 abc 456 def");
        scc.skip("\\d+");  // Skips the digits "123"
        System.out.println(scc.next());  // Outputs "abc"
        sc.close();


    }
}

/*
Explanation:
%-15s ensures that the string (word) is left-justified and occupies 15 spaces.
%03d ensures that the integer (number) is printed with exactly three digits, padding with zeros if necessary.
n is used to move to the next line after printing each formatted output.
 */
