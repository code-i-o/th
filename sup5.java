class abc
{
int a=100;
void show(){System.out.println(a);}
}
class sup5 extends abc
{
int a=200;
void show()
{super.show();System.out.println(a);}
public static void main(String[] ara)                        
{
new sup5().show();
}
}