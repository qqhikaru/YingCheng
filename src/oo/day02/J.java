package oo.day02;
//J型
public class J {
	Cell[] cells;
	J(){
		this(0,0);
	}
	J(int row,int col){
		cells = new Cell[4];
		cells[0] = new Cell(row,col);
		cells[1] = new Cell(row+1,col);
		cells[2] = new Cell(row+2,col-1);
		cells[3] = new Cell(row+2,col);		
	}
	
	void drop(){
		for(int i=0;i<cells.length;i++){
			cells[i].row++;
		}
	}
	void moveLeft(){
		for(int i=0;i<cells.length;i++){
			cells[i].col--;
		}
	}
	void moveRight(){
		for(int i=0;i<cells.length;i++){
			cells[i].col++;
		}
	}
	void print(){ //输出4个格子的行号和列号
		for(int i=0;i<cells.length;i++){
			String str = cells[i].getCellInfo();
			System.out.println(str);
		}
	}
}


















