class ActorSivakumar implements Actor{
static String address="Coimbatore";
String vehicle;
int size;
ActorSivakumar(int siz,String vandi)
{
vehicle=vandi;
size=siz;
}
public static void main(String []args)
{
ActorSivakumar as = new ActorSivakumar(65,"Audi Car");
as.act();
as.dance();
as.sing();
as.speaking();
Actor ac = new ActorSivakumar();
System.out.println(ac.address);
}
ActorSivakumar()
{
}
public void act()
{
System.out.println("as");
}
public void dance()
{
System.out.println("bs");
}
public void sing()
{
System.out.println("cs");
}
public void speaking()
{
System.out.println("ds");
}
}





