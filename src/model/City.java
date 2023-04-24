package model;

public class City {
	private String title;
	private String country;
	private int population;
	private float squareKM;
	private int howManyTrafficLights;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public float getSquareKM() {
		return squareKM;
	}
	public void setSquareKM(float squareKM) {
		this.squareKM = squareKM;
	}
	public int getHowManyTrafficLights() {
		return howManyTrafficLights;
	}
	public void setHowManyTrafficLights(int howManyTrafficLights) {
		this.howManyTrafficLights = howManyTrafficLights;
	}
	
	public City(String title, String country, int population, float squareKM, int howManyTrafficLights) {
		super();
		this.title = title;
		this.country = country;
		this.population = population;
		this.squareKM = squareKM;
		this.howManyTrafficLights = howManyTrafficLights;
	}
	
	@Override
	public String toString() {
		return " City -> [title = " + title + ", country = " + country + ", population = " + population + ", squareKM = " + squareKM
				+ ", howManyTrafficLights = " + howManyTrafficLights + "]";
	}
	
	
}
