package ch1;

import java.util.*;
public class Commodity {
    int money = 3000;
    public void GuessMoney() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <= 3; i++) {
            System.out.print("��²⡰34 �紿ƽ�ʵ磺");
            money = input.nextInt();
            if (i == 3) {//�жϴ����������˳�
                System.out.println("4����û�в¶ԣ��´���Ŭ���ɣ�");
                break;
            }
            if (money == 1200) {
                System.out.println("�¶��ˣ�");
                break;
            } else if (money > 1200) {
                System.out.println("��СһЩ��");
            } else if (money < 1200) {
                System.out.println("�ٴ�һЩ��");
            }
        }


    }
}
