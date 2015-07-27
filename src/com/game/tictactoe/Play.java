package com.game.tictactoe;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Play {

	
	private Buttons buttuns;
	private CatMatrix catMatrix;
	public static int PLAYER=1;
	private int row,column;
	private Game game;
	private JFrame frame;
	
	public Play(Buttons buttuns, CatMatrix catMatrix, Game game,JFrame frame) {
		// TODO Auto-generated constructor stub
		
		Game.count=0;
		this.buttuns = buttuns;
		this.catMatrix = catMatrix;
		this.game = game;
		this.frame = frame;	
	}
	public void select(JButton btnTemp, int r, int c )
	{   
		if (this.catMatrix.validate(r,c))
		{ 
			if(Game.count%2==0)
			{
				PLAYER=2;
				tittleFrame();
				buttuns.imageButton( btnTemp,IconButton.ICON1 );
				this.catMatrix.setCat(r, c, 2);
				Game.count++;
				status(r,c);
                if(Game.pcON && Game.count%2!=0)
                {            
                	tittleFrame();
                	PLAYER=1;
                	choosePcValid();
                	status(r,c);
                }
			}
			else
			{
				PLAYER=1;	
				tittleFrame();
				buttuns.imageButton( btnTemp,IconButton.ICON0 );
				this.catMatrix.setCat(r, c, 1);
				status(r,c);
				Game.count++;
			}	
		}
	}
	public boolean comfir(int r, int c)
	{
		if(catMatrix.getCat()[r][0]== PLAYER && catMatrix.getCat()[r][1]== PLAYER && catMatrix.getCat()[r][2]== PLAYER ){
			changeColor(0,r,c);	
			return true;}
		if(catMatrix.getCat()[0][c]== PLAYER && catMatrix.getCat()[1][c]== PLAYER && catMatrix.getCat()[2][c]== PLAYER ){
			changeColor(1,r,c);
			return true;}
		if(catMatrix.getCat()[0][0]== PLAYER && catMatrix.getCat()[1][1]== PLAYER && catMatrix.getCat()[2][2]== PLAYER ){
			changeColor(2,r,c);
			return true;}
		if(catMatrix.getCat()[0][2]== PLAYER && catMatrix.getCat()[1][1]== PLAYER && catMatrix.getCat()[2][0]== PLAYER ){
			changeColor(3,r,c);
			return true;}
		
		return false;
	}
	public void status(int r, int c)
	{
		if(comfir(r,c))
		{
			JOptionPane.showMessageDialog(null, "Player "+PLAYER+" Won");
			this.catMatrix.reset();
			this.buttuns.resetButton();
			Game.count=0;
			Game.pcON=false;
			game.switchPC();
		}
		else 
		{
			if(Game.count==9)
			{
				JOptionPane.showMessageDialog(null, "Tie the game ");
				this.catMatrix.reset();
				this.buttuns.resetButton();
				Game.count=0;
				Game.pcON=false;
				game.switchPC();
			}
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
	//PC turn ON
	public void choosePcValid()
	{
		boolean s;
		do{
			s=chooseBox();
		}while(!s);
			status(row,column);
		}
	public boolean chooseBox()
	{
		Random ran = new Random();
	    int r = Math.abs(ran.nextInt()) % 3;
	    int c = Math.abs(ran.nextInt()) % 3;
	    return pcSelect(r,c);
	}
	public boolean pcSelect(int r, int c)
	{
		if(this.catMatrix.validate(r,c)&&r<3&&c<3)
		{
			this.catMatrix.setCat(r, c, 1);
			this.buttuns.imageButton(buttuns.getBtn(r, c),IconButton.ICON0);
			Game.count++;
			row=r;
		    column=c;
			return true;
		}
		return false;
	}
	public void tittleFrame()
	{
		
		frame.setTitle("Tic Tac Toe:  Player "+PLAYER);
	}
}
