package book;

/**
 * Created with IntelliJ IDEA.
 * Description:书架
 * User: xinyu
 * Date: 2023-03-30
 * Time: 19:11
 */
public class BookList {
    private Book[] books=new Book[10];//最多可以放10本书
    private int usedSize;//实时记录，当前books这个数组中有多少本书
    public BookList(){
        books[0]=new Book("三国演义","罗贯中",19,"小说");
        books[1]=new Book("西游记","吴承恩",29,"小说");
        books[2]=new Book("红楼梦","曹雪芹",9,"小说");
        usedSize=3;
    }

    /**
     *
     * @param pos 此时pos位置一定是合法的
     * @return 一本书
     */
    public Book getBook(int pos){
        return books[pos];
    }

    /**
     *
     * @param pos 此时pos位置一定是合法的
     * @param book 是你要放的书
     */
    public void setBooks(int pos,Book book){
        books[pos]=book;
    }

    /**
     *
     * @return 当前的书的个数
     */
    public int getUsedSize(){
        return usedSize;
    }

    /**
     *
     * @param size 要设置的书的个数
     */
    public void setUsedSize(int size){
        usedSize=size;
    }
}
