/**
 * Implementation of Stats class
 * 
 * @author Nick Nikolov
 * 
 */
public class Stats {

	private int grades[];
	private int count;
	private int currentInput;

	/** Default constructor for the Stats object
	 * initializes an emptty, size 100 array of grades
	 * count (int) - used to keep track of current grade input location
	 * 
	 */
	public Stats() {
		grades = new int[100];
		count = 0;
	}
	
	/** getter for current grade input
	 * @return currentInput (int) current grade input provided by the user
	 */
	public int getCurrentInput () {
		return this.currentInput;
	}
	
	/** setter for the current grade input
	 * @param ci (int) current grade input provided by the user
	 */
	public void setCurrentInput(int ci) {
		this.currentInput = ci;
	}
	
	
	/** adds the current user input to the grades array and increments the array index
	 * @param c (int) current grade input provided by the user
	 * count (int) - current position in the grades array
	 */
	public void add(int g) {
		grades[count] = g;
		count++;
	}
	
	/**
	 * @return Mean value of all current grade inputs as a double
	 */
	public double getMean() {
		double sum = 0;
		for (int i = 0; i < count; i++) {
			sum += grades[i];
		}
		return sum / count;
	}
	
	
	/** calls the sort function to sort all current user inputs
	 * @return Median grade value of all current inputs as a double
	 */
	public double getMedian() {
		sort();
		if (count % 2 == 0) {
			return (grades[(count/2)-1] + grades[(count/2)])/2.0;
		}
		else 
			return grades[count/2];
	}
	
	/**
	 *@return String of all grades in sorted order, along with calculated median and mean values
	 */
	public String toString() {
		double mean = getMean();
		double median = getMedian();
		
		String sortedGrades = "";
		for (int i = 0; i < count; i++) {
			sortedGrades = sortedGrades + grades[i] + " ";
		}
		return "\n" + "List of sorted grades: " + sortedGrades + "\n " +  " Mean = " + mean +"\n" + " Median = " + median + "\n";
	
	}
	

	/**
	 * 
	 * Sorts the first count elements of grades array with Bubble sort.
	 * 
	 * Bubble sort adapted
	 * from 5.2 Try-this: Sorting an array 
	 * in Java, a beginner's guide 9th ed 
	 * 
	 */
	
	public void sort() {
		int a, b, t;
		for(a=1; a<count; a++) {
			for(b=count-1;b>=a;b--) {
				if(grades[b-1]>grades[b]) {
					t = grades[b-1];
					grades[b-1] = grades[b];
					grades[b] = t;
				}
			}
			
		}
	}
}
