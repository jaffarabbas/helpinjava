import java.lang.reflect.Method;

class privat
 {
     private int a;

     void geta(int a)
     {
         this.a = a;
     }

     int seta()
     {
         return this.a;
     }

     privat()
     {
         this.a=234234;
     }

     private void mon()
     {
         System.out.println(this.a);
     }

 }
 
 
 
 
 class Main //proctedd
{
   protected int a;

   Main()
   {
           this.a = 434;

           System.out.println(this.a);
   }
}


class access
{
    public static void main(String[] args) throws Exception{
        Main obj = new Main();
        privat check = new privat();//invoking method

        System.out.println("Private vaiable with a private method");

        Method m = privat.class.getDeclaredMethod("mon");

        m.setAccessible(true);

        m.invoke(check);
    }
}