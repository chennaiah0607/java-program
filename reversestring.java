import java.util.*;
public class Main{
public static void Main(String[] args){
Scanner sc=new Scanner(System.in);
string a=sc.nextLine();
string b="";
for(int i=a.length()-1;i>-1;i--){
b=b+a.charAt(i);
}
System.out.println(b);
}
}