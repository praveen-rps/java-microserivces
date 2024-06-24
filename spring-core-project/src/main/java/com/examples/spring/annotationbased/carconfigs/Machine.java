package com.examples.spring.annotationbased.carconfigs;

import org.springframework.stereotype.Component;

@Component("machine")
public class Machine {

	int machineid;
	int machinepower;
	
	public Machine() {
		super();
		machineid = 1001;
		machinepower = 1000;
	}

	public Machine(int machineid, int machinepower) {
		super();
		this.machineid = machineid;
		this.machinepower = machinepower;
	}

	public int getMachineid() {
		return machineid;
	}

	public void setMachineid(int machineid) {
		this.machineid = machineid;
	}

	public int getMachinepower() {
		return machinepower;
	}

	public void setMachinepower(int machinepower) {
		this.machinepower = machinepower;
	}

	@Override
	public String toString() {
		return "Machine [machineid=" + machineid + ", machinepower=" + machinepower + "]";
	}
	
	
}
