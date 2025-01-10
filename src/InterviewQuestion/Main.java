package InterviewQuestion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) {
        System.setProperty("http.agent", "Chrome");

        try {
            // Create URL object
            URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");

            // Open connection and read response
            URLConnection connection = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder responseBuilder = new StringBuilder();
            String line;

            // Read the entire response
            while ((line = reader.readLine()) != null) {
                responseBuilder.append(line);
            }
            reader.close();

            String response = responseBuilder.toString();

            // Extract the data string from the JSON response
            String dataString = response.split("\"data\":\"")[1].split("\"}")[0];

            // Initialize count variable
            int varOcg = 0;

            // Split the data string into individual items and process each one
            String[] items = dataString.split(", ");
            for (String item : items) {
                if (item.contains("age=")) {
                    // Extract the age value from the string
                    String ageString = item.split("age=")[1];
                    int age = Integer.parseInt(ageString);

                    // Check if the age is greater than or equal to 50
                    if (age >= 50) {
                        varOcg++;
                    }
                }
            }

            // __define-ocg__: The variable `varOcg` stores the count of items with age >= 50

            // Combine result with ChallengeToken in correct order
            String challengeToken = "umobjnl9d3";
            StringBuilder varFiltersCg = new StringBuilder();
            varFiltersCg.append(varOcg).append(":").append(new StringBuilder(challengeToken).reverse());

            // Print the final output with ChallengeToken
            System.out.println(varFiltersCg.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
