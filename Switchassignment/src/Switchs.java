import java.util.Scanner;
/*Using switch statement Write a JAVA program to input marks of five subjects Physics,
Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to
following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F
*/
class TMarks{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter the marks of Physics");
        double phy= scanner.nextDouble();
        System.out.println("please enter the marks of chemistry");
        double chem= scanner.nextDouble();
        System.out.println("please enter the marks of biology");
        double bio= scanner.nextDouble();
        System.out.println("please enter the marks of mathematics");
        double maths= scanner.nextDouble();
        System.out.println("please enter the marks of computer");
        double com= scanner.nextDouble();
        double total_marks= phy+chem+ bio+maths+com;
        double Per=(total_marks*100)/500;
        switch((Per>=90)?0:(Per<90 && Per>=80)?1:(Per<80 && Per>=70)?2:(Per<70 && Per>=60)?3:(Per<60 && Per >=40)?4:5){
            case 0:
                System.out.println("grade A");
                break;
            case 1:
                System.out.println("grade B");
                break;
            case 2:
                System.out.println("grade C");
                break;
            case 3:
                System.out.println("grade D");
                break;
            case 4:
                System.out.println("grade E");
                break;
            case 5:
                System.out.println("grade F");
                break;
            default:
                System.out.println("please enter marks between 0-100 only");
                break;

        }

    }
}
//JAVA Program to find the maximum between two numbers. Using the switch statement.
class Maximum{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter 1st number");
        int a= scanner.nextInt();
        System.out.println("enter 2nd number");
        int b= scanner.nextInt();
        switch((a>b)?1:(b>a)?2:0){
            case 1:
                System.out.println(a+" is the maximum1");
                break;
            case 0:
                System.out.println(b+" is the maximum");
                break;
            default:
                System.out.println("both are equal");
                break;
        }
    }
}
//JAVA Program to find the maximum between three numbers. Using the switch statement
class MaxInThree{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:: ");
        int a = scanner.nextInt();

        System.out.println("Enter the second number:: ");
        int b = scanner.nextInt();

        System.out.println("Enter the third number:: ");
        int c = scanner.nextInt();

        switch((a>b&&b>c)?1:(b>c&&c>a)?2:(c>b&&b>a)?3:0){
            case 1:
                System.out.print(a+" is greatest");
                break;
            case 2:
                System.out.print(b+" is greatest");
                break;
            case 3:
                System.out.print(c+" is greatest");
                break;
            default :
                System.out.println("they are equal");
                break;
        }
    }
}
//JAVA Program to check whether a number is divisible by 5 and 11 or not. Using the switch
//statement
class DivisibleByFiveOrEleven{
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.println("please enter any number");
        int num= scanner.nextInt();
        double five=num%5;
        double eleven=num%11;
        switch((five==0 && eleven==0)?1:(five==0 && eleven!=0)?2:(five!=0 && eleven==0)?3:0){
            case 1:
                System.out.println("divisible by both 5 and 11");
                break;
            case 2:
                System.out.println("divisible by 5 only");
                break;
            case 3:
                System.out.println("divisible by 11 only");
                break;
            default:
                System.out.println("neither divisible by 5 nor by 11");
                break;
        }
    }
}
//JAVA Program to check whether a year is a leap year or not. Using switch statement
class Leapyear{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year:: ");
        int year = scanner.nextInt();

        switch ((year%400==0)?1:((year%4==0 && year%100!=0 )?2:0)){
            case 1:
                System.out.print("The year is a leap year.");
                break;
            case 2:
                System.out.print("The year is  a leap year.");
                break;
            default:
                System.out.println("it is not a leap year");
        }
    }
}

//6. JAVA Program to check whether a character is an alphabet or not. Using the switch statement.
class Character{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Word: ");
        char word=sc.next().charAt(0);
        switch ((word>='a'&& word<='z')?0:1){
            case 0:
                System.out.println(word+ " is character.");
                break;
            case 1:
                System.out.println(word+ " is not a character.");
                break;

        }
    }
}
//7. JAVA Program to take the value from the user as input any alphabet and check whether it is
//vowel or consonant. Using the switch statement.
class Alphabet{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Word :");
        char a=sc.next().charAt(0);
        switch(a){
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
                System.out.println(a+" is vowel.");
                break;
            default:
                System.out.println(a+ " is consonant.");
                break;
        }

    }
}

//8. JAVA Program to take the value from the user as input any character and check whether it is
//the alphabet, digit or special character. Using the switch statement.
class Ads{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Character: ");
        char a=sc.next().charAt(0);
        switch((a>='a'&&a<='z')?0:1){
            case 0:
                System.out.println(a+ " is alphabet.");
                break;
            case 1:
                switch((a>='0'&&a<='9')?0:1){
                    case 0:
                        System.out.println(a+ " is Number.");
                        break;
                    default:
                        System.out.println(a+" is special number.");
                        break;

                }
        }
    }
}

