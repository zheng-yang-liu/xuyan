package ch2;

import java.util.*;

public class CustomerName {
	String[] names=new String[100];
    // ���ѧ������
    public void Addname(String name,int count) {

        for (int i=0; ;i++){
            if(names[i]==null){
                names[i]=name;
                break;
            }
        }
    }
    //��ʾ����ѧ������
    public  void Showname(int count) {

        System.out.println("********************************");
        System.out.println("           �ͻ�������");
        System.out.println("********************************");
        for (int i=0; i<count;i++){
            System.out.print(names[i]+"\t");
        }
    }
    //�޸�
    public  void Modify(int count){
        int sign=1;
        Scanner input=new Scanner(System.in);
        System.out.print("\n\n������Ҫ�޸ĵ�����:");
        String Name=input.next();
        System.out.print("\n�������µĿͻ�������:");
        String NewName=input.next();
        for (int i=0; i<count;i++){
            if(Name.equals(names[i])){
                names[i]=NewName;
                System.out.println("�ҵ����޸ĳɹ�");
                sign=0;
                Showname(count-1);
            }
        }
        if(sign==1){
            System.out.println("δ�ҵ��ÿͻ�");
        }
    }

}
