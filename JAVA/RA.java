class Rectangle
{
int l,b;
void getdata(int x,int y)
{
	l=x;
	b=y;
}
int Area()
{
	int area=l*b;
	return area;
}
}

class RA
{
public static void main(String args[])
{
Rectangle a1 = new Rectangle();
a1.getdata(5,100);
int area = a1.Area();
System.out.println(area);
}
}