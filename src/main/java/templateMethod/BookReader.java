package templateMethod;

public class BookReader {
    public static void main(String[] args) {
        BookTemplate historyBook = new HistoryBook();
        BookTemplate romanBook = new RomanBook();

        historyBook.readBook();

        System.out.println("\n====================================================================================\n");

        romanBook.readBook();
    }
}
