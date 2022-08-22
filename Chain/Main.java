public class Main {
    public static void main(String[] args) {
        Handler add = new Add();
        Handler mul = new Mul();

        add.setNext(mul);
        mul.setNext(null);

        Numbers numbers = new Numbers(4, 8, "divide");

        add.calc(numbers);
    }
}
