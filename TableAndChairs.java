
public class TableAndChairs {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 6; i++) { // row
			for(int j = 1; j <= 22; j++) { //column
				if((j==1 || j == 22 ) || (i==3 && j>=7 && j<=16) || (i==4 && j<=5) || (i==4 && j>=18) || (i==4 && j==7) || (i==4 && j==16) || (i==5 && j==5) || (i==5 && j==7) || (i==5 && j==16) || (i==5 && j==18) || (i==6 && j==5) || (i==6 && j==7) || (i==6 && j==16) || (i==6 && j==5) || (i==6 && j==7) || (i==6 && j==16) || (i==6 && j==18)){
					System.out.print("#");
				}else if((i==2 && j==7) || (i==2 && j==16)) {
					System.out.print("_"); //plates
				}else {
					System.out.print(" ");
				}
					
			}
			System.out.println();
		}
	
	
	}
}
