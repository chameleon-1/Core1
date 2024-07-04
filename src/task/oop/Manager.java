package task.oop;

public class Manager extends Employee {
    String gender;

    Manager(int age, String name, String gender) {
        super(name, age);
        this.gender = gender;
    }

    @Override
    public void say() {
        System.out.println("я " + name + " ,мне " + age + " лет, я " + gender);
    }
}
