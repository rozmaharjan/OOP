import java.util.Scanner;

public class Vowel {
    public static void main(String args[]){
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Alphabet: ");
        ch=sc.next().charAt(0);
        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){ //outer if use to check consonant

            if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
            {//inner if statements checks vowels
                System.out.print(ch+" is vowel");
            }
            else{//display consonant
                System.out.print(ch+" is consonant");
            }
        }
        else{
            System.out.print(ch+" is neither a vowel nor a consonant");
        }
    }
}