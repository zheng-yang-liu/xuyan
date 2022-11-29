package ch2;
import java.util.*;
public class Customer2 {
	public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        CustomerName customerName=new CustomerName();
        String judge;
        int count=0;
        for (int i = 0;; i++) {
            System.out.print("请输入客户姓名：");
            customerName.Addname(input.next(),count++);
            System.out.print("继续输入吗？（y/n）");
            judge=input.next();
            if (judge.equals("n")){
                break;
            }
        }
        customerName.Showname(count++);
        customerName.Modify(count++);
    }

}
