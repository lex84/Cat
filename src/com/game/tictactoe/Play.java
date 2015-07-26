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
			changeColor(r,0,r,1,r,2);	
			return true;
			}
		if(catMatrix.getCat()[0][c]== player && catMatrix.getCat()[1][c]== player && catMatrix.getCat()[2][c]== player ){
			changeColor(0,c,1,c,2,c);	
			return true;}
		if(catMatrix.getCat()[0][0]== player && catMatrix.getCat()[1][1]== player && catMatrix.getCat()[2][2]== player ){
			changeColor(0,0,1,1,2,2);
			return true;}
		if(catMatrix.getCat()[0][2]== player && catMatrix.getCat()[1][1]== player && catMatrix.getCat()[2][0]== player ){
			changeColor(0,2,1,1,2,0);
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
	public void changeColor(int r, int c,int r2,int c2, int r3, int c3)
	{ 
		//colors rows
		if(r==0 && c ==0 && r2==0 && c2 ==1 && r3==0 && c3==2 ){
			this.buttuns.colorButton(this.buttuns.getBtn00(), Color.GREEN);
		    this.buttuns.colorButton(this.buttuns.getBtn01(), Color.GREEN);
		    this.buttuns.colorButton(this.buttuns.getBtn02(), Color.GREEN);
		}
		if(r==1 && c ==0 && r2==1 && c2 ==1 && r3==1 && c3==2 ){
			this.buttuns.colorButton(this.buttuns.getBtn10(), Color.GREEN);
		    this.buttuns.colorButton(this.buttuns.getBtn11(), Color.GREEN);
		    this.buttuns.colorButton(this.buttuns.getBtn12(), Color.GREEN);
		}
		if(r==2 && c ==0 && r2==2 && c2 ==1 && r3==2 && c3==2 ){
			this.buttuns.colorButton(this.buttuns.getBtn20(), Color.GREEN);
		    this.buttuns.colorButton(this.buttuns.getBtn21(), Color.GREEN);
		    this.buttuns.colorButton(this.buttuns.getBtn22(), Color.GREEN);
		}
		//colors columns 
		if(r==0 && c ==1 && r2==1 && c2 ==1 && r3==2 && c3==1 ){
			this.buttuns.colorButton(this.buttuns.getBtn01(), Color.GREEN);
		    this.buttuns.colorButton(this.buttuns.getBtn11(), Color.GREEN);
			this.buttuns.colorButton(this.buttuns.getBtn21(), Color.GREEN);
		}
		if(r==0 && c ==2 && r2==1 && c2 ==2 && r3==2 && c3==2 ){
			this.buttuns.colorButton(this.buttuns.getBtn02(), Color.GREEN);
		    this.buttuns.colorButton(this.buttuns.getBtn12(), Color.GREEN);
			this.buttuns.colorButton(this.buttuns.getBtn22(), Color.GREEN);
		}		
		if(r==0 && c ==0 && r2==1 && c2 ==0 && r3==2 && c3==0 ){
			this.buttuns.colorButton(this.buttuns.getBtn00(), Color.GREEN);
		    this.buttuns.colorButton(this.buttuns.getBtn10(), Color.GREEN);
			this.buttuns.colorButton(this.buttuns.getBtn20(), Color.GREEN);
		}
		//colors cross  
		if(r==0 && c ==0 && r2==1 && c2 ==1 && r3==2 && c3==2 ){
			this.buttuns.colorButton(this.buttuns.getBtn00(), Color.GREEN);
			this.buttuns.colorButton(this.buttuns.getBtn11(), Color.GREEN);
			this.buttuns.colorButton(this.buttuns.getBtn22(), Color.GREEN);
		}
		// colors cross 
		if(r==0 && c ==2 && r2==1 && c2 ==1 && r3==2 && c3==0 ){
			this.buttuns.colorButton(this.buttuns.getBtn02(), Color.GREEN);
			this.buttuns.colorButton(this.buttuns.getBtn11(), Color.GREEN);
			this.buttuns.colorButton(this.buttuns.getBtn20(), Color.GREEN);
		}		
		
		
	}
	
	
}
