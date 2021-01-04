public class Main {
    public static void main(String[] args) {
        boolean test;
        test = PlayingCat.isCatPlaying(true, 10);
        System.out.println(test);
        test = PlayingCat.isCatPlaying(false, 36);
        System.out.println(test);
        test = PlayingCat.isCatPlaying(false, 35);
        System.out.println(test);
    }
}
