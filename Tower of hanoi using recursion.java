//Tower of hanoi using recursion
public class Main 
    {
        public void fun(String s,String h,String d,int n)
        {   
            if(n==1)
            {
             System.out.println("move disk 1 from"  +s+ "to"+d);
             return;
            }
              fun(s,d,h,n-1);
            System.out.println("move disk " + n + "from" + s + "to" + d);
            fun(h,s,d,n-1);
        }
        public static void main(String[]args)
        {
            Main m=new Main();
            int n=10;
            m.fun("Source","Helper","Dest",n);
        }
    }