import java.util.Scanner;

//Write a JAVA program to find maximum between two numbers.
public class MaxTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1: ");
        int a = sc.nextInt();
        System.out.println("Enter 2: ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a+ "is greater");
        }
        else{
            System.out.println(b+ "is greater");
        }
    }

}