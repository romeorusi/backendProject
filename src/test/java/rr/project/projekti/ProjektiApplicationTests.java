package rr.project.projekti;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import rr.project.projekti.web.DiaryController;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ProjektiApplicationTests {
	
	@Autowired
	private DiaryController diaryController;

	@Test
	void contextLoads() {
			assertThat(diaryController).isNotNull();
	}

}
