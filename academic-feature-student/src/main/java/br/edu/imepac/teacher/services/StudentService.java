package br.edu.imepac.teacher.services;

import br.edu.imepac.teacher.dtos.teacher.teacherRequestDto;
import br.edu.imepac.teacher.model.teacherModel;
import br.edu.imepac.teacher.repositories.teacherRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final teacherRepository studentRepository;

    public StudentService(teacherRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public teacherModel add(teacherRequestDto studentRequestDto) {
        teacherModel studentModel = new teacherModel();
        studentModel.setNome(studentRequestDto.getNome());
        studentModel.setMatricula(studentRequestDto.getMatricula());

        return studentRepository.save(studentModel);
    }

    public teacherModel getById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }
}
