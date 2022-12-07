/**

 * IDEA

 * APCS, p1, 12/07/22

 * This program will...

 * Print a song with iteration

 * @author Daniel Nelson

 * @version Dec 2022

 */
public class Main {
    public static int verse = 5;
    public static int begverse = 0;
    public static final String[] BEGINNING = new String[]{
            "I once wrote a program that wouldn't compile",
            "My program did nothing\nSo I started typing.",
            "\"Parse error,\" cried the compiler\nLuckily I'm such a code baller.",
            "Now the compiler wanted an identifier\nAnd I thought the situation was getting dire.",
            "Java complained it expected an enum\nBoy, these computers really are dumb!",
            "Like a dog following a command,\nCheck out the name of the method"
    } ;
    public static final String[] ITERATION = new String[]{
            "To retrieve me my final verse.",
            "I added a public class and called it Scum",
            "I added a main method with its String[] args",
            "I added a backslash to escape the quotes",
            "I added System.out.println(\"I <3 coding\")",
    };
    public static void main(String[] args) {
        for(int i = 0; i<6;i++) {
            beginning();
            iteration();
            ending();
            System.out.println();
        }
    }
    public static void ending(){
        System.out.println("I don't know why it wouldn't compile,");
        System.out.println("My teacher just smiled.");
    }
    public static void iteration(){
        for(int i = verse; i<5;i++){
            System.out.println(ITERATION[i]);
        }
        verse--;
    }
    public static void beginning(){
        System.out.println(BEGINNING[begverse]);
        begverse++;
    }
}