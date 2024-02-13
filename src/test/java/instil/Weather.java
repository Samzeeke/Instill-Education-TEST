import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertTrue;

public class OpenWeatherAPITest {

    private static final String API_KEY = "e5f0cd6991ef5e9b509daf65bf50362f";
    private static final String ENDPOINT = "https://api.openweathermap.org/data/3.0/onecall";

    @Test
    public void validateWeatherIsSunnyInLagos() {
        // Set the latitude and longitude for Lagos, Nigeria
        double lagosLatitude = 6.524379;
        double lagosLongitude = 3.379206;

        // Make the API request and capture the response
        Response response = given()
                .queryParam("lat", lagosLatitude)
                .queryParam("lon", lagosLongitude)
                .queryParam("appid", API_KEY)
                .when()
                .get(ENDPOINT);

        // Validate the response and check if the weather is sunny
        assertTrue(response.getStatusCode() == 200, "API request failed with status code: " + response.getStatusCode());

        String weatherCondition = response.jsonPath().getString("current.weather[0].main");
        assertTrue(weatherCondition.equalsIgnoreCase("Clear"),
                "The weather is not sunny in Lagos. Current weather condition: " + weatherCondition);
    }
}
