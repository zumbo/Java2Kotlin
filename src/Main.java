public class Main {
    public static void main(String[] args) {
        callKotlinFromJava();
    }

    private static void callKotlinFromJava() {
        var kotlinToBeCalled = new KotlinCalledFromJava();
        kotlinToBeCalled.setField("Hello from Java");
        var returnValue = kotlinToBeCalled.getField();
        System.out.println(returnValue);
        var staticReturnValue = KotlinCalledFromJava.staticMethod();
        System.out.println(staticReturnValue);
        kotlinToBeCalled.callJava();
    }
}
