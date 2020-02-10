package Baekjoon;

public class selfnum {

	public static void main(String[] args) {
		boolean[] findSelf = new boolean[10001];
		for(int i =0; i<10001;i++){
			findSelf[i] = false;
		}
		for(int i =0; i<10001;i++){
			findSelf[FindSelfNum(i)] = true;
		}
		for(int i=0; i<10001;i++){
			if(findSelf[i]==false){
				System.out.println(i);
			}
		}
		
	}
	static int FindSelfNum(int find){
		if(find>999){
			int a = find/1000;
			int b = (find-(a*1000))/100;
			int c = (find-a*1000-b*100)/10;
			int d = (find-a*1000-b*100-c*10);
			if(find+a+b+c+d<10001){
			return find+a+b+c+d;
			}else{
				return 0;
			}
		}else if(find>99){
			int a = find/100;
			int b = (find-a*100)/10;
			int c = (find-a*100-b*10);
			return find+a+b+c;
		}else if(find>9){
			int a = find/10;
			int b = find%10;
			return find+a+b;
		}else{
			return find*2;
		}
	}//2020-02-10 19:40 start
}//2020-02-10 20:11 done
