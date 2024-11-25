package ma.emsi.restspringproject.repository;

import ma.emsi.restspringproject.model.Centre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "Centres")
public interface CentreRepository extends JpaRepository<Centre,Integer> {
    Centre findCentreByNom(@Param("nom") String nom);
}
