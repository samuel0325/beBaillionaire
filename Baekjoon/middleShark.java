package rosa;

public class middleShark {

	public static void main(String[] args) {

	}

}

class shark {
	int sharkDir = 0;
	int sharkRow = 0;
	int sharkCol = 0;

	shark(int sharkDir) {
		this.sharkDir = sharkDir;
	}
}

class fish {
	int fishNum = 0;
	int fishDir = 0;
	int fishRow = 0;
	int fishCol = 0;
	boolean live = false;
	boolean space = false;
	

	fish(int fishRow, int fishCol) {
		this.fishRow = fishRow;
		this.fishCol = fishCol;
	}
}

class fishTank {
	int sharkPoint = 0;
	fish[][] tank = new fish[6][6];

	fishTank() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				tank[i][j] = new fish(i,j);
			}
		}
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				tank[i][j].live = true;
				tank[i][j].space = true;
			}
		}
	}
	void startShark(shark a) {
		sharkPoint +=tank[1][1].fishNum;
		a.sharkDir = tank[1][1].fishDir;
		tank[1][1].live = false;
		tank[1][1].space = false;
	}
	void eatfish(int sharkDir){
		
	}
	void checkFish() {
		
	}
	void rotateFish(fish a) {
		if(a.fishDir==8) {
			a.fishDir=1;
		}else{
			a.fishDir = a.fishDir+1;
		}
	}
	void OkToGo(fish a) {
		fish temp = a;
		if(a.fishDir==1 && tank[a.fishRow-1][a.fishCol].space==true) {
			a = tank[a.fishRow-1][a.fishCol];
			temp.fishRow--;
			tank[a.fishRow-1][a.fishCol] = temp;
		}else if(a.fishDir==2 && tank[a.fishRow-1][a.fishCol-1].space==true) {
			a = tank[a.fishRow-1][a.fishCol-1];
			temp.fishRow--;
			temp.fishCol--;
			tank[a.fishRow-1][a.fishCol-1] = temp;
		}else if(a.fishDir==3 && tank[a.fishRow][a.fishCol-1].space==true) {
			a = tank[a.fishRow][a.fishCol-1];
			temp.fishCol--;
			tank[a.fishRow][a.fishCol-1] = temp;
		}else if(a.fishDir==4 && tank[a.fishRow+1][a.fishCol-1].space==true) {
			a = tank[a.fishRow+1][a.fishCol-1];
			temp.fishRow++;
			temp.fishCol--;
			tank[a.fishRow+1][a.fishCol-1] = temp;
		}else if(a.fishDir==5 && tank[a.fishRow+1][a.fishCol].space==true) {
			a = tank[a.fishRow+1][a.fishCol];
			temp.fishRow++;
			tank[a.fishRow+1][a.fishCol] = temp;
		}else if(a.fishDir==6 && tank[a.fishRow+1][a.fishCol+1].space==true) {
			a = tank[a.fishRow+1][a.fishCol+1];
			temp.fishRow++;
			temp.fishCol++;
			tank[a.fishRow+1][a.fishCol+1] = temp;
		}else if(a.fishDir==7 && tank[a.fishRow][a.fishCol+1].space==true) {
			a = tank[a.fishRow][a.fishCol+1];
			temp.fishCol++;
			tank[a.fishRow][a.fishCol+1] = temp;
		}else if(a.fishDir==8 && tank[a.fishRow-1][a.fishCol+1].space==true) {
			a = tank[a.fishRow-1][a.fishCol+1];
			temp.fishRow--;
			temp.fishCol++;
			tank[a.fishRow-1][a.fishCol+1] = temp;
		}else {
			rotateFish(a);
			OkToGo(a);
		}
	} //#19236 2020 0721 20:00~22:00
}
