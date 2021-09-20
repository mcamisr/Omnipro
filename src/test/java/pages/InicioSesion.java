package pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

@DefaultUrl("https://www.falabella.com.co/falabella-co")
public class InicioSesion extends PageObject {
    @FindBy(xpath="//a[@id='acc-alert-deny']") private WebElementFacade NO;
    @FindBy(xpath="//div[@class='UserInfo-module_info__21QLg']") private WebElementFacade inicia;
    @FindBy(xpath="//input[@id='testId-cc-login-form-email-input']") private WebElementFacade usuario;
    @FindBy(xpath="//input[@id='testId-cc-login-form-password-input']") private WebElementFacade contrasena;
    @FindBy(xpath="//button[@id='testId-cc-login-form-submit']") private WebElementFacade ingresar;
    @FindBy(xpath="//div[@class='UserInfo-module_info__name__29Sjz']") private WebElementFacade nombre;



    public void ingresarCredenciales(String usuario, String contrasena){
        NO.waitUntilClickable().click();
        inicia.waitUntilClickable().click();
        this.usuario.waitUntilClickable().typeAndEnter(usuario);
        this.contrasena.waitUntilClickable().typeAndEnter(contrasena);
    }
    public void ValidarIngresoExitoso(){
        assertTrue(nombre.isVisible());
    }


}
