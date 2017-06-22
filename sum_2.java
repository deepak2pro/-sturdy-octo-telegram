import java.io.*;
import java.util.*;
public class sum_2
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        for(int i=0;i<n+1;i++)
        {
            sum=sum+i;
        }
       
        System.out.println(sum);
    }
}
