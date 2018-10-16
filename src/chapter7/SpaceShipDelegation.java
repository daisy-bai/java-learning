package chapter7;

//代理模式
class SpaceControls{
    void up(int velocity){ }
    void down(int velocity){}
    void left(int velocity){}
    void right(int velocity){}
    void forward(int velocity){}
    void back(int velocity){}
    void turboBoost(){}

}
public class SpaceShipDelegation {
    private String name;
    private SpaceControls controls=new SpaceControls();
    public SpaceShipDelegation(String name){
        this.name=name;
    }
    void back(int velocity){
        controls.back(velocity);
    }
    void up(int velocity){
        controls.up(velocity);
    }
    void down(int velocity){
        controls.down(velocity);
    }
    void left(int velocity){
        controls.left(velocity);
    }
    void right(int velocity){
        controls.right(velocity);
    }
    void forward(int velocity){
        controls.forward(velocity);
    }

    void turboBoost(){
        controls.turboBoost();
    }
    public static void main(String[] args){
        SpaceShipDelegation shipDelegation=new SpaceShipDelegation("NSEA Protector");
        shipDelegation.forward(100);
    }
}
