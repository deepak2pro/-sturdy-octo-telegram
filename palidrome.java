import java.io.*;
import java.util.*;
public class palidrome
{
public static void main(string[] args)
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
while(a>0){
int rmd=a%10;
int rem=rem*10+rmd;
a=a/10;}
if(rem==a)
System.out.print("palidrome");
else
System.out.print("not");
}
}
