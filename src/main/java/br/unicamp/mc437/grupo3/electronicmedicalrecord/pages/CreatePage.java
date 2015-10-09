package br.unicamp.mc437.grupo3.electronicmedicalrecord.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.thucydides.core.pages.WebElementFacade;

import net.thucydides.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("http://localhost:8080/electronic-medical-record-1.0.0/index.html")
public class CreatePage extends PageObject {

	public void insert (String data, String field) {
		WebElementFacade input = find(By.name(field));
		input.type(data);
	}
    /*@FindBy(name="search")
    private WebElementFacade searchTerms;

    @FindBy(name="go")
    private WebElementFacade lookupButton;
    */
    /*public void enter_keywords(String keyword) {
        searchTerms.type(keyword);
    }

    public void lookup_terms() {
        lookupButton.click();
    }

    public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.tagName("ol"));
        List<WebElement> results = definitionList.findElements(By.tagName("li"));
        return convert(results, toStrings());
    }

    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }*/
}