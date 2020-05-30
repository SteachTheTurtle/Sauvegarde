package com.steachtheturtle.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {

		List<Personne> listP = Arrays.asList(new Personne(1.80, 70, "A", "Nicolas", Couleur.BLEU),
				new Personne(1.56, 50, "B", "Nicole", Couleur.VERRON),
				new Personne(1.75, 65, "C", "Germain", Couleur.VERT),
				new Personne(1.68, 50, "D", "Michel", Couleur.ROUGE),
				new Personne(1.96, 65, "E", "Cyrille", Couleur.BLEU),
				new Personne(2.10, 120, "F", "Denis", Couleur.ROUGE),
				new Personne(1.90, 90, "G", "Olivier", Couleur.VERRON));

		Stream<Personne> sp = listP.stream();
		sp.forEach(System.out::println);

		// Stream.iterate(2d, (x) -> x + 1).limit(20).forEach(System.out::println);

		System.out.println("\nAprès le filtre\n");
		sp = listP.stream();
		sp.filter(x -> x.getPoids() > 50).forEach(System.out::println);

		System.out.println("\nAprès le filtre et le map\n");
		sp = listP.stream();
		sp.filter(x -> x.getPoids() > 50).map(x -> x.getPoids()).forEach(System.out::println);

		System.out.println("\nAprès le filtre et le map et reduce\n");
		sp = listP.stream();

		Double sum = sp.filter(x -> x.getPoids() > 50).map(x -> x.getPoids()).reduce(0.0d, (x, y) -> x + y);
		System.out.println(sum);

		System.out.println("\nAprès le filtre et le map et reduce\n");
		sp = listP.stream();

		Optional<Double> sumOpt = sp.filter(x -> x.getPoids() > 250).map(x -> x.getPoids()).reduce((x, y) -> x + y);

		if (sumOpt.isPresent())
			System.out.println(sumOpt.get());
		else
			System.out.println("Aucun aggrégat de poids...");

		sp = listP.stream();

		long count = sp.filter(x -> x.getPoids() > 50).map(x -> x.getPoids()).count();

		System.out.println("\nNombre d'éléments : " + count + "\n");

		sp = listP.stream();

		List<Double> ld = sp.filter(x -> x.getPoids() > 50).map(x -> x.getPoids()).collect(Collectors.toList());
		System.out.println(ld);

		System.out.println("\nTest lecture fichier avec Stream\n");

		String fileName = "/home/yannick/Bureau/Git/Sauvegarde/OpenClassrooms/Java/src/com/steachtheturtle/flux/Text.txt";
		try (Stream<String> sf = Files.lines(Paths.get(fileName))) {
			sf.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
