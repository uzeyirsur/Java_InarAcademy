package chapters.chapter_05.Exercises;

public class Exercise_05_12 {
public static void main(String[] args) {
	int n = 0;
	while (Math.pow(n, 2) < 1200) {
		n++;
	}
	System.out.println("The smallest n is " + n * -1);
}
}
