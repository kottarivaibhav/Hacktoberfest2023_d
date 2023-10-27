
import java.util.Random;
import java.util.Scanner;
public class Quicksort {
 private int[] a; 
 void input(){
 Scanner sc = new Scanner(System.in);
 Random rm = new Random();
 System.out.print("Enter the total numbers: ");
 int n = sc.nextInt();
 a = new int[n];
 for (int i = 0; i < n; i++) {
 a[i] = rm.nextInt(1000); // Generates random numbers 0-999
 } //rm.nextInt() can also be used
 }
 
 void display(){
 for (int x : a) {
 System.out.print(x + " ");
 }
 }
 void sort(){
 quicksort(0, a.length - 1);
 }
 
 void quicksort(int left, int right) {
 if (left < right) {
	 int s = partition(left, right);
	 quicksort(left, s - 1);
	 quicksort(s + 1, right);
	 }
	 }
	 int partition(int left, int right) {
	 int pivot = a[left];
	 
	 int i = left; // search starts from left, 
	 int j = right; // search starts from right, 
	 while(i<j)
	 {
	 while (a[i] <= pivot && i<right)
	 {
	 
	 i++;
	 }
	 while (a[j] > pivot && j>left)
	 {
	 j--;
	 }
	 if(i<j)
	 {
	 swap(i, j);
	 }
	 }
	 swap(left, j);
	 return j;
	}
	 private void swap(int i, int j) {
		 int temp = a[i];
		 a[i] = a[j];
		 a[j] = temp;
		 }
		 public static void main(String args[]) {
		 
		 Quicksort sorter = new Quicksort();
		 sorter.input();
		 System.out.println("Array before sorting");
		 sorter.display();
		 
		 long startTime = System.nanoTime(); //
		 sorter.sort();
		 long endTime = System.nanoTime();
		 double duration = (endTime - startTime)/1000000; //divide by 1000000 to get milliseconds.
		 System.out.println("\nArray After sorting");
		 sorter.display();
		 System.out.println("\nTime for sorting is " + duration + " milli seconds");
		 }
}
