/**
*Searches temperature array and prints highest temperature, along with the corresponding month.
*
*
*
* @Diza
*/
import java.util.*;

public class searchArray 
{

public static void main(String args[])
{
	int[] temps = {34, 32, 40, 50, 55, 70, 73, 75, 70, 65, 55, 40};
	String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
	int maxVal = temps[0];
	int maxIndex = 0;
	int i;
	for (i = 0; i < temps.length; i++){
		if (temps[i] > maxVal) {
		maxVal = temps[i];
		maxIndex = i;
		}
	}
	System.out.println(months[maxIndex] + " - " + maxVal);
}

}



