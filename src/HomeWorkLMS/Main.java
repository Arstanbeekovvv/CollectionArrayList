package HomeWorkLMS;

import HomeWorkLMS.MethodsAndModels.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                1. saveLibrary;
                2. getAllLibraries;
                3. getLibraryById;
                4. updateLibrary;
                5. deleteLibrary;
                                
                6. Save Book;
                7. GetAllBooks;
                8. GetBookById;
                9. DeleteBook;
                10. ClearBooksByLibraryId;

                11. Save reader;
                12. Get all readers();
                13. Get Reader By Id;
                14. Update Reader;
                15. Assign Reader To Library;""");
        ReaderServiceImpl r = new ReaderServiceImpl();
        BookService b = new BookServiceImpl();
        LibraryService l = new LibraryServiceImpl();
        switch (new Scanner(System.in).nextLine()){
            case "1" -> {

            }
            case "2" -> {
            }
            case "3" -> {}
            case "4" -> {}
            case "5" -> {}
            case "6" -> {}
            case "7" -> {}
            case "8" -> {}
            case "9" -> {}
            case "10" -> {}
            case "12" -> {}
            case "13" -> {}
            case "14" -> {}
            case "15" -> {}
            case "0" -> {return;}
        }
    }
}
