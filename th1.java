class th1
{
int a,b;
th1(int p,int q)//constructor
{a=p;	b=q;}
void show()
{System.out.println(a);System.out.println(b);}
public static void main(String[] args)
{
th1 t=new th1(100,200);
t.show();
}
}