//9. JAVA Program to check whether a character is an uppercase or lowercase alphabet. Using the
//switch statement.
class UpperLower{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Word: ");
        char a=sc.next().charAt(0);
        switch((a>='a'&&a<='z')?0:1){
            case 0:
                System.out.println(a+ " is lowercase.");
                break;
            case 1:
                switch ((a>='A'&&a<='Z')?0:1){
                    case 0:
                        System.out.println(a+ " is uppercase.");
                        break;
                    case 1:
                        System.out.println(a+ " is not alphabet.");
                        break;
                }
        }
    }
}
//10. JAVA Program to take the value from the user as an input week number and print weekday by
//using the switch statement.
class WeekDay{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Week Number(1-7): ");
        int a=sc.nextInt();
        switch (a){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Error number");
                break;

        }
    }
}

//11. JAVA Program to take the value from the user as input the month number and print number of
// days in that month. Using switch statement.
class Month{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Month number(1-12): ");
        int a=sc.nextInt();
        switch (a){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 Days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 Days.");
                break;
            case 2:
                System.out.println("Year:");
                int year=sc.nextInt();
                boolean leap=false;
                switch (year%4){
                    case 0:
                        switch(year%100){
                            case 0:
                                switch(year%400){
                                    case 0:
                                        leap=true;
                                        break;
                                    case 1:
                                        leap=false;
                                        break;
                                }break;
                            case 1:
                                leap=true;
                                break;
                        }break;
                    case 1:
                        leap=false;
                        break;
                }
                if (leap) {
                    System.out.println("28 Days");
                }else{
                    System.out.println("29 Days");
                }
        }
    }
}
/*

13. JAVA Program to take the value from the user as input all sides of a triangle and check whether
        the triangle is valid or not. Using switch statement
        */
class Tri{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the degree of first angle:: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the degree of second angle:: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the degree of second angle:: ");
        double c = scanner.nextDouble();

        switch ((a+b>c)||(a+c>b)||(b+c>a)?1:2){
            case 1:
                System.out.print("The triangle is valid.");
            case 2:
                System.out.print("The triangle is not valid.");
        }

    }
}
/*
14. JAVA Program to check whether the triangle is an equilateral, isosceles or scalene triangle.
Using switch statement
 */
class Triangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the degree of first angle:: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the degree of second angle:: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the degree of second angle:: ");
        double c = scanner.nextDouble();

        switch ((a==b&&b==c)?1:(a==b||b==c||c==a)?2:3){
            case 1:
                System.out.print("The triangle is a equilateral triangle. ");
            case 2:
                System.out.print("The triangle is a isosceles triangle. ");
            case 3:
                System.out.print("The triangle is a scalene triangle. ");
        }
    }
}//17. Using switch statement JAVA Program to take the value from the user as input marks of five subjects Physics, Chemistry, Biology, Mathematics, and Computer. Calculate percentage and grade according to the following: Percentage >= 90% : Grade A, Percentage >= 80% : Grade B, Percentage >= 70% : Grade C,Percentage >= 60% : Grade D, Percentage >= 40% : Grade E, Percentage < 40% : Grade F, Using switch statement.
class Subject{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Physic: ");
        double p=scan.nextDouble();

        System.out.println("Chemistry : ");
        double c=scan.nextDouble();

        System.out.println("Biology : ");
        double b=scan.nextDouble();

        System.out.println("math : ");
        double m=scan.nextDouble();

        System.out.println("computer : ");
        double co=scan.nextDouble();

        double per=(p+c+b+m+co)/5;
        double total=(p+c+b+m+co);

        System.out.println("Total percentage is "+per);
        System.out.println("Total  is "+total);

        switch ((per>=90)?0:(per>=80 && per<90)?1:(per>=70 && per<=80)?2:(per>=60 && per<70)?3:(per>=40 && per<60)?4:5){


            case 0:
                System.out.println("grade A");
                break;
            case 1:
                System.out.println("grade B");
                break;
            case 2:
                System.out.println("grade C");
                break;
            case 3:
                System.out.println("grade D");
                break;
            case 4:
                System.out.println("grade E");
                break;
            case 5:
                System.out.println("grade F");
                break;
        }

    }

}
//18. JAVA Program to take the value from the user as input the basic salary of an employee and calculate its Gross salary according to the following:Basic Salary <= 10000: HRA = 20%, DA = 80%………………………………..Basic Salary <= 20000 : HRA = 25%, DA = 90%………………………………Basic Salary > 20000 : HRA = 30%, DA = 95%.
class Salary{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your basic salary: ");
        double salary=scan.nextDouble();

        double HRA,DA;

        switch ( (salary<=10000)?1:(salary<=20000 && salary>10000)?2:(salary>20000)?3:0 ){

            case 1:
                System.out.println("Gross salary is "+ (salary+(0.2*salary)+(0.8*salary)));
                break;

            case 2:
                System.out.println("Gross salary is "+ (salary+(0.25*salary)+(0.9*salary)));
                break;

            case 3:
                System.out.println("Gross salary is "+ (salary+(0.3*salary)+(0.95*salary)));
                break;

            case 0:
                System.out.println("no thing");
                break;

            default:
                System.out.println("invalid");

        }

    }
}


