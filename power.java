
import java.util.*;
public class power {
    public static int pow(int n,int p)
    {
        if(p==0)
            return 1;
        if(p%2==0)
            return  pow(n*n,p/2);
        else
            return n*pow(n*n,(p-1)/2);
    }
    public static void main(String[] args) {
            int n;
            int p,res;
            System.out.println("enter the number");
            Scanner sc= new Scanner(System.in);
            n=sc.nextInt();
            System.out.println("enter the power");
            p=sc.nextInt();
            res=pow(n,p);
            System.out.println(res);

    }
}
