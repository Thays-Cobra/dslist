package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
    //Camada que acessa o banco de dados, e consulta o dado
    // A interface JpaRepository já possui os métodos básicos de CRUD (Create, Read, Update, Delete)
    // Portanto, não é necessário implementar nenhum metodo aqui
    // O Spring Data JPA irá gerar a implementação automaticamente

}
