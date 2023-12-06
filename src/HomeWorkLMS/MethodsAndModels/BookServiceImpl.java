package HomeWorkLMS.MethodsAndModels;

import HomeWorkLMS.Db.DateBase;
import HomeWorkLMS.Models.Book;

import java.util.List;

public class BookServiceImpl implements BookService{
    @Override
    public void saveBook(Long libraryId, Book book) {
        DateBase.books.add(book);
        for (int i = 0; i < DateBase.libraries.size(); i++) {
            if(DateBase.libraries.get(i).getId() == libraryId){
                DateBase.libraries.get(i).getBooks().add(book);
            }
        }
    }

    @Override
    public void getAllBooks(Long libraryId) {
        for (int i = 0; i < DateBase.libraries.size(); i++) {
            if(DateBase.libraries.get(i).getId() == libraryId){
                for (Book book : DateBase.libraries.get(i).getBooks()) {
                    System.out.println(book);
                }
            }
        }
    }

    @Override
    public Book getBookById(Long libraryId, Long bookId) {
        for (int i = 0; i < DateBase.libraries.size(); i++) {
            if(DateBase.libraries.get(i).getId() == libraryId){
                for (int i1 = 0; i1 < DateBase.libraries.get(i).getBooks().size(); i1++) {
                    if(DateBase.libraries.get(i).getBooks().get(i1).getId() == bookId){
                        return DateBase.libraries.get(i).getBooks().get(i1);
                    }
                }
            }
        }
        return null;
    }

    @Override
    public String deleteBook(Long libraryId, Long bookId) {
        for (int i = 0; i < DateBase.libraries.size(); i++) {
            if(DateBase.libraries.get(i).getId() == libraryId){
                for (int i1 = 0; i1 < DateBase.libraries.get(i).getBooks().size(); i1++) {
                    if(DateBase.libraries.get(i).getBooks().get(i1).getId() == bookId){
                        DateBase.libraries.get(i).getBooks().remove(i1);
                        return "Successful deleted book!!!";
                    }
                }
            }
        }
        return "Book is not find!!!";
    }

    @Override
    public void clearBooksByLibraryId(Long libraryId) {
        for (int i = 0; i < DateBase.libraries.size(); i++) {
            if(DateBase.libraries.get(i).getId() == libraryId){
                DateBase.libraries.get(i).getBooks().clear();
            }
        }
    }
}
