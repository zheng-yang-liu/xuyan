package ch2;

import java.util.*;

public class CustomerName {
	String[] names=new String[100];
    // 添加学生姓名
    public void Addname(String name,int count) {

        for (int i=0; ;i++){
            if(names[i]==null){
                names[i]=name;
                break;
            }
        }
    }
    //显示所有学生姓名
    public  void Showname(int count) {

        System.out.println("********************************");
        System.out.println("           客户姓名列");
        System.out.println("********************************");
        for (int i=0; i<count;i++){
            System.out.print(names[i]+"\t");
        }
    }
    //修改
    public  void Modify(int count){
        int sign=1;
        Scanner input=new Scanner(System.in);
        System.out.print("\n\n请输入要修改的姓名:");
        String Name=input.next();
        System.out.print("\n请输入新的客户的姓名:");
        String NewName=input.next();
        for (int i=0; i<count;i++){
            if(Name.equals(names[i])){
                names[i]=NewName;
                System.out.println("找到并修改成功");
                sign=0;
                Showname(count-1);
            }
        }
        if(sign==1){
            System.out.println("未找到该客户");
        }
    }

}
