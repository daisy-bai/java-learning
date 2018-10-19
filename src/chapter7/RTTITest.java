package chapter7;


import javax.print.attribute.standard.Destination;

class Useful{
    public void f(){ System.out.println("Userful f()");}
    public void g(){System.out.println("Userful g()");}
}
class MoreUseful extends Useful{
    public void f(){System.out.println("MoreUserful f()");}
    public void g(){System.out.println("MoreUserful g()");}
    public void u(){System.out.println("MoreUserful u()");}

}
public class RTTITest {
    public static void main(String[] args){
        Useful x=new Useful();
        Useful y=new MoreUseful();
        x.f();
        y.g();
        ((MoreUseful)y).u();

       /*MoreUseful z= (MoreUseful)x;
       z.f();
       z.g();
       z.u();*/

    }
}
