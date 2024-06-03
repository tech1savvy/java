class Addition<N extends Number> {
	public N add(N num1, N num2) {
		if (num1 instanceof Integer && num2 instanceof Integer) {
			return (N) (Integer.valueOf(num1.intValue() + num2.intValue()));
		} else if (num1 instanceof Double && num2 instanceof Double) {
			return (N) (Double.valueOf(num1.doubleValue() + num2.doubleValue()));
		}
		return null;
	}
}

public class Main {
	public static void main(String[] args) {
		Addition<Integer> integerAddition = new Addition<>();
		Addition<Double> doubleAddition = new Addition<>();

		System.out.println("Integer addition: " + integerAddition.add(1, 1));
		System.out.println("Double addition: " + doubleAddition.add(1.0, 1.0));
	}
}

/*
The type argument can be any one of the following non-primitive types:
any class type - eg: ArrayList<Integer>, HashMap<String, String>
any interface type - eg: ArrayList<CharSequence>
any array type - eg: ArrayList<int[ ]>, HashMap<String, boolean[ ]>
nested generic type arguments - eg: ArrayList<Set<String>>, HashMap<String, List<Integer>>
Type parameter names are usually single character uppercase letters. The convention used in Java is given below:
E - is used while working with elements. Almost all classes in collection framework which work with elements use this name as the type parameter name.
K - is used to denote the key in a key-value pair. Almost all classes in the Map hierarchy in collection framework use this name to denote a key.
V - is used to denote the value in a key-value pair. Almost all classes in the Map hierarchy in collection framework use this name to denote a value.
T - is used to denote a class or interface of any type.
N - is used to denote a Number.
We can use S, U, V and so on when we want to denote different types after the first type.
*/