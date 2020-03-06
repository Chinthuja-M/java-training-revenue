package com.accenture.tagtrainingspring;

import com.accenture.tagtrainingspring.patient.Gender;
import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;
import com.accenture.tagtrainingspring.screening.ScreeningService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TagTrainingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TagTrainingSpringApplication.class, args);

		LocalDate now = LocalDate.now();

		ScreeningService screeningService = new ScreeningService();

		Patient joe = new Patient("Joe", now, Gender.MALE);
		Patient debbie = new Patient("Debbie", LocalDate.of(1994, Month.APRIL, 13), Gender.FEMALE);
		Patient john = new Patient("John", LocalDate.of(1995, Month.OCTOBER, 18), Gender.MALE);
		Patient cathy = new Patient("Cathy", LocalDate.of(1968, Month.DECEMBER, 29), Gender.FEMALE);
		Patient bob = new Patient("Bob", LocalDate.of(1957, Month.APRIL, 1), Gender.MALE);

		Screening screening1 = new Screening(joe, now, false);
		Screening screening2 = new Screening(debbie, now, false);
		Screening screening3 = new Screening(john, now, true);
		Screening screening4 = new Screening(cathy, now, true);
		Screening screening5 = new Screening(bob, now, false);

		List<Screening> screenings = new ArrayList<>();
		screenings.add(screening1);
		screenings.add(screening2);
		screenings.add(screening3);
		screenings.add(screening4);
		screenings.add(screening5);

		for (Screening screening : screenings) {
			System.out.println("Screening for patient " + screening.getPatient().getName() + ", returned a malignant result of " + screening.isMalignant());
		}

	}

}
