package com.game.tictactoe;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Play {

	private boolean turn;
	private int count;
	private IconButton icon;
	private Buttons buttuns;
	private CatMatrix catMatrix;
	private int player;
	Game game;
	
	public Play(Buttons buttuns, IconButton icon, CatMatrix catMatrix, Game game) {
		// TODO Auto-generated constructor stub
		turn = true;
		player=1;
		count=0;
		
		this.buttuns = buttuns;
		this.icon = icon;
		this.catMatrix = catMatrix;
		this.game = game;
		
	}
	public void select(JButton btnTemp, int r, int c )
	{
		
		if (this.catMatrix.validate(r,c))
		{
			if(turn){
				player=1;
				buttuns.imageButton( btnTemp, icon.getIcon0() );
				this.catMatrix.setCat(r, c, player);
				
				count++;
			}
			else{
				player=2;
				buttuns.imageButton( btnTemp, icon.getIcon1() );
				this.catMatrix.setCat(r, c, player);
				count++;
			}
		   status(r,c);			
			turn= !turn;
		}
		
	}
	public boolean comfir(int r, int c)
	{
		if(catMatrix.getCat()[r][0]== player && catMatrix.getCat()[r][1]== player && catMatrix.getCat()[r][2]== player ){
			changeColor(0,r,c);	
			return true;}
		if(catMatrix.getCat()[0][c]== player && catMatrix.getCat()[1][c]== player && catMatrix.getCat()[2][c]== player ){
			changeColor(1,r,c);	
			return true;}
		if(catMatrix.getCat()[0][0]== player && catMatrix.getCat()[1][1]== player && catMatrix.getCat()[2][2]== player ){
			changeColor(2,r,c);	
			return true;}
		if(catMatrix.getCat()[0][2]== player && catMatrix.getCat()[1][1]== player && catMatrix.getCat()[2][0]== player ){
			changeColor(3,r,c);	
			return true;}
		
		return false;
	}
	
	public void status(int r, int c)
	{
		if(count == 9)
		{
			JOptionPane.showMessageDialog(null, "Tie the game ");
			count=0;
			this.catMatrix.reset();
			this.buttuns.resetButton();
			game.refresh();
			turn=true;
			
		}
		if(comfir(r,c))
		{
			JOptionPane.showMessageDialog(null, "Player "+player+" Won");
			this.catMatrix.reset();
			this.buttuns.resetButton();
			game.refresh();
			count=0;
			turn=true;
			
		}
		
	}
	public void changeColor(int option,int r, int c)
	{ 
			switch(option)
			{
				case 0:
					this.buttuns.colorButton(this.buttuns.getBtn(r,0), Color.GREEN);
					this.buttuns.colorButton(this.buttuns.getBtn(r,1), Color.GREEN);
					this.buttuns.colorButton(this.buttuns.getBtn(r,2), Color.GREEN);
					break;
					
				case 1:
					this.buttuns.colorButton(this.buttuns.getBtn(0,c), Color.GREEN);
					this.buttuns.colorButton(this.buttuns.getBtn(1,c), Color.GREEN);
					this.buttuns.colorButton(this.buttuns.getBtn(2,c), Color.GREEN);
					break;
					
				case 2:
					this.buttuns.colorButton(this.buttuns.getBtn(0,0), Color.GREEN);
					this.buttuns.colorButton(this.buttuns.getBtn(1,1), Color.GREEN);
					this.buttuns.colorButton(this.buttuns.getBtn(2,2), Color.GREEN);
					break;
					
				case 3:
					this.buttuns.colorButton(this.buttuns.getBtn(0,2), Color.GREEN);
					this.buttuns.colorButton(this.buttuns.getBtn(1,1), Color.GREEN);
					this.buttuns.colorButton(this.buttuns.getBtn(2,0), Color.GREEN);
					break;
			}
	}
	
	
}
