import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import model.BookResource;
import model.NumberResource;
import rest.BookClient;
import rest.NumberClient;

public class Main {

    public static void main(String[] args) {
        BookClient bookClient = Feign.builder()
                .client(new OkHttpClient())
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .logger(new Slf4jLogger(BookClient.class))
                .logLevel(Logger.Level.FULL)
                .target(BookClient.class, "http://localhost:8081/api/books");

        NumberClient numberClient = Feign.builder()
                .client(new OkHttpClient())
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .target(NumberClient.class, "http://localhost:8080/");
        NumberResource lista = numberClient.getPoints("1234");
        System.out.println(lista);
    }


}
