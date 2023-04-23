import java.util.Scanner;
public class EvenOrOdd
{
    public static boolean isEven(int n)
    {
        return n%2==0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("Is the given number is even? "+isEven(n));

    }
}