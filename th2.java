class th2
{
th2(int p,int q)
{a=p;	b=q;}
void show()
{System.out.println(a);System.out.println(b);}
public static void main(String[] args)
{
th2 t=new th2(100,200);
th2 t1=new th2(1000,2000);
t.show();
t1.show();
}
int a,b;
}