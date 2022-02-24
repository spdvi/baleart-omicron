
package DataAcces;

import Models.Usuari;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

public class ApiClient {
    
        public Usuari createUser(Usuari newUser) throws URISyntaxException, IOException, InterruptedException {
        
        Gson gson = new Gson();
        String userJson = gson.toJson(newUser);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://www.dawidpelc.com/api/laravel_projecte_baleart-dawidmateujulia/public/api/usuaris"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(userJson))
                .build();
        
        HttpClient client = HttpClient.newHttpClient();
        
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    
        Usuari returnUser = null;
        if(response.statusCode() == 201){
            String responseBody = response.body();
            JsonReader reader = new JsonReader(new StringReader(responseBody));
            returnUser = gson.fromJson(reader, Usuari.class);
        }
        return returnUser;
    }
        
    public String authenticate(Usuari user) throws IOException, InterruptedException, Exception {

        String token = null;

        String body = "{\"email\":\"" + user.getEmail() + "\",\"password\":\""
                + user.getPassword() + "\"}";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://www.dawidpelc.com/api/laravel_projecte_baleart-dawidmateujulia/public/api/login"))
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .header("Content-Type", "application/json")
                .build();
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        
        String responseBody = response.body();
        int responseCode = response.statusCode();
        
        if (responseCode == 200) {

            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(responseBody, JsonObject.class);
            token = jsonObject.get("result").getAsString();
        }
        else {
            throw new Exception("Response code: " + responseCode);
        }
        
        return token;
    }
}
