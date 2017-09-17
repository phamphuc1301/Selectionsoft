import javafx.print.Printer;

import java.io.*;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileIO {
    public int[] FileIn() throws IOException {
        FileInputStream input = new FileInputStream("Soft.inp");
        Scanner scanner = new Scanner(input);
        int n = scanner.nextInt();
        int[] data = new int[n];
        while (scanner.hasNextLine()){
            for (int i = 0; i < n ; i++) {
                data[i] = scanner.nextInt();
            }
        }
        scanner.close();
        input.close();
        return data;
    }
    public void FileOut(int[] arr) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("Soft.out",false);
        PrintWriter printer = new PrintWriter(outputStream);
        for (int i = 0; i <arr.length ; i++) {
            printer.print(arr[i]+" " );
        }
        printer.close();
    }
}
