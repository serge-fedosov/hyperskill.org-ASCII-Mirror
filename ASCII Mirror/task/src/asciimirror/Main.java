package asciimirror;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input the file path:");

        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();

        List<String> list = new ArrayList<>();
        File file = new File(filename);
        int maxLength = 0;
        try (Scanner scannerFile = new Scanner(file)) {
            while (scannerFile.hasNext()) {
                String newStr = scannerFile.nextLine();
                if (maxLength < newStr.length()) {
                    maxLength = newStr.length();
                }
                list.add(newStr);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        for (String str : list) {
            str = enlargeString(str, maxLength);
            System.out.println(str + " | " + str);
        }
    }

    public static String enlargeString(String str, int length) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = sb.length(); i < length; i++) {
            sb.append(" ");
        }

        return sb.toString();
    }
}
