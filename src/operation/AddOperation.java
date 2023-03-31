package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2023-03-30
 * Time: 19:47
 */
public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("增加图书！");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入增加的图书的名字");
        String name=scanner.nextLine();
        System.out.println("请输入增加的图书的作者");
        String author=scanner.nextLine();
        System.out.println("请输入增加的图书的类型");
        String type=scanner.nextLine();
        System.out.println("请输入增加的图书的价格");
        int price=scanner.nextInt();
        int current= bookList.getUsedSize();
        bookList.setBooks(current, new Book(name,author,price,type));
        bookList.setUsedSize(current+1);
        System.out.println("新增书籍成功");
    }
}
