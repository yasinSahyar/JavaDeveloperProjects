package Exercises;

public class DuplicatedCharsCounter {

    public static int countDuplicates(String input) {

        int[] charFrequency = new int[256];


        for (char c : input.toCharArray()) {

            char lowercaseChar = Character.toLowerCase(c);


            charFrequency[lowercaseChar]++;
        }


        int duplicateCount = 0;
        for (int frequency : charFrequency) {
            if (frequency > 1) {
                duplicateCount++;
            }
        }

        return duplicateCount;
    }

    public static void main(String[] args) {
        System.out.println(countDuplicates("abcde")); // 0
        System.out.println(countDuplicates("aabbcde")); // 2
        System.out.println(countDuplicates("aabBcde")); // 2
        System.out.println(countDuplicates("indivisibility")); // 1
        System.out.println(countDuplicates("Indivisibilities")); // 2
        System.out.println(countDuplicates("aA11")); // 2
        System.out.println(countDuplicates("ABBA")); // 2
    }
}

