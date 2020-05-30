package com.steachtheturtle.java.util.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class TestFunction {
	public static void main(String[] args) {

		List<Personne> lPersonne = Arrays.asList(new Personne(10, "toto"), new Personne(20, "titi"),
				new Personne(30, "tata"), new Personne(40, "tutu"));

		Function<Personne, String> f1 = (Personne p) -> p.getNom();
		Function<Personne, Integer> f2 = (Personne p) -> p.getAge() * 2;
		System.out.println(transformToListString(lPersonne, f1));
		System.out.println(transformToListInt(lPersonne, f2));

		System.out.println();

		Function<Personne, String> f1p = (Personne p) -> p.getNom();
		// On ne multiplie plus l'age par 2
		Function<Personne, Integer> f2p = (Personne p) -> p.getAge();
		// Nous définissons un traitement supplémentaire sur l'âge
		Function<Integer, Integer> f3p = (Integer a) -> a * 2;
		System.out.println(transformToListString(lPersonne, f1p));
		System.out.println(transformToListInt(lPersonne, f2p.andThen(f3p)));

		System.out.println();

		for (int i = 0; i < lPersonne.size(); i++) {
			System.out.print(lPersonne.get(i).getNom() + " " + lPersonne.get(i).getAge() + ", ");
		}

		System.out.println();
		System.out.println();

		Predicate<Personne> predicate = (Personne p) -> p.getAge() > 20;
		for (Personne p : lPersonne) {
			if (predicate.test(p))
				System.out.println(p.getNom() + " a l'âge requis !");
		}

		System.out.println();

		Supplier<String> s1 = () -> new String("hello !");
		System.out.println(s1.get());
		Supplier<Personne> s2 = () -> new Personne(50, "Dédé");
		System.out.println(s2.get());

		System.out.println();

		// Conversion d'un String en Double avec une référence à une méthode statique
		ToDoubleFunction<String> stringToDoubleLambda = (s) -> Double.parseDouble(s);
		ToDoubleFunction<String> stringToDoubleRef = Double::parseDouble;
		System.out.println(stringToDoubleLambda.applyAsDouble("0.1234567"));
		System.out.println(stringToDoubleRef.applyAsDouble("0.1234567"));

		// Utilisation d'une référence à une méthode d'instance (println)
		// de l'instance out de la classe 'System'
		Consumer<String> stringPrinterLambda = (s) -> System.out.println(s);
		Consumer<String> stringPrinterRef = System.out::println;
		stringPrinterLambda.accept("Bonjour !");
		stringPrinterRef.accept("Bonjour !");

		// Ici, nous utilisons carrément un constructeur
		// Notre interface fonctionnelle devient une fabrique d'Integer !
		ToIntFunction<String> testNew = Integer::new;
		Integer i = testNew.applyAsInt("1235");
		System.out.println("New Integer created : " + i.getClass());

	}

	public static List<Integer> transformToListInt(List<Personne> list, Function<Personne, Integer> func) {
		List<Integer> ls = new ArrayList<>();
		for (Personne p : list) {
			ls.add(func.apply(p));
			// func.apply(p) retournera ici l'âge multiplié par 2 de l'objet Personne
		}
		return ls;
	}

	public static List<String> transformToListString(List<Personne> list, Function<Personne, String> func) {
		List<String> ls = new ArrayList<>();
		for (Personne p : list) {
			ls.add(func.apply(p));
			// func.apply(p) retournera ici le nom de l'objet Personne
		}
		return ls;
	}
}
