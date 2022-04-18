import javax.swing.*;

public class assign {
    public static void main(String[] args) {
        int age;
        String name= JOptionPane.showInputDialog(null,"Enter your name:");
        String address=JOptionPane.showInputDialog(null,"Enter your address:");
        age=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age:"));
        JOptionPane.showMessageDialog(null,"Name: "+name);
        JOptionPane.showMessageDialog(null,"Address: "+address);
        JOptionPane.showMessageDialog(null,"Age: "+age);


    }
}

class Add{
    public static void main(String[] args) {
        double num1,num2,num3,num4,num5;
        num1=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter first number:"));
        num2=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter second number:"));
        num3=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter third number:"));
        num4=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter fourth number:"));
        num5=num1+num2+num3+num4;
        JOptionPane.showMessageDialog(null,"The sum of four numbers is "+num5);
    }
}

class Cu{
    public static void main(String[] args) {
        int l,volume;
        l=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter length:"));
        volume=l*l*l;
        JOptionPane.showMessageDialog(null,"Volume of cube is "+volume);
    }
}

class Cubo{
    public static void main(String[] args) {
        int l,b,h,volume;
        l=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter lenghth:"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter breadth:"));
        h=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter height:"));
        volume=l*b*h;
        JOptionPane.showMessageDialog(null,"Volume of cuboid is "+volume);

    }
}

class div{
    public static void main(String[] args) {
        int a,b,sum,product,division;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter first number:"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter second number:"));
        sum=a+b;
        product=a*b;
        division=a/b;
        JOptionPane.showMessageDialog(null,"Sum: "+sum);
        JOptionPane.showMessageDialog(null,"Product: "+product);
        JOptionPane.showMessageDialog(null,"Division: "+division);
    }
}

class Markss{
    public static void main(String[] args) {
        float first,second,third,fourth,total,percentage;
        first=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter your percentage in first subject:"));
        second=Float.parseFloat(JOptionPane.showInputDialog(null,"Second subject:"));
        third=Float.parseFloat(JOptionPane.showInputDialog(null,"Third subject:"));
        fourth=Float.parseFloat(JOptionPane.showInputDialog(null,"Fourth subject:"));
        total=first+second+third+fourth;
        percentage=total/4;
        JOptionPane.showMessageDialog(null,"Your total marks is "+total);
        JOptionPane.showMessageDialog(null,"Your total percentage is "+percentage);


    }
}

class Peri{
    public static void main(String[] args) {
        float l,area,perimeter;
        l=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter length:"));
        area=l*l;
        perimeter=4*l;
        JOptionPane.showMessageDialog(null,"The area is "+area+"respectively.");
        JOptionPane.showMessageDialog(null,"The perimeter is "+perimeter+"respectively.");
    }
}

class recta{
    public static void main(String[] args) {
        int l,b,area;
        l=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter length:"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter breadth:"));
        area=l*b;
        JOptionPane.showMessageDialog(null,"The area: "+area);

    }
}

class Simp{
    public static void main(String[] args) {
        int p,t,r,si;
        p=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the principle:"));
        t=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the time:"));
        r=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the rate:"));
        si=(p*t*r)/100;
        JOptionPane.showMessageDialog(null,"The simple interest is "+si);

    }
}

class Sq{
    public static void main(String[] args) {
        float num,square;
        num=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the number in square:"));
        square=num*num;
        JOptionPane.showMessageDialog(null,"The square of num "+square);
    }
}

class std{
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog(null,"Enter your name:");
        int rollno=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your roll number:"));
        String field=JOptionPane.showInputDialog(null,"Enter your field of interest:");
        JOptionPane.showMessageDialog(null,"Name: "+name);
        JOptionPane.showMessageDialog(null,"Rollno: "+rollno);
        JOptionPane.showMessageDialog(null,"Field: "+field);

    }
}

class Sub{
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Hello Robert");
        JOptionPane.showMessageDialog(null,"Enter your marks in three subjects:");
        float first,second,third,total,percentage;
        first=Float.parseFloat(JOptionPane.showInputDialog(null,"First subject:"));
        second=Float.parseFloat(JOptionPane.showInputDialog(null,"Second subject:"));
        third=Float.parseFloat(JOptionPane.showInputDialog(null,"Third subject:"));
        total=first+second+third;
        percentage=total/3;
        JOptionPane.showMessageDialog(null,"Your total marks is "+total+".\nPercentage is "+percentage+".");

    }
}

class Ter{
    public static void main(String[] args) {
        int a,b,c;
        String result;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter first number:"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter second number:"));
        c=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter third number:"));
        result=(a==b&&b==c)?"All the numbers are equal!!":(a==b)?"First and second numbers are equal!!":(a==c)?"First and third number are equal!!":(b==c)?"Second and third number are equal!!":"All the numbers are different!!";
        JOptionPane.showMessageDialog(null,"Result: "+result);
    }
}

class Triangle{
    public static void main(String[] args) {
        float b,h,area;
        b=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter base:"));
        h=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter height:"));
        area=b*h/2;
        JOptionPane.showMessageDialog(null,"Area of triangle is "+area);
    }
}

class Inp{
    public static void main(String[] args) {
        int num1,num2,num3,num4;
        num1=Integer.parseInt(JOptionPane.showInputDialog(null,"a:"));
        num2=Integer.parseInt(JOptionPane.showInputDialog(null,"b:"));
        num3=num1+num2;
        num4=num1*num2;
        JOptionPane.showMessageDialog(null,"Sum of two integers is "+num3);
        JOptionPane.showMessageDialog(null,"Product of two integers is "+num4);
    }
}

class twostr{
    public static void main(String[] args) {
        String first=JOptionPane.showInputDialog(null,"Enter first string:");
        String second=JOptionPane.showInputDialog(null,"Enter second string:");
        String third=first+second;
        JOptionPane.showMessageDialog(null,"Two strings are: "+third);
    }
}

class Var {
    public static void main(String[] args) {
        int a, b;
        String result;
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter first number:"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter second number:"));
        result = (a < 50 && a < b) ? "Both condition are true!!" : "Both condition are not true!!";
        JOptionPane.showMessageDialog(null, "Result: " + result);
    }
}