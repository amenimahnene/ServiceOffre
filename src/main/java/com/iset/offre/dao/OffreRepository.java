package com.iset.offre.dao;

import com.iset.offre.entities.Offre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * This interface is used to manage offre entitites.
 */
@Repository
public interface OffreRepository extends JpaRepository<Offre,Long> {
}
