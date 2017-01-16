class abc
{	int a=100;	}
class sup2 extends abc
{
int a=200;
void show()
{
System.out.println(super.a);
System.out.println(a);
}
public static void main(String[] ara)
{
new sup2().show();
}
}