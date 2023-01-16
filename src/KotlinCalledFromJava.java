import java.util.ArrayList;
import java.util.List;

class KotlinCalledFromJava {

    public String publicField;
    private String field;

    String getField() {
        return field;
    }

    void setField(String value) {
        field = value;
    }

    static String staticMethod() {
        return "Hello from static method";
    }

    void callJava() {
        var javaToCall = new JavaCalledFromKotlin();
        javaToCall.setField("Hallo Java");
        var valueFromField = javaToCall.getField();
        System.out.println(valueFromField);
        var valueFromStaticMethod = JavaCalledFromKotlin.staticMethod();
        System.out.println(valueFromStaticMethod);
    }

    void javaStyleVsKotlinStyle() {
        List<String> myArrayList = new ArrayList<>();
        List<String> myList = List.of("Hallo", "Welt");
        var lowercaseList = myList.stream().map(String::toLowerCase).toList();

        lowercaseList.forEach(System.out::println);

        lowercaseList.forEach(x -> System.out.println(">>" + x + "<<"));
    }

}


