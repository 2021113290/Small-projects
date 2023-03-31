package book;

/**
 * Created with IntelliJ IDEA.
 * Description:书
 * User: xinyu
 * Date: 2023-03-30
 * Time: 19:11
 */
public class Book {
    private String name;
    private String author;
    private int price;
    private String type;
    private boolean isBorrowed;
//    构造方法不加isBorrowed，因为boolea默认就是false，即未被借出

    public Book(String name, String author, int price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ((isBorrowed==true)?",已经借出":",未借出") +
                '}';
    }
}
