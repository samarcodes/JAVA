class mathoperation
{
static float mul(float x, float y)
{
	return x*y;
}
static float div(float x, float y)
{
	return x/y;
}
}

class mathapp
{
public static void main(String args[])
{
float a = mathoperation.mul(4.0,5.0); 
float b = mathoperation.div(a,2.0);
System .out.println(b);
}
}