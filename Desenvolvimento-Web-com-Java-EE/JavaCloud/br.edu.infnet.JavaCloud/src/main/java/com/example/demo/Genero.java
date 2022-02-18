package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Genero {
	@JsonProperty
	private String name;
	@JsonProperty
	private String age;
	@JsonProperty
	private String count;
	
	
	@Override
	public String toString() {
		return name + "\n" +
			   age + "\n" +
			   count;
						
	}
}
