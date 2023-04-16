package rr.project.projekti.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface DiaryRepository extends CrudRepository<Diary, Long> {
    List<Diary> findById(String diaryId);

    void deleteById(String diaryId);   
    
    Diary findById(Diary diary);

    void deleteById(Diary diary);

    List<Diary> findByActivity(String string);



    
}
