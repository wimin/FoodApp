package com.example.foodapp;

import android.widget.RatingBar;


public class Food {
	private String name;
	private int imageId;
	private double money;
	//private float scores;
	private RatingBar bar;
	
	public Food(String name, int ImageId, double money, RatingBar bar) {
		this.name = name;
		this.imageId = ImageId;
		this.money = money;
		//this.scores = scores;
		this.bar = bar;
	}
	
	public String getName() {
		return name;
	}
	public int getImageId() {
		return imageId;
	}
	public double getMoney() {
		return money;
	}
	public RatingBar getBar() {
		return bar;
	}
	
}
