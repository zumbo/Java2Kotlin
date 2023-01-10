class KotlinCalledFromJava {


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
}


