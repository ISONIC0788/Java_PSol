import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter number :");
        int input = scanner.nextInt();
    // using algrothim
        int rev = 0 ;
         while(input != 0){
             rev = rev*10 + input%10;//10
             input= input/10;

         }
         System.out.println(rev);

    }
}
