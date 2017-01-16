class abc
{	int a=100;	}
class sup1 extends abc
{
int a=200;
void show()
{
System.out.println(a);
System.out.println(a);
}
public static void main(String[] ara)
{
new sup1().show();
}
}