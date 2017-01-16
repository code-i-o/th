class fin7
{
int a;
fin7(int a)
{
this.a=a;
}
void show(){	System.out.println(a);	}
public static void main(String[] args)
{
final fin7 f=new fin7(1000);
fin7 f1=new fin7(100);
f=f1;
f.show();
f1.show();
}
}