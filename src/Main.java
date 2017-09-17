import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;

public class Main

{
    public static void main(String[] args) throws IOException {
        FileIO IO = new FileIO();
        IO.FileIn();
        SelectionSoft selectionSoft = new SelectionSoft();
        int[] kq = selectionSoft.selectionSort(IO.FileIn());
        IO.FileOut(kq);
    }
}
