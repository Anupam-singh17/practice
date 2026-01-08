package HRITIK;
public class Anupam{
    public static void main(String[] args) {
        int a = 23 ;
        int b = 26;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a is "+a);
        System.out.println("b is "+b);
    }
}