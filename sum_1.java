import java.io.*;
import java.util.*;
public class sum_1
{
    public static void main(String[] args)
    {
        int sum=0;
        for(int i=0;i<5;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
        int add=0;
        for(int i=15;i<45;i++)
        {
            if(i%2!=0)
            add=add+i;
        }
        System.out.println(add);
    }
}
