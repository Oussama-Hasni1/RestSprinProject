package ma.emsi.restspringproject.controllers;

import ma.emsi.restspringproject.dto.EtudiantDTO;
import ma.emsi.restspringproject.model.Centre;
import ma.emsi.restspringproject.model.Etudiant;
import ma.emsi.restspringproject.repository.CentreRepository;
import ma.emsi.restspringproject.repository.EtudiantRepository;
import ma.emsi.restspringproject.services.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class EtudiantGraphQLController {
    @Autowired
    private EtudiantService etudiantService;

    @QueryMapping
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.getAllEtudiants();
    }

    @QueryMapping
    public Optional<Etudiant> getEtudiantById(@Argument int id) {
        return etudiantService.getEtudiantById(id);
    }

    @MutationMapping
    public Etudiant createEtudiant(@Argument("input") EtudiantDTO etudiantDTO) {
        return etudiantService.createEtudiant(etudiantDTO);
    }

    @MutationMapping
    public Etudiant modifyEtudiant(@Argument EtudiantDTO etudiantDTO) {

        return etudiantService.modifyEtudiant(etudiantDTO);
    }

    @MutationMapping
    public boolean deleteEtudiant(@Argument int id) {
        return etudiantService.deleteEtudiant(id);
    }

}