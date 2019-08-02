import java.util.*; 
public class Solution 
{ 
  public static TreeMap<Integer,Object> map=new TreeMap<Integer,Object>();    


static void printAllSubsetsRec(int arr[], int n, Vector<Integer> v, 
						int sum) 
{ 
	
	if (sum == 0) { 
	    map.put(v.size(), v);
		for (int i=0;i<v.size();i++) 
			System.out.print( v.get(i) + " "); 
		System.out.println(); 
		return; 
	} 

	if (n == 0) 
		return; 

	printAllSubsetsRec(arr, n - 1, v, sum); 
	Vector<Integer> v1=new Vector<Integer>(v); 
	v1.add(arr[n - 1]); 
	printAllSubsetsRec(arr, n - 1, v1, sum - arr[n - 1]); 
} 


static void printAllSubsets(int arr[], int n, int sum) 
{ 
	Vector<Integer> v= new Vector<Integer>(); 
	printAllSubsetsRec(arr, n, v, sum); 
} 


public static void main(String args[]) 
{ 
	int arr[] = {10,0,-1,20,25,30};; 
	int sum = 45; 
	int n = arr.length; 
	printAllSubsets(arr, n, sum); 
	System.out.println((Vector<Integer>)map.get(map.firstKey()));
} 
} 