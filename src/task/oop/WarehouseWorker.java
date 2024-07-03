package task.oop;

import java.sql.SQLOutput;

public class WarehouseWorker extends Employee {
    String status1;
    String gender;

    WarehouseWorker(String name, int age, String gender, String status1) {
        super(name, age);
        this.status1 = status1;
        this.gender = gender;
    }

    @Override
    public void say() {
        System.out.println("я " + name + " ,мне " + age + " лет, я " + gender);
    }
    public void status (){
        System.out.println("я "+ name + "  и я "+status1);
    }
}