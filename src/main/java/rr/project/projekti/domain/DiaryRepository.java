package rr.project.projekti.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface DiaryRepository extends CrudRepository<Diary, Long> {
    List<Diary> findById(String bookId);

    
}
