import java.util.Scanner;

class Gross
{
    public static void main(String args[])
    {
        double basic,gross,da,hra;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Basic Salary : ");
        basic = in.nextDouble();
        if(basic <=10000)
        {
            da = basic * (80/100);
            hra = basic *(20/100);
        }
        else if(basic <=20000)
        {
            da = basic * (90/100);
            hra = basic *(25/100);
        }
        else
        {
            da = basic * (95/100);
            hra = basic * (30/100);
        }
        gross = basic + da + hra;
        System.out.println("The Gross Salary is :"+gross);
    }
}