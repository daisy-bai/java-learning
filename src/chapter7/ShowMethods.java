package chapter7;

import java.lang.reflect.*;
import java.util.regex.Pattern;

import static chapter6.Print.print;

public class ShowMethods {

    private static String usage="usage:\n"+"ShowMethods qualified.class.name\n";
    private static Pattern p=Pattern.compile("\\w+\\.");
    public static void main(String[] args){
        if(args.length<1){
            print(usage);
            System.exit(0);
        }
        int lines=0;
        try{
            Class<?> c=Class.forName(args[0]);
            Method[] methods=c.getMethods();
            Constructor[] constructors=c.getConstructors();
            if(args.length==1){
                for(Method m:methods){
                    print(p.matcher(m.toString()).replaceAll(""));
                }
                for(Constructor ch:constructors){
                    print(p.matcher(ch.toString()).replaceAll(""));
                }
                lines=methods.length+constructors.length;
            }
            else {
                for(Method m:methods){
                    if(m.toString().indexOf(args[1])!=-1){
                        print(p.matcher(m.toString()).replaceAll(""));
                        lines++;
                    }

                }
                for(Constructor ch:constructors){
                    if(ch.toString().indexOf(args[1])!=-1){
                        print(p.matcher(ch.toString()).replaceAll(""));
                        lines++;
                    }

                }
                lines=methods.length+constructors.length;
            }
        }catch (ClassNotFoundException e){
            print("No such class:"+e);
        }
    }
}
