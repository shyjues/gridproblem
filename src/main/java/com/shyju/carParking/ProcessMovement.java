package com.shyju.carParking;

public class ProcessMovement {
	
	String defaultDirection = "N";
	
	int index = 0;


	public String process(int xPosition, int yPosition, String pattern){
		
		System.out.println(pattern);
		
		while(pattern.charAt(index)!=-1){
			
			switch(pattern.charAt(index)){
			
			case 'R': System.out.println("R");
			break;
			case 'L':System.out.println("L");
			break;
			default: System.out.println("Not both");
			break;
			
			}
			
			index++;
		}
		
		return "";
		
	}
	
}
