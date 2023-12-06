package HomeWorkLMS.Models;

import HomeWorkLMS.Enums.Genre;

public class Book {
    private long id;
    private String name;
    private String author;
    private Genre genre;

    @Override
    public String toString() {
        return "Book:\n" +
                " -> id = " + id +
                " -> name = " + name + '\'' +
                " -> author = " + author + '\'' +
                " -> genre = " + genre +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
