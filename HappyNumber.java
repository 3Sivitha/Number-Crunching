import java.util.*;
public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt(); // 49
        if (isHappy(number))
            System.out.println("Happy number");
        else
            System.out.println("Not a Happy number");

    }
    public static boolean isHappy(int n) {
        int a = n;//49
        int b = n;//49

        do {
            a = sumOfSquares(a);//4^2+9^2=97 -->130-->10-->1(break)
            b = sumOfSquares(sumOfSquares(b));//9^2+7^2=130-->1^2+3^2=10-->1(break)
        } while (a != b);

        return a == 1;
    }

    private static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}

