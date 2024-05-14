package br.edu.imepac.teacher.repositories;

import br.edu.imepac.teacher.model.teacherModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface teacherRepository extends JpaRepository<teacherModel, Long> {
}
