package ch1;
import java.util.*;
public class Menu {
	 public static void main(String[] args) {
			// TODO �Զ����ɵķ������
	        Menu menu=new Menu();
	        menu.showLoginMenu();
		}
	public void showLoginMenu() {
        Scanner input = new Scanner(System.in);
        String name;
        String password;
        System.out.println("��¼�˵�");
        System.out.println("1����¼�˵�");
        System.out.println("2���˳�");
        System.out.println("****************************");
        System.out.print("��ѡ��");
        switch (Choice()) {
            case 1:
                System.out.print("�������û�����");
                name = input.next();
                System.out.print("���������룺");
                password = input.next();
                if (name.equals("�Լ���") && password.equals("180121127")) {
                    showMainMenu();
                } else {
                    System.out.println("�û������������");
                    showLoginMenu();
                }
                break;
            case 2:
                System.out.println("���˳�");
                break;
        }
    }
    //    ʵ����ʾ���˵�
    public void showMainMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("****************************");
        System.out.println("���˵�");
        System.out.println("1���ͻ���Ϣ����");
        System.out.println("2������ع�");
        System.out.println("****************************");
        System.out.print("��ѡ�񣺣�����0������һ����");
        switch (Choice()) {
            case 0:
                showLoginMenu();
                break;
            case 1:
                showCustMenu();
                break;
            case 2:
                showSendGMenu();
                break;
        }
    }
    //    ʵ����ʾ�ͻ���Ϣ����˵�
    public void showCustMenu() {
        Scanner input=new Scanner(System.in);
        System.out.println("****************************");
        System.out.println("�ͻ���Ϣ����˵�");
        System.out.println("****************************");
        System.out.print("��ѡ�񣺣�����0������һ����");
        switch (Choice()){
            case 0:
                showSendGMenu();
                break;
        }
    }

    //    ʵ����ʾ��������˵�
    public void showSendGMenu() {
        System.out.println("****************************");
        System.out.println("��������˵�");
        System.out.println("1�����˴����");
        System.out.println("2���ͻ��齱");
        System.out.println("3�����տ���");
        System.out.println("****************************");
        System.out.print("��ѡ�񣺣�����0������һ����");
        switch (Choice()){
            case 0:
                showSendGMenu();
                break;
            case 1:
                System.out.println("���˴����");
                break;
            case 2:
                System.out.println("�ͻ��齱");
                break;
            case 3:
                System.out.println("���տ���");
                break;
        }
    }
    public int Choice(){
        Scanner input=new Scanner(System.in);
        int choice;
        choice =input.nextInt();
        return choice;

    }
   

}
