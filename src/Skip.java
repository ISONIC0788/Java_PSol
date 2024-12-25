import java.util.Scanner;

public class Skip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.skip(" ");
        if(name.equals("ebed")){
            System.out.println("Hellow bro");
        }else {
            System.out.println("failed ");
        }
        scanner.close();
    }
}
