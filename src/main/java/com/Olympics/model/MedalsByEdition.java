package com.Olympics.model;

import com.opencsv.bean.CsvBindByName;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class MedalsByEdition  {

	@CsvBindByName(column = "year")
    private int year;
	
	@CsvBindByName(column = "edition")
    private String edition;
	
	@CsvBindByName(column = "edition_id")
    private int editionId;
	
	@CsvBindByName(column = "country")
    private String country;

	@CsvBindByName(column = "cuntry_noc")
    private String country_noc;
	
	
	@CsvBindByName(column = "gold")
    private int gold;
	
	@CsvBindByName(column = "silver")
    private int silver;

	@CsvBindByName(column = "bronze")
    private int bronze;

	@CsvBindByName(column = "total")
    private int total;

	
	
	
    public int getYear() {
		return year;
	}




	public void setYear(int year) {
		this.year = year;
	}




	public String getEdition() {
		return edition;
	}




	public void setEdition(String edition) {
		this.edition = edition;
	}




	public int getEditionId() {
		return editionId;
	}




	public void setEditionId(int editionId) {
		this.editionId = editionId;
	}




	public String getCountry() {
		return country;
	}




	public void setCountry(String country) {
		this.country = country;
	}




	public String getCountry_noc() {
		return country_noc;
	}




	public void setCountry_noc(String country_noc) {
		this.country_noc = country_noc;
	}




	public int getGold() {
		return gold;
	}




	public void setGold(int gold) {
		this.gold = gold;
	}




	public int getSilver() {
		return silver;
	}




	public void setSilver(int silver) {
		this.silver = silver;
	}




	public int getBronze() {
		return bronze;
	}




	public void setBronze(int bronze) {
		this.bronze = bronze;
	}




	public int getTotal() {
		return total;
	}




	public void setTotal(int total) {
		this.total = total;
	}




	@Override
    public String toString() {
        return "year: %d, editionId: %d, edition: %s, country: %s".formatted(year,editionId,edition,country);
    }
}
