package operation;

import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2023-03-30
 * Time: 19:50
 */
public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书！");
        System.out.println("请输入你要删除的书的姓名");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        int current= bookList.getUsedSize();
        for (int i = 0; i < current; i++) {
            if(name.equals(bookList.getBook(i).getName())){
                System.out.println("找到该图书了");
                for (int j = i; j < current-1; j++) {
                    bookList.setBooks(j,bookList.getBook(j+1));
                }
                System.out.println("删除成功！");
            }
        }
        bookList.setUsedSize(current-1);
    }
}
