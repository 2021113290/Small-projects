package operation;

import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2023-03-30
 * Time: 19:55
 */
public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统！");
        System.exit(0);
    }
}
