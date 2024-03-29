package br.unicamp.mc437.grupo3.electronicmedicalrecord.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Patient {
    // Patient's data
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String name, cpf, rg, addressStreet, addressNumber, cep; 

    // Record data
    private String socialName, mothersName, fathersName, email,
                   addressComplement, addressCityArea, addressCity,
                   addressCountry, ddd, phoneNumber, birthDate;
    
    // Fixed value fields
    @Enumerated(EnumType.STRING)
    private State addressUF;
    @Enumerated(EnumType.STRING)
    private BloodType bloodType;
    @Enumerated(EnumType.STRING)
    private Color color;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Enumerated(EnumType.STRING)
    private IssuerOrgan issuerOrgan;

    @Enumerated(EnumType.STRING)
    private State issuerOrganUF;
    
    // Patient's fields creators and getters

    public Patient() {}

    public Integer getId() {
        return id;
    }
    
    public Patient(String name) {
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    // Record's fields creators and getters
    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddressComplement() {
        return addressComplement;
    }

    public void setAddressComplement(String addressComplement) {
        this.addressComplement = addressComplement;
    }

    public String getAddressCityArea() {
        return addressCityArea;
    }

    public void setAddressCityArea(String addressCityArea) {
        this.addressCityArea = addressCityArea;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSocialName() {
        return socialName;
    }

    public void setSocialName(String socialName) {
        this.socialName = socialName;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getBirthDate(){
        return birthDate;
    }

    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }
    
    // Enumerated fields creators and getters
    
    public void setAddressUF(String acronym) {
    	State addressUF = State.findStateByAcronym(acronym);
    	this.addressUF = addressUF;
    }
    
    public State getAddressUF(){
    	return this.addressUF;
    }
    
    public void setBloodType(String description) {
    	BloodType bloodType = BloodType.findBloodTypeByDescription(description);
    	this.bloodType = bloodType;
    }
    
    public BloodType getBloodType() {
    	return this.bloodType;
    }
    
    public void setColor(String description) {
    	Color color = Color.findColorByDescription(description);
    	this.color = color;
    }
    
    public Color getColor() {
    	return this.color;
    }
    
    public void setGender(String code){
    	Gender gender = Gender.findGenderByCode(code);
    	this.gender = gender;
    }
    
    public Gender getGender() {
    	return this.gender;
    }
    
    public void setIssuerOrgan(String description) {
    	IssuerOrgan issuerOrgan = IssuerOrgan.findIssuerOrganByDescription(description);
    	this.issuerOrgan = issuerOrgan;
    }

    public void setIssuerOrganUF(String IssuerOrganUF) {
        State state = State.findStateByAcronym(IssuerOrganUF);
        this.issuerOrganUF = state;
    }

    public State getIssuerOrganUF() {
        return this.issuerOrganUF;
    }
}
