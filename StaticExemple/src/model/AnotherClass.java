package model;

public class AnotherClass {
    SomeClass.SecondClass secondClass =new SomeClass.SecondClass();
    SomeClass.SecondClass.ThreeClass threeClass = new SomeClass.SecondClass.ThreeClass();


    public int getAge() {
        return secondClass.age;
    }



}
