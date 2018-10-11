
import java.io.*;
import java.net.Socket;

/**
 * java.net.Socket 类代表客户端和服务器都用来互相沟通的套接字。
 * 客户端要获取一个 Socket 对象通过实例化 ，
 * 而服务器获得一个 Socket 对象则通过 accept() 方法的返回值。
 */
public class GreetingClient {
    public static void main(String[] args){
        String serverName=args[0];
        int port=Integer.parseInt(args[1]);
        try{
            System.out.println("连接到主机：" + serverName + " ，端口号：" + port);

            Socket client=new Socket(serverName,port);

            //客户端的输出流
            System.out.println("远程主机地址：" + client.getRemoteSocketAddress());
            OutputStream putToServer=client.getOutputStream();
            DataOutputStream out=new DataOutputStream(putToServer);
            out.writeUTF("hello from"+client.getLocalSocketAddress());

            //客户端输入流
            InputStream inFromServer=client.getInputStream();
            DataInputStream in=new DataInputStream(inFromServer);
            System.out.println("服务器响应： " + in.readUTF());

            client.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
