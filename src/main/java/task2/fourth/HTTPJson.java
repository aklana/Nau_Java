package task2.fourth;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HTTPJson {

    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://httpbin.org/anything")).GET().build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());


        String json = response.body();
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode r = objectMapper.readTree(json);
        String host = r.get("headers").get("Host").asText();

        System.out.println(host);

    }
}