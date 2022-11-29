package ch1;

import java.util.*;
public class Commodity {
    int money = 3000;
    public void GuessMoney() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <= 3; i++) {
            System.out.print("请猜测“34 寸纯平彩电：");
            money = input.nextInt();
            if (i == 3) {//判断次数，上线退出
                System.out.println("4次内没有猜对，下次再努力吧！");
                break;
            }
            if (money == 1200) {
                System.out.println("猜对了！");
                break;
            } else if (money > 1200) {
                System.out.println("再小一些！");
            } else if (money < 1200) {
                System.out.println("再大一些！");
            }
        }


    }
}
