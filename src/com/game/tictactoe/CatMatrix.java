package com.game.tictactoe;

public class CatMatrix {

	private int[][] cat;
	public CatMatrix() {
		// TODO Auto-generated constructor stub
		cat = new int[3][3];
		reset();
	}
	public void reset()
	{
		for(int r=0; r<3; r++){
			for(int c=0; c<3;c++){
				setCat(r,c,0);
			}
		}
		System.out.println("Clean.....");
	}
	public void setCat(int row, int column, int value)
	{
		cat[row][column]= value;
	}
	public int[][] getCat()
	{
		return cat;
	}
	public boolean validate(int row, int column)
	{
		if(cat[row][column]==0){
		return true;
		}
		else
		{
			return false;	
		}
		
	}
		
}
