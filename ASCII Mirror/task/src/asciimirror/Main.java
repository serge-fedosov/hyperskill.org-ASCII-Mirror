package asciimirror;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input the file path:");

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(str);

        System.out.println(
                "            ^__^\n" +
                "    _______/(oo)\n" +
                "/\\/(       /(__)\n" +
                "   | w----||    \n" +
                "   ||     ||    ");

    }
}