//19. JAVA Program to take the value from the user as input electricity unit charges and calculate total electricity bill according to the given condition: For the first 50 units Rs. 0.50/unit………….For the next 100 units Rs. 0.75/unit…..For the next 100 units Rs. 1.20/unit ……………For unit above 250 units  Rs. 1.50/unit………An additional surcharge of 20% is added to the bill…….Using the switch statement.
class Electricity{
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        double amount,sur,bill;

        System.out.println("Enter the electricity unit charges:");
        double unit= scan.nextDouble();

        switch ( (unit<=50)?1:(unit<=150)?2:(unit<=250)?3:0){


            case 1:
                amount=unit*0.5;
                sur=amount*0.2;
                bill=amount+sur;
                System.out.println("The total bill is "+ bill);
                break;

            case 2:
                amount=25+(unit-50)*0.75;
                sur=amount*0.2;
                bill=amount+sur;
                System.out.println("the total bill is"+bill);
                break;

            case 3:
                amount=25+75+(unit-150)*1.20;
                sur=amount*0.2;
                bill=amount+sur;
                System.out.println("total bill is "+bill);
                break;

            case 4:
                amount=25+75+150+(unit-250)*1.50;
                sur=amount*0.2;
                bill=amount+sur;
                System.out.println("total bill is "+bill);
                break;

            default:
                System.out.println("invalid");






        }





    }
}
/*
20. Write a program that determines a student’s grade. The program will read three types of scores
(quiz, mid-term, and final scores) and determine the grade based on the following rules:if the
average score =90% =>grade=A…………………..-if the average score >= 70% and <90% =>
grade=B……………………-if the average score>=50% and <70%`
=>grade=C……………………..-if the average score<50% =>grade=F
*/

class Grade{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double quiz, mid, final_term,p;
        System.out.println("Enter the quiz_term marks: ");
        quiz=scanner.nextDouble();
        System.out.println("Enter the mid_term marks: ");
        mid=scanner.nextDouble();
        System.out.println("Enter the final_term marks: ");
        final_term=scanner.nextDouble();

        p=(quiz+mid+final_term)/3;
        System.out.println("the total percent is "+p);

        switch ((p>=90)? 0:(p>=70&& p<90)? 1:(p>=50&& p<70)?2:3){
            case 0:
                System.out.println("Grade A");
                break;
            case 1:
                System.out.println("Grade B");
                break;
            case 2:
                System.out.println("Grade C");
                break;
            case 3:
                System.out.println("Grade F");
                break;
            default:
                System.out.println("not valid");
        }

    }
}

/*
21. Program to take the hours and minutes as input by the user and the show that whether it is AM
or PM by using the switch statement.
*/
class Minutes{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        double hours, minutes;
        System.out.println("enter the total hours: ");
        hours=scan.nextDouble();
        System.out.println("enter the total minutes: ");
        minutes=scan.nextDouble();

        double min_in_hr=minutes/60;
        double t_hours=min_in_hr+hours;

        switch((t_hours>0 &&t_hours<=11)? 1:(t_hours>=12 &&t_hours<24?2:3)){
            case 1:
                System.out.println("the total hours is "+t_hours);
                System.out.println("so it is AM.");
                break;
            case 2:
                System.out.println("the total hours is "+t_hours);
                System.out.println("so it is PM.");
                break;
            case 3:
                System.out.println("invalid input");
                break;
            default:
                System.out.println("invalid");
        }
    }
}

/*
22. Program to convert a positive number into negative number and negative number into a positive
number using switch statement
*/
class PosNeg{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("enter the number: ");
        double num=scanner.nextDouble();

        switch((num<0)?1:(num>0)?2:3){
            case 1:
                System.out.println("you enter the negative no ");
                System.out.println("so it positive no is "+(num*-1));
                break;
            case 2:
                System.out.println("you enter the positive no ");
                System.out.println("so its negative no is "+(num*-1));
                break;
            case 3:
                System.out.println("you enter the invalid no or zero ");
                break;
            default:
                System.out.println("invalid input");
        }

    }
}

/*
23. Write a program to swap the values of two numbers if the values of both variables are not the
same using a switch statement.
*/
class Variable{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        System.out.println("Enter the first no:");
        double a=scanner.nextDouble();
        System.out.println("Enter the second no:");
        double b=scanner.nextDouble();
        temp=a;
        a=b;
        b=temp;
        switch((a!=b)?1:(a==b)?2:3){
            case 1:
                System.out.println("a="+a);
                System.out.println("b="+b);
                break;
            case 2:
                System.out.println("Don't take two same no");
                break;
            case 3:
                System.out.println("invalid");
                break;
        }


    }
}
/*
24. Program to Convert even number into its upper nearest odd number Switch Statement*/
class Odd{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the number:");
        int num=scanner.nextInt();

        switch(num%2){
            case 0:
                System.out.println(num+" is an even number");
                System.out.println("And it's upper nearest odd number is "+ (num+1));
                break;
            case 1:
                System.out.println("Don't enter the odd number");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
