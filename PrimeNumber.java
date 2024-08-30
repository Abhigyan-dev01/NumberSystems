
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        if(isPrime(number)) {
            System.out.println(number+" is a Prime number");
        }
        else {
            System.out.println(number+" is not a Prime number");
        }
    }

    public static boolean isPrime(int n) {
        int i=2;
        while(i<=n/2)
        {
            if(n%i==0)
            {
                return false;
            }
            i++;
        }
        return true;
    }
}
