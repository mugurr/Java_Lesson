import model.SomeClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int a;
        int b;

        SomeClass someClass0 = new SomeClass(10);
        SomeClass someClass1 = new SomeClass(11);
        SomeClass someClass2 = new SomeClass(12);
        SomeClass someClass3 = new SomeClass(13);
        SomeClass someClass4 = new SomeClass(14);


        a = SomeClass.SOME_FINAL_STATIC_FIELD;

        SomeClass.someStaticField = 15;


        //someClass0.someField = 12;
        b = someClass0.someField;

        System.out.println("SOME_FINAL_STATIC_FIELD: " + SomeClass.SOME_FINAL_STATIC_FIELD);
        System.out.println("someStaticField: " + SomeClass.someStaticField);
        System.out.println("someField0: " + someClass0.someField);

        System.out.println("someField1: " + someClass1.someField);

        someClass1.sum(someClass2);

        System.out.println("someField1: " + someClass1.someField);

        SomeClass result = SomeClass.sum(someClass1, someClass2);

        System.out.println("result: " + result.someField);

    }
}