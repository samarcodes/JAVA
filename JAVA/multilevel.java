class car
{
public car()
{
System.out.println("class car");
}
public void veichletype()
{
System.out.println("veichle type: car");
}
}

class maruti extends car
{
public maruti()
{
System.out.println("class maruti");
}
public void brand()
{
System.out.println("brand: maruti");
}
public void speed()
{
System.out.println("max: 90 kmph");
}
}

class maruti800 extends maruti
{
public maruti800()
{
System.out.println("class maruti800");
}
public void speed()
{
System.out.println("max: 80 kmph");
}
}

class multilevel
{
public static void main(String[] args)
{
maruti800 m=new maruti800();
m.veichletype();
m.brand();
m.speed();
}
}