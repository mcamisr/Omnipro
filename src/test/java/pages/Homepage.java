package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;


@DefaultUrl("https://www.falabella.com.co/falabella-co")
public class Homepage extends PageObject {
    @FindBy(xpath="//a[@id='acc-alert-deny']") private WebElementFacade NO;
    @FindBy(xpath="//input[@id='testId-SearchBar-Input']") private WebElementFacade buscar;
    @FindBy(xpath="//header/div[3]/div[1]/div[3]/div[1]/button[1]") private WebElementFacade Btnbuscar;
    @FindBy(xpath="//button[@id='testId-Pod-action-prod10900024']") private WebElementFacade agregar;
    @FindBy(xpath="//span[contains(text(),'Producto(s) agregado(s) a la bolsa de compras')]") private WebElementFacade message;

    @FindBy(xpath="//li[@id='testId-UserAction-userinfo']") private WebElementFacade usuariobtn;
    @FindBy(xpath="//a[contains(text(),'Regístrate')]") private WebElementFacade registrarbtn;
    @FindBy(xpath="//div[@class='dy-lb-close']") private WebElementFacade close;





    public void agregaralcarrito(){
     NO.click();
     buscar.waitUntilClickable().click();
     buscar.waitUntilEnabled().sendKeys("iphone");
     Btnbuscar.click();
     close.waitUntilClickable().click();
     agregar.waitUntilClickable().click();

    }


    public void Validarmensaje(){
            message.withTimeoutOf(30, TimeUnit.SECONDS).waitUntilEnabled();
    assertTrue(message.isVisible());
    }
}
