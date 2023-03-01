import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scan.next();
        System.out.println("Hello " + name + "!");
    }
}