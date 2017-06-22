import java.io.*;
import java.util.*;
public class prim
{
    public static void main(String[] arg)
    {
        Scanner s=new Scanner(System.in);
        //int a=s.nextInt();
        int b=s.nextInt();
        
        for(int i=2;i<b;i++)
        {
            int flag=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                flag++;
            }
        
        if(flag==0)
        System.out.print(i+" ");
            
        }
    }
}

