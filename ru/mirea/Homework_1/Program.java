package ru.mirea.Homework_1;

import java.util.Scanner;

public class Program {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int size;
		do {
			System.out.println("Пожалуйста, введите размер массива.");
			size = in.nextInt();
		} while (size <= 0);
		int arr[] = new int[size];
		int j = 1;
		//Цикл do while
		do {
			System.out.println("Пожалуйста, введите " + j + "-е число.");
			arr[j - 1] = in.nextInt();
			j++;
		} while (j <= size);
		int sum, max, min;
		sum = max = min = arr[0];
		j = 1;
		//Цикл while
		while (j < size) {
			if (arr[j] > max) {
				max = arr[j];
			}
			if (arr[j] < min) {
				min = arr[j];
			}
			sum += arr[j];
			j++;
		}
		System.out.printf("Сумма = %d.\nМаксимальный элемент = %d.\nМинимальный элемент = %d.\n", sum, max, min);
	}
}
