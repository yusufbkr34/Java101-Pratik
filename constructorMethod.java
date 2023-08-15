class Test {

    private Test() {
        System.out.println("This is a private constructor.");
    }

    public static void instanceMethod() {

        Test obj = new Test();
    }

}

class constructorMethod {
    public static void main(String[] args) {

        Test.instanceMethod();
    }
}
