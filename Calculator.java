import java.util.Scanner;
public class Calculator{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a+b;
        System.out.println(result);

        int multiplication = a*b;
        int division = a/b;
        System.out.println(substraction(6,7));
        System.out.println(multiplication);
        System.out.println(division);
    }
    public static int substraction(int a , int b ){
        return a-b;
    }
}