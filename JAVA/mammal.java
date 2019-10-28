interface animals
{
public void eat();
public void travel();
}
public class mammal implements animals
{
public void eat()
{
System.out.println("mammal eats");
}
public void travel()
{
System.out.println("mammal travels");
}
public int nooflegs()
{
return 0;
}
public static void main(String args[])
{
mammal m= new mammal();
m.eat();
m.travel();
}
}
