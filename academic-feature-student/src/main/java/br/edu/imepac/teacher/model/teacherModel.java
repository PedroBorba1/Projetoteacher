package br.edu.imepac.teacher.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class teacherModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String matricula;

    public Object getId() {
        return null;
    }

    public Object getNome() {
        return null;
    }

    public Object getMatricula() {
        return null;
    }

    public void setMatricula(String matricula) {
    }

    public void setNome(String nome) {

    }
}
