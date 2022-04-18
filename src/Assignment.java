import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you name:");
        String name = scanner.nextLine();
        System.out.println("Enter your address:");
        String address=scanner.nextLine();
        System.out.println("Enter your age:");
        int age=scanner.nextInt();
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);
        System.out.println("Age:"+age);


    }
}
class Sum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number:");
        String num1= scanner.nextLine();
        System.out.println("enter second number:");
        String num2= scanner.nextLine();
        System.out.println("enter third number");
        String num3=scanner.nextLine();
        System.out.println("enter fourth number");
        String num4=scanner.nextLine();
        Double numA1=Double.parseDouble(num1);
        Double numA2=Double.parseDouble(num2);
        Double numA3=Double.parseDouble(num3);
        Double numA4=Double.parseDouble(num4);
        Double num5= numA1+numA2+numA3+numA4;
        System.out.println("the sum of four numbers is " + num5);
    }
}
class Cube{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter length:");
        int l=scanner.nextInt();
        int volume=l*l*l;
        System.out.println("Volume of cube is "+ volume);

    }
}
class Cuboid {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter length:");
        int l=scanner.nextInt();
        System.out.println("Enter breadth:");
        int b=scanner.nextInt();
        System.out.println("Enter height:");
        int h=scanner.nextInt();
        int volume=l*b*h;
        System.out.println("Volume of Cuboid is "+volume);
    }
}
class Division {
    public static void main(String[] args) {
        int a,b,sum,product,division;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number:");
        a=scanner.nextInt();
        System.out.println("Enter second number:");
        b=scanner.nextInt();
        sum=a+b;
        product=a*b;
        division=a/b;
        System.out.println("The sum is "+sum);
        System.out.println("The product is "+product);
        System.out.println("The division is "+division);

    }
}
class marks {
    public static void main(String[] args) {
        float first,second,third,fourth,total;
        System.out.println("Enter your marks in four subjects:");
        Scanner scanner=new Scanner(System.in);
        first=scanner.nextFloat();
        second=scanner.nextFloat();
        third=scanner.nextFloat();
        fourth=scanner.nextFloat();
        total=(first+second+third+fourth)/4;
        String result;
        result=((total>70)&&(total<100))?"First Class":((total>59)&&(total<70))?"Upper Second Class":((total>49)&&(total<59))?"Second Class":((total>39)&&(total<49))?"Third Class": "Fail";
        System.out.println("Total percentage: "+total+"\nDivision: "+result);

    }
}
class Perimeter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length:");
        float length=scanner.nextInt();
        float area=length*length;
        float perimeter=4*length;
        System.out.println("The area and perimeter are " +area+"  and "+perimeter+"respectively.");
    }
}
class Rectangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double l,b;
        System.out.println("Enter length and breadth in double");
        l= scanner.nextInt();
        b=scanner.nextInt();
        int le=(int)l;
        int bre =(int)b;
        int area=le*bre;
        System.out.println("The area is "+area);
    }
}
class Simple {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter principle:");
        int p=scanner.nextInt();
        System.out.println("Enter time:");
        int t=scanner.nextInt();
        System.out.println("Enter rate:");
        int r=scanner.nextInt();
        int SI=(p*t*r)/100;
        System.out.println("The simple interest is "+ SI);
    }
}
class Square {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number in square:");
        float num=scanner.nextFloat();
        float square=num*num;
        System.out.println("The sqaure of num "+ square);

    }
}
class stud {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=scanner.nextLine();
        System.out.println("Enter your roll number:");
        int roll=scanner.nextInt();
        System.out.println("Enter your field of interest");
        String fields=scanner.nextLine();
        System.out.println("My name is " + name);
        System.out.println("My roll number is "+ roll);
        System.out.println("My field interest is " +fields);

    }
}
class Subjects {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hello Robert");
        System.out.println("Enter your marks in three subjects:");
        System.out.println("First subject:");
        float first=scanner.nextFloat();
        System.out.println("Second subject:");
        float second=scanner.nextFloat();
        System.out.println("Third subject:");
        float third=scanner.nextFloat();
        float total=first+second+third;
        float percentage=total/3;
        System.out.println("Your total marks is "+total+".\nPercenatge is "+percentage+".");
    }
}
class Ternary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first number:");
        a=scanner.nextInt();
        System.out.println("Enter second number:");
        b=scanner.nextInt();
        System.out.println("Enter third number:");
        c=scanner.nextInt();
        String result=(a==b&&b==c)?"All the numbers are equal!!":(a==b)?"First and second numbers are equal!!":(a==c)?"First and third number are equal!!":(b==c)?"Second and third number are equal!!":"ALl the numbers are different!!";
        System.out.println(result);
    }
}
class Tria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base:");
        float b = scanner.nextInt();
        System.out.println("Enter height:");
        float h = scanner.nextInt();
        float area = (b * h) / 2;
        System.out.println("Area of traingle is " + area);
    }
}
class TwoInputs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("a:");
        int num1= scanner.nextInt();
        System.out.println("b:");
        int num2= scanner.nextInt();
        int num3= num1+num2;
        int num4=num1*num2;
        System.out.println("sum of two integers is "+ num3);
        System.out.println("product of two integers is "+ num4);

    }
}
class Twostring {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first string:");
        String first=scanner.nextLine();
        System.out.println("Enter second string:");
        String second=scanner.nextLine();
        String third=first+second;
        System.out.println("Two strings are: "+third);

    }
}
class Variables {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b;
        System.out.println("Enter first number:");
        a=scanner.nextInt();
        System.out.println("Enter second number:");
        b=scanner.nextInt();
        String result=(a<50&&a<b)?"Both condition are true!!":"Both condition are not true!!";
        System.out.println(result);
    }
}
