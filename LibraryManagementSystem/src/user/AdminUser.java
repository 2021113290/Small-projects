package user;

import book.BookList;
import operation.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2023-03-30
 * Time: 20:00
 */
public class AdminUser extends User{
    public AdminUser(String name) {
        super(name);
        this.iOperations=new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation()
        };
    }
    public int menu(){
        System.out.println("hello "+this.name+",欢迎来到工大图书室");
        System.out.println("1.查找图书！");
        System.out.println("2.新增图书！");
        System.out.println("3.删除图书！");
        System.out.println("4.显示图书！");
        System.out.println("0.退出系统！");
        Scanner sc=new Scanner(System.in);
        int choice= sc.nextInt();
        return choice;
    }

}
