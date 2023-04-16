package rr.project.projekti;

import org.apache.catalina.startup.ClassLoaderFactory.RepositoryType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import rr.project.projekti.domain.Diary;
import rr.project.projekti.domain.DiaryRepository;
import rr.project.projekti.domain.User;
import rr.project.projekti.domain.UserRepository;



@SpringBootApplication
public class ProjektiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjektiApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(DiaryRepository diaryRepository, UserRepository userRepository) {
		return (args) -> {
			// create sample diary entries
			diaryRepository.save(new Diary("Testi", "Testi", "Testi", "Testi"));
			diaryRepository.save(new Diary("Hypin parvekkeelta", "2023-04-06", "2500", "Hyvä"));
			diaryRepository.save(new Diary("Kävin lenkillä", "2023-09-12", "2600", "Very sad"));
			diaryRepository.save(new Diary("Kävin lenkillä", "2021-05-04", "2500", "Neutral"));

			// create sample users
			User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6","USER");
			User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");

			// save users to the repository
			userRepository.save(user1);
			userRepository.save(user2);
		};
	}
}
