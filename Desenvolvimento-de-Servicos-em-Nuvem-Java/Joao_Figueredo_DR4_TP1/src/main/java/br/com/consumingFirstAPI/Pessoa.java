package br.com.consumingFirstAPI;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pessoa {

	@JsonProperty
	private String name;
	@JsonProperty
	private String age;
	@JsonProperty
	private String count;
	
	@Override
	public String toString() {
		return "Genero [name=" + name + ", age=" + age + ", count=" + count + "]";
	}	
}
