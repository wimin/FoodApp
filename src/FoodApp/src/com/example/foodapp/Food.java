package com.example.foodapp;


/* 这个类为  食物 类*/
public class Food {
	private String name;
	private int imageId;
	private double money;
	//private float scores;
	//private RatingBar bar;
	
	public Food(String name, int ImageId) {
		this.name = name;
		this.imageId = ImageId;
	}
	
	public Food(String name, int ImageId, double money) {
		this.name = name;
		this.imageId = ImageId;
		this.money = money;
		//this.scores = scores;
		//this.bar = bar;
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
/*	public RatingBar getBar() {
		return bar;
	}*/
	
}
