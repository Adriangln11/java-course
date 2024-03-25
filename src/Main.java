import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        Scrapper scrapper = new Scrapper();
        String content = scrapper.getWebContent("https://www.bbc.com/");
        System.out.println(content);

    }


}