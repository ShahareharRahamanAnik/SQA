package abstracts;

public class home1 extends home{
    @Override
    public void function1() {
        System.out.println("kkl");
    }
    public void function2() {
        System.out.println("ssss");
    }

    public static void main(String[] args) {
        home1 h = new home1();
        h.function1();
        h.function2();
    }
}

