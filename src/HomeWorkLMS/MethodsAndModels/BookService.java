package HomeWorkLMS.MethodsAndModels;

import HomeWorkLMS.Models.Book;

import java.util.List;

public interface BookService {
    void saveBook(Long libraryId, Book book);

    void getAllBooks(Long libraryId);

    Book getBookById(Long libraryId, Long bookId);

    String deleteBook(Long libraryId,Long bookId);

    void clearBooksByLibraryId(Long libraryId);
}
