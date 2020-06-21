
import java.lang.reflect.Method;
import java.util.Random;
import java.lang.reflect.Method; 

class Main
{
    private String var1;

    private void name() {
        int a = 43;
        System.out.println(a);
    }
}


class first
{
    public static void main(String[] args) throws Exception  {
       Main obj = new Main();

       Method m = Main.class.getDeclaredMethod("name");
       m.setAccessible(true);

       m.invoke(obj);
    }
}