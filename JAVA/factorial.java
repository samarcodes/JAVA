class factorial
{
public static void main(String args[])
{
int n=5,c,fact=1;
for(c=1;c<=n;c++)
{
fact=fact*c;
}
System.out.println("factorial of "+n+"is: "+fact);
}
}