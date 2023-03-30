import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
public class Main {
    public static User login(){
        System.out.println("请输入你的名字：");
        Scanner sc =new Scanner(System.in);
        String name= sc.nextLine();
        System.out.println("请输入你的身份：1.管理员  2.普通用户");
        int choice =sc.nextInt();
        if(choice==1){
            return new AdminUser(name);
        }else {
            return new NormalUser(name);
        }
    }
    public static void main(String[] args) {
        //准备图书
        BookList bookList=new BookList();
        //登录
        User user=login();
        int choice=user.menu();//动态绑定,向上转型
        user.doOperation(choice,bookList);
    }
}