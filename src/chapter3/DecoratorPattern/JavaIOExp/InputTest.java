package chapter3.DecoratorPattern.JavaIOExp;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/chapter3/DecoratorPattern/JavaIOExp/test.txt")));
            int c;
            while ((c = in.read()) > 0) {
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
