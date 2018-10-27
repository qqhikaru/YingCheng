package oo.day04;
//四格拼板
public class Tetromino {
	Cell[] cells; //格子数组
	Tetromino(){
		cells = new Cell[4]; //创建Cell数组对象
	}
	
	void drop(){
		for(int i=0;i<this.cells.length;i++){
			this.cells[i].row++;
		}
	}
	void moveLeft(){
		for(int i=0;i<this.cells.length;i++){
			this.cells[i].col--;
		}
	}
	void moveRight(){
		for(int i=0;i<this.cells.length;i++){
			this.cells[i].col++;
		}
	}
	void print(){ //输出4个格子的行号和列号
		for(int i=0;i<this.cells.length;i++){
			String str = this.cells[i].getCellInfo();
			System.out.println(str);
		}
	}
}











