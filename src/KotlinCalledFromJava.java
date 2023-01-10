class KotlinCalledFromJava {


    private String privateField;

    String getField() {
        return privateField;
    }

    void setField(String value) {
        privateField = value;
    }

    static String staticMethod() {
        return "Hello from static method";
    }

    private void callJava() {
        var javaToCall = new JavaCalledFromKotlin();
        javaToCall.setField("Hallo Java");
        var value = javaToCall.getField();
    }
}


