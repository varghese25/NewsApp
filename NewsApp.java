import java.io.*;
import java.util.*;
import javax.net.ssl.HttpsURLConnection;
import java.net.*;

@SuppressWarnings("unused")
public class NewsApp {

    private static final String apikey = ""; // Include Apikey or else ERROR display Server returned HTTP response code: 401
    private static final String baseurl = "https://newsapi.org/v2/top-headlines?";

    public static void main(String[] args) {
        try {
            // Output Request
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in); // User input in Scanner class
            System.out.println("Enter category: (Ex: sports, technology, business)"); // Dispaly the Category
            String cat = sc.nextLine(); // Scanner cat recived fro user using nextLine
            String apiurl = baseurl + "category=" + cat + "&language=en&apiKey=" + apikey; //api url crated insteaded baseurl, passing the (https://newsapi.org/v2/top-headlines?";)  category & english langugage using api url & base url
            HttpURLConnection con = (HttpURLConnection) new URL(apiurl).openConnection(); // Establishing above connection passing the api url
            con.setRequestMethod("GET"); //  GET method only getting information

            // Output Response
            BufferedReader r = new BufferedReader(new InputStreamReader(con.getInputStream())); // Api Input stored in (r)BufferReader  new
            String line, json = ""; // out put show in line by in json 
            while ((line = r.readLine()) != null)json += line; // Line by line it will read it will be stored(r)
            r.close(); // r is read line closed

            // Output Response To Display in Console
            int index = 0;
            while ((index = json.indexOf("\"title\":\"", index)) != -1) { 
                int endindex = json.indexOf("\"", index + 9);
                System.out.println("Title: " + json.substring(index + 9, endindex));
                index = endindex + 1;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}