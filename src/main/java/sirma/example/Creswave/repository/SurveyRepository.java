package sirma.example.Creswave.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import sirma.example.Creswave.model.Survey;

@Repository
public interface SurveyRepository extends PagingAndSortingRepository<Survey, Long> {
    Page<Survey> findAll(Pageable pageable); // This method retrieves data with pagination
}

