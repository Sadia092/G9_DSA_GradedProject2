package com.Project.Floors;

import java.util.Stack;

public class Floors 
{
	
	@SuppressWarnings("unchecked")
	public static void construct(int[] size)
	
	{
		boolean isBig;
		
		Stack<Integer> s1 = new Stack<Integer>();
		
		for (int i = 0; i < size.length; i++) {
			isBig = true;
			int fsize = size[i];
			for (int j = i; j < size.length; j++) {
				if (j == i) {
					continue;
				} else {
					int fsize2 = size[j];
					if (fsize >= fsize2) {
						isBig = true;
						continue;
					} else {
						isBig = false;
						s1.push(fsize);
						break;
					}
				}
			}

			if (isBig == true) {
					@SuppressWarnings("rawtypes")
					Stack sa1 = FloorsAssemble.output(s1, fsize, i, size);
					s1.clear();
					s1 = (Stack<Integer>) sa1.clone();
					sa1.clear();
					System.out.println();
				
			} else {
				System.out.println("Day " + (i + 1) + " :");
			}
		}
	}
	
}
