package ch3;

public class customer2 {
	 //����һ�����Զ��������
    customer1[] cus=new customer1[10];

    //��ӿͻ�
    public void addCustome(customer1 Cus){
        for (int i = 0; i < cus.length; i++) {
            if (cus[i] == null){
                cus[i]=Cus;
                break;
            }
        }
    }
    //��ʾ�ͻ���Ϣ
    public void RemoveStudent(){
        System.out.println("�ͻ���Ϣ��");
        for (int i = 0; i < cus.length; i++) {
            if(cus[i] != null){
                //��Stu�����ʾ��Ϣ�ķ������������ʾ
                cus[i].ShowInfo();
            }
        }
    }

}
