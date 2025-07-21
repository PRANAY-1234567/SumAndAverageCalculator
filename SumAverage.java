import java.util.Scanner;
class SumAverage
{
	public static void main(String [] args)
	{
		Scanner kbin = new Scanner(System.in);
        int n1,n2,n3,n4;
        System.out.print("Enter first number  :");
        n1 = kbin.nextInt();
        System.out.print("Enter second number :");
        n2 = kbin.nextInt();
        System.out.print("Enter third number  :");
        n3 = kbin.nextInt();
        System.out.print("Enter fourth number :");
        n4 = kbin.nextInt();
        int sum=n1+n2+n3+n4;
        float avg=sum/4.0f;
        System.out.println("Sum    :"+sum);
        System.out.println("Average:"+avg);
	}
}