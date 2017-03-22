import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
//ascending
class Ascend implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		
		return i1.compareTo(i2);
	}
	}
//Descending

class Dscend implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		
		return i2.compareTo(i1);
	}
	}
public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));	
	System.out.println("How many elements you want to enter?");
	int size= Integer.parseInt(br.readLine());
	Integer arr[]= new Integer[size];
	for(int i=0;i<size;i++){
		
		arr[i]=Integer.parseInt(br.readLine());
	}
	Arrays.sort(arr,new Ascend());
	{
		System.out.println("Elements in ascending order are:");
	for(Integer i:arr){
		
		System.out.println(i+"\t");
	}}
	Arrays.sort(arr,new Dscend());
	{
		System.out.println("Elements in descending order are:");
		for(Integer i:arr){
			System.out.println(i+"\t");
		}
	}
}

}
