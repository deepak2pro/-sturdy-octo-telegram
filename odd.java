import java.io.*;
import java.util.*;
public class odd
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
for(int i=a;i<b;i++)
{
if(i%2!=0)
System.out.print(i);
else
System.out.print("even");
}
}
}
