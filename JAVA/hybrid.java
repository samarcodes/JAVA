interface a
{
public void methodA();
}

interface b extends a
{
public void methodB();
}

interface c extends a
{
public void methodC();
}

class hybrid implements b,c
{
public void methodA()
{
System.out.println("calling method A");
}
public void methodB()
{
System.out.println("calling method B");
}
public void methodC()
{
System.out.println("calling method C");
}
public static void main(String args[])
{
hybrid a = new hybrid();
a.methodA();
a.methodB();
a.methodC();
}
}


