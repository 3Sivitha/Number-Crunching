import java.util.*;

public class ReversenumformL2R {
//    public static int digits(int n){
//        int count=0;
//        while(n!=0){
//            n=n/10;
//            count++;
//        }
//        return count;
//    }
//    public static int pow(int digit){
//        int div=1;
//        for(int i= digit;i>=1;i--)
//            div=div*10;
//        return div;
//    }
//    public static int digitaccess(int n,int div){
//        int n1=n/div;
//        n1=n1%div;
//        return n1;
//    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int pv=1;
        int dig=0;
        int temp=0;
        System.out.println("Number accessing form left to right");
        while(num/pv!=0){
            pv=pv*10;
        }
        pv=pv/10;
        int p=1;
        while(pv!=0){
            int qu=num/pv;
            dig=qu%10;
            System.out.println(dig);
            //temp=temp*pv+qu;
            temp=dig*p+temp;
            p*=10;
            pv=pv/10;
        }
        System.out.println("Reverse the number without damaging the number: "+temp);

       }
    }

