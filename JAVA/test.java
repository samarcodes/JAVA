interface Area
{
final static float pi=3.14f;
float compute(float x,float y);
}

class rectangle implements Area
{
public float compute(float x,float y)
{
	return x*y;
}
}

class circle implements Area
{
public float compute(float x,float y)
{
	return 2*pi*x;
}
}

class test
{
public static void main(String args[])
{
rectangle rec = new rectangle();
circle cir = new circle();
System.out.println("Area of rectangle: " + rec.compute(4,5) + "\n" + "Area of circle: " + cir.compute(5,0));
}
}