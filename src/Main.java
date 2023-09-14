import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a Integer");
        int Yello = keyboard.nextInt();
        System.out.print("Enter a second Integer");
        int hello = keyboard.nextInt();
        System.out.print("Enter a Float");
        float frog = keyboard.nextFloat();
        System.out.print("Enter a double");
        double done = keyboard.nextDouble();
        System.out.print("Enter a boolean");
        boolean bean = keyboard.nextBoolean();
        System.out.println("Integer 1 = " + Yello);
        System.out.println("Integer 2 = " + hello);
        System.out.println("Float = " + frog);
        System.out.println("Double = " + done);
        System.out.println("Boolean = " + bean);
    }
}