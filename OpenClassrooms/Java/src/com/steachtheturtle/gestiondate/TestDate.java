package com.steachtheturtle.gestiondate;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TestDate {

	public static void main(String[] args) {
		// Get the current date and time
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("Date et heure courante : " + currentTime);

		LocalDate date1 = currentTime.toLocalDate();
		System.out.println("Date courante : " + date1);

		Month mois = currentTime.getMonth();
		int jour = currentTime.getDayOfMonth();
		int heure = currentTime.getHour();

		System.out.println("Mois : " + mois + ", jour : " + jour + ", heure : " + heure);

		// Avoir le 25 décembre 2023
		LocalDateTime date2 = currentTime.withDayOfMonth(25).withYear(2023).withMonth(12);
		System.out.println("Date modifiée : " + date2);

		// une autre façon
		LocalDate date3 = LocalDate.of(2023, Month.DECEMBER, 25);
		System.out.println("Autre façon de faire : " + date3);

		// On peut même parser une date depuis un String
		LocalTime parsed = LocalTime.parse("20:15:30");
		System.out.println("Date parsée : " + parsed);

		System.out.println();

		// Le 25 Décembre 2018 a 13H37
		LocalDateTime ldt = LocalDateTime.of(2018, Month.DECEMBER, 25, 13, 37, 0);
		System.out.println("Date de référence : " + ldt);
		// Utilisation de l'objet ChronoUnit pour changer l'objet
		System.out.println("+1 semaine : " + ldt.plus(1, ChronoUnit.WEEKS));
		System.out.println("+2 mois : " + ldt.plus(2, ChronoUnit.MONTHS));
		System.out.println("+3 ans : " + ldt.plus(3, ChronoUnit.YEARS));
		System.out.println("+4 heures : " + ldt.plus(4, ChronoUnit.HOURS));
		System.out.println("-5 secondes : " + ldt.minus(5, ChronoUnit.SECONDS));
		System.out.println("-38 minutes : " + ldt.minusMinutes(38));

		System.out.println();

		// Toujours notre 25 Décembre 2018 a 13H37
		LocalDateTime ldt1 = LocalDateTime.of(2018, Month.DECEMBER, 25, 13, 37, 0);
		LocalDateTime ldt2 = ldt.plus(3, ChronoUnit.YEARS);
		LocalDateTime ldt3 = ldt.minusMinutes(1337);

		Period p = Period.between(ldt1.toLocalDate(), ldt2.toLocalDate());
		Duration d = Duration.between(ldt1.toLocalTime(), ldt3.toLocalTime());
		System.out.println("Période : " + p);
		System.out.println("Durée : " + d.getSeconds());
		System.out.println("Ecart en jour : " + ChronoUnit.DAYS.between(ldt, ldt2));

		System.out.println();

		// Toujours notre 25 Décembre 2018 a 13H37
		LocalDate ldt4 = LocalDate.of(2018, Month.DECEMBER, 25);

		// Le prochain samedi
		LocalDate prochainSamedi = ldt4.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println(prochainSamedi);

		// Le troisième mardi du mois suivant
		// On ajoute un mois à notre date
		ldt4 = ldt4.plus(1, ChronoUnit.MONTHS);
		// On en créer une nouvelle au premier jour du mois
		LocalDate ldt5 = LocalDate.of(ldt4.getYear(), ldt4.getMonth(), 1);
		// On avance de trois mardi
		LocalDate troisiemeMardi = String.valueOf(ldt5.getDayOfWeek()).equals("TUESDAY")
				? ldt5.with(TemporalAdjusters.next(DayOfWeek.TUESDAY)).with(TemporalAdjusters.next(DayOfWeek.TUESDAY))
				: ldt5.with(TemporalAdjusters.next(DayOfWeek.TUESDAY)).with(TemporalAdjusters.next(DayOfWeek.TUESDAY))
						.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		System.out.println(troisiemeMardi);

		System.out.println();

		Map<String, String> maps = ZoneId.SHORT_IDS;
		maps.values().stream().forEach((x) -> {
			System.out.println(x + " -- " + ZoneId.of(x).getRules());
		});

		// Et connaître notre fuseau
		System.out.println("");
		System.out.println("Fuseau horaire courant : " + ZoneId.systemDefault());
		System.out.println("Règle appliquer aux heures : " + ZoneId.systemDefault().getRules());

		System.out.println("");

		LocalDateTime ldt6 = LocalDateTime.parse("2018-01-01T01:33:00");
		List<ZoneId> lzi = Arrays.asList(ZoneId.of("Europe/Paris"), ZoneId.of("Asia/Tokyo"),
				ZoneId.of("America/Anchorage"));

		lzi.stream().forEach((x) -> {
			System.out.println(x + " : \t" + ldt6.atZone(x).toInstant());
		});

	}

}
