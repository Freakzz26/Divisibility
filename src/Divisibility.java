import java.util.Scanner;
public class Divisibility {
    static void findDivisibility(int arr[],int n)
    {
        int sum=0;
        for (int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        if(sum%3==0)
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(0);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }

        findDivisibility(arr,n);
    }
}
