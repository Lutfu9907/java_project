package OOP;

class Student{

    private String name;
    private int age;

    Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
       return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name=name;
    }

}
public class Main {
    public static void main(String[] args) {
        
        Student lutfu= new Student("Lutfu",25);
        Student osman=new Student("osman",24);

        System.out.println(lutfu.getName());  
        System.out.println(lutfu.getAge());

        System.out.println("----------");

        System.out.println(osman.getName());  
        System.out.println(osman.getAge());
    }
}
