package com.tnsif.abstractprogram;

public class Square extends Abstractionshape {
	
	protected float side;
	
	Square(){
		side=2.0f;
	}
	Square (float side){
		this.side=side;
	}
	void calarea() {
		super.area=side*side;
	}
		

	@Override
		public String toString() {
			return "Square [side=" + side + "]";
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square q=new Square();
		System.out.println(q);
		q.calarea();
		q.show();
		
		
	}

	

}
