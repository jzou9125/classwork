package caveExplorer;

public class TwoDArrayPractice {

	public static void main(String[] args) {
		String[][] pic = new String[6][10];
		for(String[] row: pic)
		{
			for(int col = 0; col < row.length; col++)
			{
				row[col] = " ";
			}
		}
		drawBox(pic, 5, 8);
		print(pic);
	}

	private static void drawBox(String[][] pic, int i, int j) {
		drawSlot(pic, i ,j);
		drawSlot(pic, i+1, j);
		drawAt("_", pic, i+1, j);
		for(int col = j-1; col <= j+1; col++)
		{
			drawAt("_", pic, i-1, col);
		}
	}

	private static void drawAt(String string, String[][] pic, int i, int j) {
		if((i>=0 && i<= pic.length-1) && (j>= 0 && j<=pic[i].length-1))
		{
			pic[i][j] = string;
		}
	}

	private static void drawSlot(String[][] pic, int i, int j) {
		if(i >= 0 && i <= pic.length-1)
		{
			if(j >= 1)
			{
				pic[i][j-1] = "|";
			}
			if(j < pic[i].length -1)
			{
				pic[i][j +1] = "|";
			}
		}
	}

	private static void drawVerticalLine(String[][] pic, int col) {
		for(int i = 0; i< pic.length; i++)
		{
			pic[i][col] = "|";
		}
		
	}

	private static void drawHorizontalLine(String[][] pic, int row) {
		for(int i = 0 ; i< pic[row].length; i++)
		{
			pic[row][i] = "-";
		}
	}

	private static void print(String[][] pic) {
		for(String[] row: pic)
		{
			for(String col : row)
			{
				System.out.print(col);
			}
			System.out.println("");
		}
	}
}

