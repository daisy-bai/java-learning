package chapter1;

import java.io.*;

public class StreamDemo {
    public static void main(String[] args) throws IOException{

       /* BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按'q'退出");
        char c;
        do{
            c=(char)br.read();
            System.out.println(c);
        }while(c!='q');

        String str;
        do{
            str=br.readLine();
            System.out.println(str);
        }while(!str.equals("end"));

        int b;
        b='A';
        System.out.write(b);
        System.out.write('\n');*/

        //InputStream f=new FileInputStream("~/IdeaProjects/java-learnin/");

        //File file=new File("~/IdeaProjects/java-learnin/");
        //InputStream input=new FileInputStream(file);

        //OutputStream output=new FileOutputStream(file);

        try {
            byte bWrite[] = {11,21,3,40,5};
            File f = new File("test.txt");
            OutputStream os = new FileOutputStream(f);
            OutputStreamWriter writer = new OutputStreamWriter(os, "UTF-8");
            writer.append("中文输入");
            // 写入到缓冲区
            writer.append("\r\n");
            // 换行
            writer.append("English");
            // 刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入

            for (int x = 0; x < bWrite.length; x++) {
               // os.write(bWrite[x]);
               // writer.append((char)bWrite[x]);
                writer.write(bWrite[x]);
            }

            writer.close();
            // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉

            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();
            InputStreamReader reader = new InputStreamReader(is, "UTF-8");

            StringBuffer sb = new StringBuffer();
            while (reader.ready()) {
                sb.append((char) reader.read());
                // 转成char加到StringBuffer对象中
            }
            System.out.println(sb.toString());
            reader.close();

            /*for (int i = 0; i < size; i++) {
                System.out.print((char)is.read() + "  ");
            }*/
            is.close();

        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
