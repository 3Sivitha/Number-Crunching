import java.util.*;
import java.math.*;
public class ArmstrongNumberinrange {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Armstrong Number in range");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int j,rc=0;
        for(j=n1;j<=n2;j++){
            int copy=j;
            int sum=0;
            int count=0;
            while(copy>0){
                count++;
                copy/=10;
            }
            while(copy>0){
                int rem=copy%10;
                rc=(int)Math.pow(rem,count);
                sum+=rc;
                copy=copy/10;
            }
            copy=j;
            if(copy==sum)
                System.out.println(j+" ");
        }

    }
}
