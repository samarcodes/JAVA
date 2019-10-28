class rectangle
{
int l,b;
void setval(int x,int y)
{
l=x;
b=y;
}
int getRarea()
{
return l*b;
}
}
class triangle extends rectangle
{
int b,h;
float a;
void setdata(int u,int v)
{
b=u;
h=v;
}
float getTarea()
{
a=0.5f*b*h;
return a;
}
}
class singleinheritence
{
public static void main(String[] args)
{
triangle t = new triangle();
t.setval(50,8);
t.setdata(17,7);
System.out.println("Area of rectangle using Triangle object: "+t.getRarea());
System.out.println("Area of triangle using Triangle object: "+t.getTarea());
}
}