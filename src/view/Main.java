package view;

import br.edu.fateczl.quicksort.QuickSort;

public class Main {
	
	public static void main(String[] args) {
		
		QuickSort quickSort = new QuickSort();
		
		int[] vet1 = { 74, 20, 74, 87, 81, 16, 25, 99, 44, 58 };
		int[] vet2 = { 44, 43, 42, 41, 40, 39, 38 };
		int[] vet3 = { 31, 32, 33, 34, 99, 98, 97, 96 };
		
		System.out.println("Vetor 1: 74, 20, 74, 87, 81, 16, 25, 99, 44, 58");
		System.out.println("Ordenado por Quick Sort: ");
		int[] vet1Ord = quickSort.sort(vet1, 0 , vet1.length - 1);
		for (int i : vet1Ord) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		System.out.println("Vetor 2: 44, 43, 42, 41, 40, 39, 38");
		System.out.println("Ordenado por Quick Sort: ");
		int[] vet2Ord = quickSort.sort(vet2, 0 , vet2.length - 1);
		for (int i : vet2Ord) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		System.out.println("Vetor 3: 31, 32, 33, 34, 99, 98, 97, 96");
		System.out.println("Ordenado por Quick Sort: ");
		int[] vet3Ord = quickSort.sort(vet3, 0 , vet3.length - 1);
		for (int i : vet3Ord) {
			System.out.print(i + " ");
		}
	}

}
