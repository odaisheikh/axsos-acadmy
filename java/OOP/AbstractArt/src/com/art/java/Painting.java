package com.art.java;

public class Painting extends Art{
	private String paintType;

	public Painting(String title, String author, String description , String type) {
		super(title, author, description);
		this.paintType = type;
	}

	@Override
	public void viewArt() {
		System.out.println("the title :"+title + "the autor"+ super.author+"the desc"+super.description+"the type panting"+paintType);
		
	}

}
