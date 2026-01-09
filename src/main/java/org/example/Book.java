package org.example;

public class Book extends LibraryItem{
    protected int pageCount;

    String newline = System.lineSeparator();

    public Book(String title, String author, int year, int pageCount) {
        super(title, author, year);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void readBook() {
        System.out.println("Reading " + title + " by " + author + newline +
                "Done!");
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author + " (" + year + ") - " + pageCount + " pages";
    }
}
