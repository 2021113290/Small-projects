package operation;

import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2023-03-30
 * Time: 21:29
 */
public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书！");
        System.out.println("请输入你要借阅的图书的名字");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        int current= bookList.getUsedSize();
        for (int i = 0; i < current; i++) {
            if(name.equals(bookList.getBook(i).getName())){
                System.out.println("找到该图书了");
                bookList.getBook(i).setBorrowed(true);
                System.out.println("借阅成功！");
            }
        }
    }
}
