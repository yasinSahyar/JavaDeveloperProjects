package day13_CustomMethodsContinue;

public class exice {
    public static void main(String[] args) {



                // Example 1
                String result1 = removeVowelsAndSpaces("write once run anywhere");
                System.out.println(result1); // Output: wrtncrnnywhr

                // Example 2
                String result2 = removeVowelsAndSpaces("everything is an object");
                System.out.println(result2); // Output: vrythngsnbjct

                // Example 3
                String result3 = removeVowelsAndSpaces("ae iou");
                System.out.println(result3); // Output: ""
            }

            public static String removeVowelsAndSpaces(String str) {
                // Using regular expression to replace vowels and spaces
                return str.replaceAll("[aeou ]", "");
            }
        }

