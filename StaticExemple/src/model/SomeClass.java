package model;

public class SomeClass {
    public static int someStaticField;
    public final static int SOME_FINAL_STATIC_FIELD = 10;
    public int someField;

//    static {
//        someStaticField = 8;
//    }


    static {
        someStaticField = 8;
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



}
