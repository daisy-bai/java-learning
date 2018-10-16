package chapter5;

public class ShowProperties {
    public static void main(String[] args){
       /* System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));*/
       Dog dog1=new Dog();
        dog1.name="spot";
        dog1.says="Ruff";
        System.out.println(dog1.name);
        System.out.println(dog1.says);

        Dog dog2=new Dog();
        dog2.name="scruffy";
        dog2.says="Wurf!";
        System.out.println(dog2.name);
        System.out.println(dog2.says);

        Dog dog=dog1;
        System.out.println(dog1.name==dog.name);
        System.out.println(dog1.name.equals(dog.name));
    }
}
class Dog{
    String name;
    String says;
}
