package model;

public class SomeClass {
    public static int someStaticField;
    public final static int SOME_FINAL_STATIC_FIELD = 10;
    public int someField;


    static {
        someStaticField = 8;
    }
    {
        someField = 2;
        someStaticField++;
        System.out.println(someStaticField);
    }


    public SomeClass(int value) {
        this.someField = value;
    }

    public void sum(SomeClass other) {
        this.someField += other.someField;
    }

    public static SomeClass sum(SomeClass a, SomeClass b) {
        return new SomeClass(a.someField + b.someField);
    }

//    public SomeClass sum1(SomeClass a, SomeClass b) {
//        return new SomeClass(a.someField + b.someField);
//    }
    public static class SecondClass {
        public int age;

        public static class ThreeClass {

        }

    }

}


