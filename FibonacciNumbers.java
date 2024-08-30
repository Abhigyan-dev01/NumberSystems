import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int curr =1;
        int prev=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=in.nextInt();
        System.out.println(curr);
        for(int i=0;i<n-1;i++){
            int temp=curr;
            curr=curr+prev;
            prev=temp;
            System.out.print(" "+curr);

        }
    }
}
