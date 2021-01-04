public class Main {
    public static void main(String[] args) {
        boolean test = TeenNumberChecker.hasTeen(9, 99, 19);
        System.out.println(test);
        test = TeenNumberChecker.hasTeen(23, 15, 42);
        System.out.println(test);
        test = TeenNumberChecker.hasTeen(22, 23, 34);
        System.out.println(test);
        test = TeenNumberChecker.isTeen(9);
        System.out.println(test);
        test = TeenNumberChecker.isTeen(13);
        System.out.println(test);

    }
}
