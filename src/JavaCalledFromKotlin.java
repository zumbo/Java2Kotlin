class JavaCalledFromKotlin {

    private String privateField;

    String getField() {
        return privateField;
    }

    void setField(String value) {
        privateField = value;
    }

    static String staticMethod() {
        return "Hello from static Java method";
    }
}
