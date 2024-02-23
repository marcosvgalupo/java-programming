package course.section1;

import java.util.Scanner;

public class ReadingInputExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        
        System.out.println("Type your name: ");
        name = input.nextLine();

        System.out.println("Hello, " + name + "!");
        input.close();
    }
}