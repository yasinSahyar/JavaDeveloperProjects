package day10_ScannerContinueString;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
public class ReadFilesWithScanner {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(Path.of("src/day10_ScannerContinueString/test.txt"));


        System.out.println(scan.next());//1.Hello
        System.out.println(scan.next());// cydeo
        System.out.println(scan.next());//2.how
        System.out.println(scan.next());// are

        /*
        System.out.println(scan.next());//1.Hello
        System.out.println(scan.nextLine());// Cydeo

        System.out.println(scan.nextLine());//2.how are you today?
        System.out.println(scan.nextLine());//3.whats going on ?
        System.out.println(scan.nextLine());//4.send me email
        System.out.println(scan.nextLine());//5.I am yasin sahyar



         */

        System.out.println(scan.hasNext()); //true
        scan.close();

    }
}
