package com.art.java;

public class Sculpture extends Art{
	private String material;
	public Sculpture(String title, String author, String description,String material) {
		super(title, author, description);
		this.material = material;
	}

	@Override
	public void viewArt() {
		System.out.println("the title :"+title + "the autor"+ super.author+"the desc"+super.description + "material"+material);
		
	}

}
