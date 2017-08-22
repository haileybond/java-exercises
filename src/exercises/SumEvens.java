package exercises;

public class SumEvens {
    //From a list of integers, find the sum of all even ints
    public static void main(String[] args) {
        Integer SumOfEvens = 0;
        Integer NumOfEvens = 0;
        int[] IntList = {2, 3, 11, 42, 20, 32, 20, 15, 12, 10, 14, 13, 7, 8};
        for(int eachInt : IntList) {
            if ( eachInt % 2 == 0) {
                SumOfEvens = SumOfEvens + eachInt;
                NumOfEvens ++;
                continue;
            }
        }
        System.out.println("A total of " + NumOfEvens + " even numbers were found in this list.");
        System.out.println("The sum of all even numbers in this list is " + SumOfEvens + ".");
    }


    }
