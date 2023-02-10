package com.Project.Floors;

import java.util.Arrays;
import java.util.Stack;

public class FloorsAssemble {
	
	@SuppressWarnings("rawtypes")
	public static Stack output(Stack s, int a, int i1, int[] arr) {

		int[] a1 = new int[arr.length];
		int count = 0;

		System.out.print("Day " + (i1 + 1) + " : " + a);
		Stack<Integer> T1 = new Stack<Integer>();
		boolean isBig;
		if (i1 == arr.length - 1) {
			while (!s.empty()) {
				int pop1 = (int) s.pop();
				a1[count++] = pop1;
			}
			if (a1 != null) {
				Arrays.sort(a1);
				for (int i = a1.length - 1; i > 0; i--) {
					if (a1[i] != 0) {
						System.out.print(" " + a1[i]);
					}

				}
			}

			return T1;
		} else {
			if (!s.empty()) {
				while (!s.empty()) {
					isBig = true;
					int p1 = (int) s.pop();
					for (int i = i1; i < arr.length; i++) {
						if (i == i1) {
							continue;
						}
						if (p1 < arr[i]) {
							T1.push(p1);
							isBig = false;
							break;
						} else {
							isBig = true;
						}
					}
					if (isBig == true) {
						a1[count++] = p1;
					}
				}
			}
			if (a1 != null) {
				Arrays.sort(a1);
				for (int i = a1.length - 1; i > 0; i--) {
					if (a1[i] != 0) {
						System.out.print(" " + a1[i]);
					}
				}
			}

			return T1;
		}
}
}
