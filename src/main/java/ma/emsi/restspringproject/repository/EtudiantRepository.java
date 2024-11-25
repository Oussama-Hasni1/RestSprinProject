package ma.emsi.restspringproject.repository;

import ma.emsi.restspringproject.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource(path = "students")
public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {
    List<Etudiant> findEtudiantsByNom(@Param("nom")String nom);
}
