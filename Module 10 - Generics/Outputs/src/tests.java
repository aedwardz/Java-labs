public class tests {
	public static <T extends Comparable<T>>
	T addition(T num1, T num2) {
		return num1 + num2;
	}
	public static void main(String[] args) {
		System.out.println(addition(1, 2.5));
	}
}