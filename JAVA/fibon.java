class fibon
{
public static void main(String args[])
{
int a=0,b=1,c=0,i;
System.out.println("Fibonacci series upto 5 terms is:\n");
System.out.println(a+" ");
System.out.println(b+" ");
while(c<=3)
{
c=a+b;
a=b;
b=c;
System.out.println(c+" ");
}
}
}