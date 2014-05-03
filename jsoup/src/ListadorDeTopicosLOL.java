import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;

public class ListadorDeTopicosLOL
{
        public static void main(String[] args)
        {
                String url = "http://forums.br.leagueoflegends.com/board/forumdisplay.php?f=13";
                try {
                    Document doc = Jsoup.connect(url).get();
                    Elements e = doc.select("a.thread-title-link");
                    for (int i = 0; i < e.size(); i++) {
                        System.out.println(e.get(i).text());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
}