package day14_MethodOverloadingLoopsIntro;

public class OverloadingMainMethod {
    public static void main(String[] args) { // []--mean is array
        System.out.println("A"); //A---main method bu oldugu icin sadece "A" yazar
        main(2);//B
        main(5.5);//C
    }

    public static void main(int args) {
        System.out.println("B");
    }

    public static void main(double args) {
        System.out.println("C");
    }

    public static void main(boolean[] args) { //[]--mean is array---main methoda chakirip isilitish uqun "[]" ni elwetimiz
        System.out.println("D");
    }

}
