public class SingletonTwoTest {
    public static void main(String[] args) {
        SingletonTwo one=SingletonTwo.getInstance();
        SingletonTwo two=SingletonTwo.getInstance();
        System.out.println(one);
        System.out.println(two);
}
}