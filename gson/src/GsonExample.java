import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;

public class GsonExample {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("João da Silva Sauro", 20, 75.2, 1.81);
        Gson gson = new Gson();

        String json = gson.toJson(p);
        System.out.println(json);
        Pessoa p2 = gson.fromJson(json, Pessoa.class);
        System.out.println(p2.getNome());

    }

}
