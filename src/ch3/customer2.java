package ch3;

public class customer2 {
	 //创建一个来自对象的数组
    customer1[] cus=new customer1[10];

    //添加客户
    public void addCustome(customer1 Cus){
        for (int i = 0; i < cus.length; i++) {
            if (cus[i] == null){
                cus[i]=Cus;
                break;
            }
        }
    }
    //显示客户信息
    public void RemoveStudent(){
        System.out.println("客户信息：");
        for (int i = 0; i < cus.length; i++) {
            if(cus[i] != null){
                //用Stu类的显示信息的方法进行输出显示
                cus[i].ShowInfo();
            }
        }
    }

}
