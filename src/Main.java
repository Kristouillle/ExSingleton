// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        MonInterface s3=Singleton.getInstance();
        s3.faireQQchose();
        s1.faireAutreChose();

        if (s1==s2){
            System.out.println("Même instance");
        }

    }
}
