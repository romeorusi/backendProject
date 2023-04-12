package rr.project.projekti;

import org.apache.catalina.startup.ClassLoaderFactory.RepositoryType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import rr.project.projekti.domain.Diary;
import rr.project.projekti.domain.DiaryRepository;




@SpringBootApplication
public class ProjektiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjektiApplication.class, args);
	}


	@Bean
	
		public CommandLineRunner demo(DiaryRepository diaryRepository) {
			return (args) -> {
				// save a couple of customers
				diaryRepository.save(new Diary("Kävin lenkillä", "2021-05-01", "2500", "Hyvä"));
				diaryRepository.save(new Diary("Hypin parvekkeelta", "2023-04-06", "2500", "Hyvä"));
				diaryRepository.save(new Diary("Kävin lenkillä", "2023-09-12", "2600", "Very sad"));
				diaryRepository.save(new Diary("Kävin lenkillä", "2021-05-04", "2500", "Neutral"));
			};
		}
	}
