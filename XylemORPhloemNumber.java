
import java.util.Scanner;

public class XylemPhloemNumber {
    public static boolean xylemPhloemNumber(int number) {

        int extremeSum=0;
        int meanSum=0;
        int numberOfDigits=String.valueOf(number).length();
        int pos=numberOfDigits;

        while(number!=0)
        {
            int digit=number%10;
            if(pos==1 || pos==numberOfDigits)
                extremeSum+=digit;
            else
                meanSum+=digit;
            number=number/10;
            pos-=1;
        }
        System.out.println(extremeSum);
        System.out.println(meanSum);

    return extremeSum==meanSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        if(xylemPhloemNumber(number))
            System.out.println(number+ "->is a Xylem Number");
        else
            System.out.println(number+ "->is a Phloem Number");
    }
}
