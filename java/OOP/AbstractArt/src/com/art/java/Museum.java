package com.art.java;

import java.util.ArrayList;

public class Museum {
	public static ArrayList<Art> museum = new ArrayList<Art> ();

	public static void main(String[] args) {
		Painting a1 = new Painting("kjk", "ali","hhj" , "hkjhkhj");
		Art a2 = new Painting("kjk", "ali","hhj" , "hkjhkhj");
		Sculpture d1 = new Sculpture("nkjk","kdklgjdkfl", "dkgjlkdj", "djklgkdklj");
		
		a1.viewArt();
		try {
			museum.add(a1);
			museum.add(a2);
			museum.add(d1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0;i<museum.size();i++) {
			museum.get(i).viewArt();
		}
	}

}
