import java.util.Scanner;
public class Array
{
 public static void main(String[]args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter size");
 int size=sc.nextInt();
 int[]a=new int[size];
{
 for(int i=0;i<a.length;i++)
{
 a[i]=sc.nextInt();
}
 for(int i=0;i<a.length;i++)
{
 int c=1;
 if(i!=a.length) 
{
 if(a[i]!=0)
{
 for(int j=i+1;j<a.length;j++)
{
 if(a[i]==a[j])
{
 a[j]=0;
 c++;
}
}
 System.out.println("count of :"+a[i]+"="+c);
}
}
 System.out.println("count of :"+a[i]+"="+c);
}
}
}
}

