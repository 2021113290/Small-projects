package user;

import book.BookList;
import operation.IOperation;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2023-03-30
 * Time: 19:59
 */
public abstract class User {
    protected String name;//用户名
    protected IOperation[] iOperations;
    public User(String name){
        this.name=name;
    }
    public abstract int menu();
    public void doOperation(int choice , BookList bookList){
        this.iOperations[choice].work(bookList);
    }
}
