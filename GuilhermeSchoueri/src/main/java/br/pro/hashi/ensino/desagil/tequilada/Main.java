package br.pro.hashi.ensino.desagil.tequilada;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		
		BufferedReader reader = null;
		
		boolean readingHeader = true;
		String[] rowAndColSplit;
		
		int row = 0;
		int col = 0;
		char[][] labirinto = new char[0][0];
		int rowCounter = 0;
		

		try {
			File file = new File("src/main/resources/Labirinto.dat");
			
		    reader = new BufferedReader(new FileReader(file));

		    String line;
		    while ((line = reader.readLine()) != null) {
		    	
		        if (readingHeader) {
		        	rowAndColSplit = line.split(" ");
		        	
	        		row = Integer.parseInt(rowAndColSplit[0]);
	        		col = Integer.parseInt(rowAndColSplit[1]);
	        		
	        		labirinto = new char[row][col];
	        		
	        		readingHeader = false;
		        }
		        
		        else {
		        	
		        	for (int i = 0; i < col; i++) {
		        		if (line.charAt(i) == ' ') {
		        			labirinto[rowCounter][i] = ' ';
		        		}
		        		else {
		        			labirinto[rowCounter][i] = 'X';
		        		}
		        	}
		        	
		        	rowCounter++;
		        }
		    }

		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    try {
		        reader.close();
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(labirinto[i][j]);
			}
			System.out.print("\n");
		}
		
	}

}

