package subject3.ex4;

public class Book implements Cloneable{

    private String bookName;
    private String author;

    public Book(Book book) {
        this(book.bookName, book.author);
    }

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showBookInfo() {
        System.out.println(bookName + "," + author);
    }

//    @Override
//    public Object clone() {
//        try {
//            return (Book) super.clone();
//        } catch (CloneNotSupportedException e) {
//            return new Book(this.bookName, this.author);
//        }
//    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Book(bookName, author);
    }
}
