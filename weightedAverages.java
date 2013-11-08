//This is supposed to be a module to compute student marks

//This part will be deleted when it's put into the program as there will be keyboard commands further up
 import sheffield.*;
public class weightedAverages {
public static void main(String[] arg) {
	EasyReader keyboard = new EasyReader();
	//Just making an example array with populated test data. Replace everything here with actual array
	int x = 20; int y = 10;
	int[][] studentArray = new int[x][y]; 
		for (int r=0; r<studentArray.length; r++) 
			for (int c=0; c<studentArray[r].length; c++) 
				studentArray[r][c]=0;
				
		
		for (int r=0; r<studentArray.length; r++) 
			for (int c=0; c<studentArray[r].length; c++) 
			studentArray[r][3]=10+r;
			
		for (int r=0; r<studentArray.length; r++) 
			for (int c=0; c<studentArray[r].length; c++) 
			studentArray[r][4]=4+(r*2);
	
  //char choice;
  //choice = (char) System.in.read();
	System.out.println("This is a test question. Press 4: ");
	
		//Actual module starts here
		
		//StudentArray[0].length returns the width of the array
		int[][] studentDisplayArray = new int[22][studentArray[0].length];
		for (int studentIndex = 0; studentIndex<studentArray[0].length; studentIndex++){
			//This copies everything from 1 array to the other
			for (int rowNumber= 0; rowNumber<20; rowNumber++)
				studentDisplayArray[rowNumber][studentIndex] = studentArray[rowNumber][studentIndex];
			
			//This works out the module averages
			int yearMark = (studentArray[3][studentIndex] + studentArray[4][studentIndex]
						   + studentArray[6][studentIndex] + studentArray[7][studentIndex]
						   + studentArray[9][studentIndex] + studentArray[10][studentIndex]
						   + studentArray[12][studentIndex] + studentArray[13][studentIndex]
						   + studentArray[15][studentIndex] + studentArray[16][studentIndex]
						   + studentArray[18][studentIndex] + studentArray[19][studentIndex])
						   //Integer value used here assuming end user wants rounded down
						   / 6;
			yearMark = studentDisplayArray[20][studentIndex];
			studentDisplayArray[21][studentIndex] = 0;
			
			//Here an if statement is used to check if they're year 3 or not
			//Java doesn't like = and == is equivalent to and doesn't work, but the user cannot put > 3 so this should work
			if(studentArray[1][studentIndex] >= 3){
			//The huge assumption here is that the user puts the years in order, going year 1, year 2 and year 3
				double overallMark = (studentDisplayArray[20][studentIndex - 1] * 0.33)
									+ (studentDisplayArray[20][studentIndex] * 0.67);
				studentDisplayArray[21][studentIndex] = (int)overallMark;
				}
			for (int rowNumber= 0; rowNumber<10; rowNumber++) 
				System.out.println(studentDisplayArray[rowNumber][studentIndex]);
			}
				
			
}
}
