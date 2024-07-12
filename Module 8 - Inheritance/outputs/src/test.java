import java.util.Scanner;
import java.util.ArrayList;
public class test {
	public static int changeValue(int x) {
		   int y;
		   x = x * 2;
		   y = x + 1;
		   return y;
		}  
	
	public static void _replace(int [] allGrades, int examScore) {
		   allGrades[1] = examScore;
		}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<String> groceryList;
		groceryList = new ArrayList<String>();
		groceryList.add("Bread");
		groceryList.add("Apples");
		groceryList.add("Grape Jelly");
		groceryList.add("Peanut Butter");
		groceryList.set(1, "Frozen Pizza");
		System.out.print(groceryList.size());
		}
	}

