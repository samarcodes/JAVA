class add
{
int a,b;
void getdata(int x,int y)
{
a=x;
b=y;
}
int summ()
{
int sum = a+b;
return sum;
}
}
class add2n
{
public static void main(String args[])
{
add a1=new add();
a1.getdata(5,10);
int s=a1.summ();
System.out.println("Sum = "+s); 
}
}