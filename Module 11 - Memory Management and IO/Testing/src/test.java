import java.util.Scanner;
import java.io.PrintWriter;
import java.io.StringWriter;

public class test {
	public static void main(String [] args) {
		
		String item;
	      int quantity;
	      int discount;

	      StringWriter itemCharStream = new StringWriter();
	      PrintWriter itemOSS = new PrintWriter(itemCharStream);

	      item = "Book";
	      quantity = 12;
	      discount = 40;

	      itemOSS.println(item + " x" + quantity);
	      itemOSS.print(discount + "% off");

	      System.out.print(itemCharStream.toString());
		     
		   
		}
	}

