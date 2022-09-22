package com.albert.demo;

import com.sujata.training.PopCorn;

public class MainPopCorn {

	public static void main(String[] args) {
		PopCorn popCorn=new PopCorn(5,2);
		
		System.out.println("Albert bough "+popCorn.getQuantity()+" ounces  popcorn in "+popCorn.getPrice()+" money value");
		popCorn.pop();
		
		ButterPopCorn butterPopCorn=new ButterPopCorn(5,2);
		System.out.println("Albert bough "+butterPopCorn.getQuantity()+" ounces  popcorn in "+butterPopCorn.getPrice()+" money value");
		butterPopCorn.pop();

	}

}
