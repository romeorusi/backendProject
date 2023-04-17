package rr.project.projekti;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

import rr.project.projekti.domain.Diary;
import rr.project.projekti.domain.DiaryRepository;


/*@ExtendWith(SpringExtension.class)
@DataJpaTest
public class DiaryRepositoryTest {

    @Autowired
    private DiaryRepository diaryRepository;

    @Autowired
    private TestEntityManager em;

    @Test
    public void findByTitleShouldReturnTitle() {
        List<Diary> diaries = diaryRepository.findByActivity("Testi");
        
        assertThat(diaries).hasSize(1);
        assertThat(diaries.get(0).getDate()).isEqualTo("Testi");
    }

    @Test
    public void createNewDiary() {
        Diary diary = new Diary("Testi", "Testi", "Testi", "Testi");
        diaryRepository.save(diary);
        assertThat(diary.getId()).isNotNull();
    }

    @Test
public void deleteDiary(){
    Diary diary = new Diary("Testi", "Testi", "Testi", "Testi");
    final Long id = em.persistAndGetId(diary, Long.class);
    diaryRepository.deleteById(id);

    em.flush();
    Diary after = em.find(Diary.class, id);
    if(after != null) {
        diaryRepository.deleteById(after.getId());
    }
    assertThat(after).isNull();
}
  
}*/
