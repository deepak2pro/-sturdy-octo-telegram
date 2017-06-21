import java.io.*;
import java.util.*;
public class power
{
public static void main(String[] args);
{
Scanner s=new Scanner(System.in)
long pow=1;
long a=s.nextLong();
for(int i=0;i<a;i++)
{
pow=pow*a;
}
System.out.print(pow);
}
}
