import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(isHappy(num))
            System.out.println(num+" is a Happy Number");
        else
            System.out.println(num+" is not a Happy Number");
    }

    public static boolean isHappy(int number) {

        while(number>9)
        {
            number=sumOfSquaresOfDigits(number);
        }

        return number==1 || number==7;

    }

    public static int sumOfSquaresOfDigits(int number)
    {
        int squareSum=0;
        while(number!=0)
        {
            squareSum+=number%10;
            number=number/10;
        }
        return squareSum;
    }
}
