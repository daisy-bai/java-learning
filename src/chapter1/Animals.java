package chapter1;

/*接口不能用于实例化对象
  接口中所有的方法是抽象方法
  接口成员是 static final 类型
  接口支持多继承*/

interface Animals {
    int y=5;////是 static final 类型
    public void eat();
    public void travel();
}
