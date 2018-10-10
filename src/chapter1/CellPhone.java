package chapter1;


//抽象类与抽象方法，实现多态的一种方式
public class CellPhone extends TelPhone{

    @Override
    public void call(){
        System.out.println("我可以打电话！");
    }
    @Override
    public void message() {
        System.out.println("我可以发短信！");
    }

    public static void main(String[] args) {

        CellPhone cp = new CellPhone();
        cp.call();
        cp.message();
    }

}
