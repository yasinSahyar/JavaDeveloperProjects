package utility;

public class StringUtility {

    public static String revers(String str){
        String revers = "";
        for (int i = str.length() -1; i >= 0 ; i--) {
            revers += str.charAt(i);
        }
        return revers;
    }
    // kirguzgen herkandak yazmini tetursige yerzip beridu
    // bu utility ni her yerde chakirip ishletsek bolidu
}
