
/*
 * For today's session : 
 * ignore static keyword, which we will discuss later in this training
 */
public class MyModularFactorialDemo {

	
	static int number,factorial;
	
	static void input(int no) {
		number=no;
	}
	
	static void calculate() {
		factorial=1;
		while(number>=1)
			factorial*=number--;
	}
	
	static void display() {
		System.out.println("Factorial : "+factorial);
	}
	public static void main(String[] args) {
		input(4);
		calculate();
		factorial=factorial*0; //Logical Mistake
		display();

	}

}
