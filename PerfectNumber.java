package numbersystems;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        if(isPerfectNumber(number)) {
            System.out.println(number+" is a Perfect number");
        }
        else {
            System.out.println(number+" is not a Perfect number");
        }
    }

    public static boolean isPerfectNumber(int num) {
        int sum=0;
        int i=1;
        while(i<=num/2)
        {
            if(num%i==0)
                sum+=i;
            i++;
        }

        return sum==num;
    }
}
