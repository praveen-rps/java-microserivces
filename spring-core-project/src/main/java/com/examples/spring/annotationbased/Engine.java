package com.examples.spring.annotationbased;

import org.springframework.stereotype.Component;

@Component("engine")
public class Engine {
	
	String engineType;
	String enginePower;

	public Engine() {
		
		engineType = "V8";
		enginePower = "400hp";
	}

	public Engine(String engineType, String enginePower) {
		this.engineType = engineType;
		this.enginePower = enginePower;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String getEnginePower() {
		return enginePower;
	}

	public void setEnginePower(String enginePower) {
		this.enginePower = enginePower;
	}

	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + ", enginePower=" + enginePower + "]";
	}

}
