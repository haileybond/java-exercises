package exercises;

public class FiveLetterWords {
    public static void main(String[] args) {
        String[] Words = {"Hello", "Happy", "Holiday", "Harry", "Hairy", "Hungry", "Hippo", "Hours", "Hot", "Hoot", "Hoops", "Hood", "Horror", "Handy", "Hardly"};

        for(String word : Words) {
            if (word.length() == 5) {
                System.out.println(word);
                continue;
            }
        }
    }
}
