package com.main.second;

public class Book {
    private final Author author;
    private final Content content;
    private final Title title;

    public Book(Author author, Content content, Title title) {
        this.author = author;
        author.show();
        this.content = content;
        content.show();
        this.title = title;
        title.show();
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", content=" + content +
                ", title=" + title +
                '}';
    }
}
