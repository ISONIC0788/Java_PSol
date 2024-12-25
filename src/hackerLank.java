import java.awt.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class hackerLank {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

                int N = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
                if(N % 2 != 0 ){
                    System.out.println("Weird");
                }else if ( N %2 == 0 && N >= 2 && N <= 5){
                    System.out.println("Not Weird ");
                }else  if(N%2 == 0 && N>= 5 && N <= 20){
                    System.out.println("Weird");
                }else if(N%2 == 0 && N >= 20 ){
                    System.out.println("Not Weird");
                }
                scanner.close();


    }
}
/*
Task
Given an integer n, perform the following conditional actions:

Ifn  is odd, print Weird
If  n is even and in the inclusive range of 2 to5 , print Not Weird
If n is even and in the inclusive range of  6 to 20 , print Weird
If n is even and greater than 20 , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format
 */