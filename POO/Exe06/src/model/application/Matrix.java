package model.application;

import java.util.Scanner;

public class Matrix {
	private Integer[][] matrix;
	private Integer row;
	private Integer column;
	
	public Matrix() {
		
	}
	
	public Matrix(Integer row, Integer column) {
		this.row = row;
		this.column = column;
		startMatrix();
	}

	public Integer[][] getMatrix() {
		return matrix;
	}
	
	public void startMatrix() {
		if (row == 0 || column == 0)
			throw new IllegalArgumentException("A linha ou coluna não pode ser zerado.");
		
		if (row < 0 || column < 0)
			throw new IllegalArgumentException("A linha ou coluna não pode ser negativo.");

		this.matrix = new Integer[row][column];
		
		for (int i=0;i<row;i++)
			for(int j=0;j<column;j++)
				matrix[i][j] = 0;
		
		System.out.println("Matrix iniciada com sucesso!");
	}
	
	public void printMatrix() {
		for (int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(" " + matrix[i][j]);
			}
			System.out.println();
		}
	}
	
	public void search(int numberSearch) {
		boolean resultSearch = false;
		
		for (int i=0;i<row;i++)
			for(int j=0;j<column;j++) 
				if (matrix[i][j].equals(numberSearch)) 
					resultSearch = true;

				
		if (resultSearch) 
			System.out.println("Número encontrado!");
		else
			throw new IllegalArgumentException("Número não encontrado!");
	}
	
	public void updateMatrix(Scanner scanner) {
		int value = 0;
		for (int i=0;i<row;i++)
			for(int j=0;j<column;j++) {
				System.out.print("Informe o valor: ["+(i)+"]["+j+"] :");
				value = scanner.nextInt();
				matrix[i][j] = value;
			}
		System.out.println("Matriz atualizada com sucesso!");
	}
}
