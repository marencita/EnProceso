package Operaciones.stepdefinitions;

import AtmWeb.BC.Operaciones;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyStepdefs {
    int numero1;
    int numero2;
    int resultado;
    boolean exitoso=false;

    @Given("Tengo los numeros {string} y {string}")
    public void tengoLosNumerosY(String num1, String num2) {
        numero1 = Integer.parseInt(num1);
        numero2 = Integer.parseInt(num2);
    }

    @When("realizo la suma")
    public void realizoLaSuma() {
        resultado = Operaciones.sumando(numero1,numero2);

    }

    @Then("El resultado es {string}")
    public void elResultadoEs(String resultEsperado) {

        assertEquals(Integer.parseInt(resultEsperado),resultado);
    }

    @And("Muestra resultado en Pantalla")
    public void muestraResultadoEnPantalla() {
        System.out.println("ultimo paso - mostrar resultado en pantalla .....");
    }
}
