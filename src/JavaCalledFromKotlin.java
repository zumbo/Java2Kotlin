class JavaCalledFromKotlin {

    private String field;

    String getField() {
        return field;
    }

    void setField(String value) {
        field = value;
    }

    static String staticMethod() {
        return "Hello from static Java method";
    }
}
