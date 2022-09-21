package com.sujata.training;

/*
 * user enter n: 1!/1 + 2!/2 + 3!/3 +......n!/n
 */
public class SumSeries {

	private int number;
	private double sum;
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public double getSum() {
		calculateSumSeries();
		return sum;
	}
	
	private void calculateSumSeries() {
		sum=0;
		com.sujata.demo.Factorial factorial=new com.sujata.demo.Factorial();
		for(int count=1;count<=number;count++) {
			factorial.setNumber(count);
			sum=sum+factorial.getFactorial()/count;
		}
	}
	
}
