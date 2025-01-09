package InterviewQuestion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.setProperty("http.agent", "Chrome");

        try {
            // Create URL object
            URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");

            // Open connection and read response using Java 8 Stream API
            URLConnection connection = url.openConnection();
            String response = new BufferedReader(new InputStreamReader(connection.getInputStream()))
                    .lines().collect(Collectors.joining());

            // Extract data string from JSON response
            String dataString = response.split("\"data\":\"")[1].split("\"}")[0];

            // Split the data string into individual items and filter using Java 8 Streams
            long varOcg = Arrays.stream(dataString.split(", "))
                    .filter(item -> item.contains("age="))
                    .mapToInt(item -> Integer.parseInt(item.split("age=")[1]))
                    .filter(age -> age >= 50)
                    .count();

            // __define-ocg__: The variable `varOcg` stores the count of items with age >= 50


            // Combine result with ChallengeToken in correct order
            String challengeToken = "umobjnl9d3";
            String varFiltersCg = varOcg + ":" + new StringBuilder(challengeToken).reverse().toString();

            // Print the final output with ChallengeToken
            System.out.println(varFiltersCg);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
