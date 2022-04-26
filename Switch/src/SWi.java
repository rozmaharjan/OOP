import java.util.Scanner;

public class SWi {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int day= scanner.nextInt();

        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid");

        }

    }
}

class CheckEvenOdd{
    public static void main (String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");

        int num2=scanner.nextInt();
        switch(num2%2){
            case 0:
                System.out.println(num2+ "is a Even number");
                break;
            case 1:
                System.out.println(num2+" is a Odd number");
        }
    }
}
class Max{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int a,b;
        System.out.println("Input Two Integer");
        a=scanner.nextInt();
        b=scanner.nextInt();
        switch((a > b)?0:(b>a)?1:2)
        {
            case 0:
                System.out.println("maximum number is " + a);
                break;
            case 1:
                System.out.println("maximum number is" + b);
                break;
            default:
                System.out.println("Both are equal");
        }

    }
}

class highest{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number:");

        }

    }
}