import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.Collectors;

public class Scrapper {

    public Scrapper() {
    }
    String getWebContent(String url) throws IOException {
      URL toScrap = new URL(url);
      HttpURLConnection conection = (HttpURLConnection) toScrap.openConnection();

        String encoding = conection.getContentEncoding();
        InputStream input = conection.getInputStream();

        String result = new BufferedReader(new InputStreamReader(input)).lines().collect(Collectors.joining());
        return result;


    }




}
