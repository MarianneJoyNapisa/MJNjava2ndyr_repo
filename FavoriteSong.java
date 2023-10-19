import java.io.*;

public class FavoriteSong {

    public static void main(String[] args) {
        try {
                System.out.println("Let me do it for you");
                Thread.sleep(4000);

                System.out.println("Didn't do it for you");
                Thread.sleep(4500);

                System.out.println("When all I did was for you");
                Thread.sleep(5500);

                System.out.println("Kermit");
        } catch (Exception e) {
            // catching the exception
            System.out.println(e);
        }
    }
}

