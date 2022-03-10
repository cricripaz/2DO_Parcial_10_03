package runner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ej3Steps {

    Response response;
    String token;


    @When("Envio un Get a {}")
    public void envioUnGetAHttpsTodoLyApiAuthenticationTokenJson(String url) {
        response = given().
                auth().
                preemptive().
                basic("cricripaz6@gmail.com","123456789").
                contentType(ContentType.JSON).
                log().
                all().
                when().
                get(url);
    }

    @Then("Verifico que el codigo de respuesta sea {int}")
    public void verificoQueElCodigoDeRespuestaSea(int code) {
        response.then().statusCode(code);
    }

    //TODO DELETE


}
