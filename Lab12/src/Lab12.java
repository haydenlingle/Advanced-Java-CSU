//Lab12 Assignment
//Author: Hayden Lingle
//Date: Oct 10, 2017
//Class: CS164
//Email: hlingle@rams.colostate.edu
public class Lab12 implements RecitationInterface{
	
	PictureLibrary picLib;
	int width = 0;
	int height = 0;
	
	int[][] data;
	
	

	@Override
	public void readImage(String inFile) {
		picLib = new PictureLibrary();
		
		try {
			picLib.readPGM(inFile);
			width = picLib.getWidth();
			height = picLib.getHeight();
			data = picLib.getData();
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}		
	}

	@Override
	public void writeImage(String outFile) {
		try {
			picLib.setData(data);
			picLib.writePGM(outFile);
		}catch (Exception e){
			System.out.println(e.getMessage());
		}		
	}

	@Override
	public int[][] imageData() {
		return data;
	}

	@Override
	public void negateImage() {
		for(int i = 0; i < data.length; i++){//rows
			for(int j = 0; j < data[i].length; j++){
				data[i][j] = PictureLibrary.MAXVAL - data[i][j];
			}
		}
	}

	@Override
	public void increaseContrast() {
		for(int i = 0; i < data.length; i++){//rows
			for(int j = 0; j < data[i].length; j++){
				if(data[i][j] >= 0 && data[i][j] <= 16){
					data[i][j] = 0;
				}
				else if(data[i][j] > 16 && data[i][j] <= 127){
					data[i][j] -= 16;
				}
				else if(data[i][j] > 127 && data[i][j] <= PictureLibrary.MAXVAL - 16){
					data[i][j] += 16;
				}
				else if(data[i][j] > PictureLibrary.MAXVAL - 16 && data[i][j] <= PictureLibrary.MAXVAL - 16){
					data[i][j] = PictureLibrary.MAXVAL;
				}
				
			}
		}//end last for
		
	}

	@Override
	public void decreaseContrast() {
		for(int i = 0; i < data.length; i++){//rows
			for(int j = 0; j < data[i].length; j++){
				if(data[i][j] >= 0 && data[i][j] <= 127){
					data[i][j] += 16;
				}
				else if(data[i][j] > 127 && data[i][j] <= PictureLibrary.MAXVAL){
					data[i][j] -= 16;
				}				
			}
		}//end last for
		
	}
	
}
