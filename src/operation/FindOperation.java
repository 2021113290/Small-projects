package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2023-03-30
 * Time: 19:51
 */
public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书！");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要查找的书的名字：");
        String name=scanner.nextLine();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book=bookList.getBook(i);
            if(name.equals(book.getName())){
                System.out.println("找到了这本书！"+book);
                return;
            }
        }
        System.out.println("没有找到该书！");
    }
}
