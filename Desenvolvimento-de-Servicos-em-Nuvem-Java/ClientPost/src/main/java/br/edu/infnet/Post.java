package br.edu.infnet;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {

	@JsonProperty
	private int userId;
	@JsonProperty
	private int id;
	@JsonProperty
	private String title;
	@JsonProperty
	private String body;

	public Post(int id, String title, String body) {
		this.id = id;
		this.title = title;
		this.body = body;
	}

	@Override
	public String toString() {
		return "Post [userId=" + userId + ", id=" + id + ", title=" + title + ", body=" + body + "]";
	}

}
