import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class Exemplo1
{
    public static void main(String[] args)
    {
        try {
            Document doc = Jsoup.connect("http://google.com").get();
            String title = doc.title();
            System.out.println("Título : " + title);   
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}