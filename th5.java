class th5
{
int a,b;
th5(int a,int b)
{this.a=a;	this.b=b;}
void show()
{System.out.println(a);System.out.println(b);}
public static void main(String[] args)
{
th5 t=new th5(100,200);
t.show();
}
}