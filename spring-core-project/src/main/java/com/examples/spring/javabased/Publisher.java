package com.examples.spring.javabased;

public class Publisher {
	
		String pid;
		String name;
		String location;
		
		public Publisher() {
		}
		
		public Publisher(String pid, String name, String location) {
            this.pid = pid;
            this.name = name;
            this.location=location;
		}

		public String getPid() {
			return pid;
		}

		public void setPid(String pid) {
			this.pid = pid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		@Override
		public String toString() {
			return "Publisher [pid=" + pid + ", name=" + name + ", location=" + location + "]";
		}
		

}
