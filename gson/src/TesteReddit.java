import com.google.gson.Gson;
import java.io.InputStream;
import java.io.Reader;
import java.io.InputStreamReader;
import java.net.URL;
import com.google.gson.JsonParser;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class TesteReddit {


    public static void main(String[] args) {
        try {
            InputStream input = new URL("http://www.reddit.com/r/programming/.json").openStream();
            Reader reader = new InputStreamReader(input, "UTF-8");
            java.util.Scanner s = new java.util.Scanner(reader);
            String json = s.nextLine();

            Gson gson = new Gson();
            JsonParser parser = new JsonParser();
            JsonObject jsobj = parser.parse(json).getAsJsonObject();
            JsonArray posts = jsobj.getAsJsonObject("data").getAsJsonArray("children");
            for (JsonElement post : posts) {
                String title = post.getAsJsonObject().getAsJsonObject("data").get("title").getAsString();
                String url = post.getAsJsonObject().getAsJsonObject("data").get("url").getAsString();
                System.out.println(title + "-" + url);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}
