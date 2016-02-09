package ru.podelochki.percolation;


public class Percolation {
	private boolean[][] grid;
	private boolean[][] gridFull;
	
	public Percolation(int N){
		
		this.grid=new boolean[N][N];
		this.gridFull=new boolean[N][N];
		for (int i=0;i<N;i++){
			for (int j=0;j<N;j++){
				this.grid[i][j]=false;
				this.gridFull[i][j]=false;
			}
		}
		
	}
	
	public void open(int i,int j){
		
		this.grid[i][j]=true;
		
	}
	
	public boolean isOpen(int i, int j){
		
		return this.grid[i][j];
	}
	
	public boolean isFull(int i, int j){
		return this.gridFull[i][j];
	}
	
	public boolean percolates(){
		
		return false;
	}
	

}
