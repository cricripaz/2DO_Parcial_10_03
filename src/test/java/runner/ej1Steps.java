package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class ej1Steps {

    Response response;

    @Given("Tengo Acceso a Todo.ly")
    public void tengoAccesoATodoLy(){

    }


    @When("Envio una peticion POST a {} con")
    public void envioUnaPeticionPOSTAHttpsTodoLyApiUserJsonConElJson(String url , String body){

        response = given()
                .contentType(ContentType.JSON)
                .body(body)
                .log().all().when().post(url);

    }


    @Then("verifico que la respuesta sea {int}")
    public void revisoQueElCodigoDelResponseSea(int code) {
        response.then().log().all().statusCode(code);
    }

    @And("reviso que la respuesta contenga el FullName igual a {string}")
    public void revisoQueEnElResponseElFullNameSea(String name) {
        Assert.assertEquals("Error: No se pudo crear o actualizar el ususario", name, response.then().extract().path("FullName"));
    }


    @When("Envio una peticion PUT  a {} autentificando con el usuario {string} y pwd {string} con el json")
    public void envioUnaPeticionPUTAHttpsTodoLyApiUserJsonAutentificadoConElUsuarioYContrasenaConElJson(String url, String usr, String pwd, String body) {
        response = given().
                auth().
                preemptive().
                basic(usr, pwd).
                contentType(ContentType.JSON).
                body(body).
                log().all().
                when().put(url);
    }




}
