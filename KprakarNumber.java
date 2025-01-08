import java.util.*;
public class KprakarNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sqr=n*n;
        int temp=sqr;
        boolean flag=false;
        int count=0;
        while(sqr!=0){
            count++;
            sqr/=10;
        }
        sqr=temp;
        int pv=10;
        while(count!=0){
            int rem=sqr%pv;//88209%100-->9
            int qu=sqr/pv;//88209/100-->882
            if((rem+qu)==temp){//882+9=891 not equal to 297
                flag =true;
                break;
            }
            else{
                pv*=10;
            }
            count--;
        }
        if(flag)
            System.out.println("Kprakar Number");
        else
            System.out.println("Not Kprakar Number");
    }
}