import java.util.Scanner;

public class DiseriumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        if(isDiserium(number)) {
            System.out.println(number+" is a diserium number");
        }
        else {
            System.out.println(number+" is not a diserium number");
        }

    }



    public static boolean isDiserium(int number) {
        String s=String.valueOf(number);
        int sum=0;
        int pos=s.length();
        int num=number;
        while(num!=0)
        {
            int digit=num%10;
            sum+=Math.pow(digit,pos--);
            num /= 10;
        }
        return sum==number;

    }
}
