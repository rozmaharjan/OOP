import java.util.Scanner;

class Bill {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        double Units;
        double Amount, Total_Amount;

        System.out.print(" Please Enter the Units that you Consumed  : ");
        Units = scanner.nextInt();

        if (Units < 50)
        {
            Amount = Units * 0.50;
        }
        else if (Units <= 150)
        {
            Amount = 25 + ((Units - 50 ) * 0.75);
        }
        else if (Units <= 250)
        {
            Amount = 25 + 75 + ((Units - 150 ) * 1.20);

        }
        else
        {
            Amount = 25 + 75 + 120 + ((Units - 250 ) * 1.50);

        }

        Total_Amount = Amount + (Amount*0.8);
        System.out.println("\n Electricity Bill  =  " + Total_Amount);
    }

}
class Switch{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(
    }
}