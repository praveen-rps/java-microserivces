package com.example.restdemo.controller;

public class City {
	
	String name;
	int max;
	int min;
	int aqi;
	
	public City() {
		name="Hyderabad";
		min=24;
		max=39;
		aqi=100;
	}

	public City(String name, int max, int min, int aqi) {
		this.name = name;
		this.max = max;
		this.min = min;
		this.aqi = aqi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getAqi() {
		return aqi;
	}

	public void setAqi(int aqi) {
		this.aqi = aqi;
	}
	
}
