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

@DefaultUrl("http://localhost:8080/electronic-medical-record-1.0.0/#/patients/create")
public class CreatePage extends PageObject {

	public void insert (String data, String field) {
		WebElementFacade input = find(By.name(field));
		input.type(data);
	}
	
	public boolean validate (String field) {
		WebElementFacade val = find(By.name(field));
		return (val.getAttribute("class") == "input_ok");
		
	}

	public void click_signup_btn() {
		WebElementFacade signup = find(By.name("signupbtn"));
		signup.click();
	}

	public boolean has_success_msg() {
		WebElementFacade msg = find(By.className("success"));
		return msg.isCurrentlyVisible();
	}

	public boolean insert_database() {
		//TODO: fake object
		return false;
	}
}