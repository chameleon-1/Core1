package task.oop;

public abstract class Employee {
int age;
String name;

public Employee(String name, int age){
    this.name=name;
    this.age=age;
}

public abstract void say();

}