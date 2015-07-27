package com.game.tictactoe;

public class CatMatrix {

	
	private int[][] cat;
	public CatMatrix() {
		// TODO Auto-generated constructor stub
		cat = new int[Game.ROW][Game.COLUMN];
		reset();
	}
	public void reset()
	{
		for(int r=Game.INIT; r<Game.ROW; r++){
			for(int c=Game.INIT; c<Game.COLUMN;c++){
				setCat(r,c,0);
			}
		}
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
