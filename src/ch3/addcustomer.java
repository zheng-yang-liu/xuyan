package ch3;

public class addcustomer {
	public static void main(String[] args) {
        customer1 cus1=new customer1();
        cus1.name="��һ";
        cus1.age=13;
        cus1.vip=true;
        customer1 cus2=new customer1();
        cus2.name="�ټ�";
        cus2.age=25;
        cus2.vip=false;
        customer2 customer=new customer2();
        customer.addCustome(cus1);
        customer.addCustome(cus2);
        customer.RemoveStudent();
    }

}
