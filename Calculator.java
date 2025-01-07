import java.util.Scanner;
public class Calculator{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a+b;
        System.out.println(result);

        int subtraction = a-b;
        int multiplication = a*b;
        int division = a/b;
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
    }
}