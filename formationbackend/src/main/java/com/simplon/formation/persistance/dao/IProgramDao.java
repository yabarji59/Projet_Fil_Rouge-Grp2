package com.simplon.formation.persistance.dao;

import java.util.List;

import com.simplon.formation.persistance.entities.ProgramDo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IProgramDao extends JpaRepository<ProgramDo, Long> {
    /**
     * retrieve the list of programs by title
     * @param title
     * @return
     */

    @Query(value = "SELECT * FROM PROGRAM WHERE PROGRAM_Title = ?1", nativeQuery = true)
    List<ProgramDo> findAllByTitleContaining(String ProgramTitle);
}
