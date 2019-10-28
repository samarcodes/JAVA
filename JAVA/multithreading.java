import java.lang.Thread;
class A extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("Thread A: i= "+i);
}
System.out.println("exit from thread A");
}
}
class B extends Thread
{
public void run()
{
for(int j=1;j<=5;j++)
{
System.out.println("Thread B: j= "+j);
}
System.out.println("exit from thread B");
}
}
class C extends Thread
{
public void run()
{
for(int k=1;k<=5;k++)
{
System.out.println("Thread C: k= "+k);
}
System.out.println("exit from thread C");
}
}
class multithreading
{
public static void main(String args[])
{
A a=new A();
a.run();
B b=new B();
b.run();
C c=new C();
c.run();
}
}