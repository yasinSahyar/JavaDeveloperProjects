package day11_StringContiue;

public class StringMethods2 {
    public static void main(String[] args) {

        String sentence = "I love python, python is the best programing language, and python is in high demand";
        sentence = sentence.replace("python","java");
        System.out.println(sentence);
        //I love java, java is the best programing language, and java is in high demand

        System.out.println("---------------------------------");

        String word = "java";
        word = word.replace('a','e');//"jeve"
        System.out.println(word);

        System.out.println("----------------------------------");

        String sentence2 = "I love java,java is cool";
        // sentence2 = sentence2.replace("java","python"); //I love python,python is cool
        sentence2 = sentence2.replaceFirst("java","python");//I love python,java is cool

        System.out.println(sentence2);

        System.out.println("------------");

        String sentence3 = "I love java,java is cool,java is amazing";
        sentence3 = sentence3.replaceFirst(",java",",python");

        System.out.println(sentence3); //I love java,python is cool,java is amazing

        System.out.println("---------------------------");

        String sentence4 = "I love Java programing";
        String languageName = sentence4.substring(8,10 + 1);
        System.out.println(languageName); //ava---8-10index numridiki hereipni kisipp alidu

        System.out.println("-----------------------------------");


        String sentence5 = "Today is Sunday, Tomorrow is Monday";
        String today = sentence5.substring(9,15); //Sunday
        System.out.println(today);

        System.out.println("--------------------------");

        String email = "CydeoSchoolJavaPrograming@gmail.com";
        int beginning = email.indexOf('@') + 1;
        int ending = email.lastIndexOf('.');
        String domain = email.substring(beginning,ending);

        System.out.println(domain);//gmail


        System.out.println("----------");

        String sentence6 = "I love Java programing";
        //String r1 = sentence6.substring(8,sentence6.length());//ava programing
        String r1 = sentence6.substring(8);//substring()beginIndex --ava programing

        System.out.println(r1);

        System.out.println("----------------------");


        String sentence7 = "Today is Sunday, Tomorrow is Monday";
        String tomorrow = sentence7.substring(sentence7.lastIndexOf(' ') + 1);//Monday--boshluktin kiyin
        System.out.println(tomorrow);


        System.out.println("---------------------------------");

        String sentence8 = "I study at Cydeo School";
        String schoolName = sentence8.substring(11); //Cydeo School

        System.out.println(schoolName);


        System.out.println("---------------------------------");

        String str = "python";
        String result = (str+"\n").repeat(10);//10 ketim tekrarla
        System.out.println(result);

        System.out.println("------------------------------");


    }
}
