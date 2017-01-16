class th3
{
int a,b;
th3(int p,int q)
{a=p;	b=q;}
void show()
{System.out.println(this.a);System.out.println(this.b);}
public static void main(String[] args)
{
th3 t=new th3(100,200);
th3 t1=new th3(1000,2000);
t.show();
t1.show();
}
}