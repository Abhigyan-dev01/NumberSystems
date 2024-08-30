

import java.util.Scanner;


public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        if(isArmstrong(n))
            System.out.println(n+"-> is Armstrong Number");
        else
            System.out.println(n+"-> is not Armstrong Number");
    }

    public static boolean isArmstrong(int n)
    {
        int sum=0;
        int number =n;
        while(n!=0)
        {
            int digit=n%10;
            sum += (int) Math.pow(digit, 3);
            n/=10;
        }
        System.out.println(sum);
        return sum == number;
    }
}
