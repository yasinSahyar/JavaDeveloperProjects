package week07_Array;

public class UniqueElements2 {
    public static void main(String[] args) {

        String[] words = {"Java", "Python", "Python", "Ruby", "Ruby", "C#"};

        for ( String element : words) {

            int frequency = 0;
            for ( String each : words) {
                if(each.equals(element)){
                    frequency++;
                }
            }

            if(frequency == 1){
                System.out.println(element);
            }

        }

    }
}
