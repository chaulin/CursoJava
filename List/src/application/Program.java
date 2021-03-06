package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		list.remove(1);

		System.out.println(list.size());

		for (String cha : list) {
			System.out.println(cha);
		}

		System.out.println("=====================");
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String cha : list) {
			System.out.println(cha);
		}
		
		System.out.println("=====================");
		System.out.println("Index of Anna: " + list.indexOf("Anna"));
		System.out.println("Index of Chaulin: " + list.indexOf("Chaulin"));
		System.out.println("=====================");
		List<String> result = list.stream().filter (x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String cha : result){
			System.out.println(cha);
		}
		System.out.println("=====================");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);

	}
}
