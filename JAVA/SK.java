class Area
{
static float ra(float l, float b)
{
	return l*b;
}
static float ca(float r)
{
	return 3.14f*r*r;
}
}

class SK
{
public static void main(String args[])
{
float a = Area.ra(5.9f,6.2f); 
float b = Area.ca(5.2f);
System .out.println(a);
System .out.println(b);
}
}