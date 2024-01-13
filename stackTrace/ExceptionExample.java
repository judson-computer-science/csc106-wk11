public class ExceptionExample {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws Exception {
        method2();
    }

    public static void method2() throws Exception {
        method3();
    }

    public static void method3() throws Exception {
        throw new Exception("Something went wrong in method 3");
    }
}

