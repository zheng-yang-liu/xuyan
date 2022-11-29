package ch3;

public class Student {
    //≈≈–Ú
    public void sort(String[] names){
        String staging;
        System.out.println("****≈≈–Ú«∞****");
        for (int i = 0; i < names.length; i++){

            System.out.print(names[i]+"\t");
        }
        for (int i = 0; i < names.length-1; i++){
            if(names[i].compareTo(names[i+1])>0){
                staging=names[i];
                names[i]=names[i+1];
                names[i+1]=staging;
            }
        }
        System.out.println("\n****≈≈–Ú∫Û****");
        for (int i = 0; i < names.length; i++){

            System.out.print(names[i]+"\t");
        }

    }

    public static void main(String[] args) {
        String[] names = {"Tom", "Jack", "Merry", "Smith", "Sunny"};
        Student sortingname = new Student();
        sortingname.sort(names);
    }
}
