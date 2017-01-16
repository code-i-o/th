class abc
{
int a=100;
void show(){System.out.println(a);}
}
class sup3 extends abc
{
int a=200;
void show()
{System.out.println(a);}
public static void main(String[] ara)
{
new sup3().show();
}
}