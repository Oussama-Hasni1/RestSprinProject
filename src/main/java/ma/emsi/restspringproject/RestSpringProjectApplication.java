package ma.emsi.restspringproject;

import ma.emsi.restspringproject.enums.Genre;
import ma.emsi.restspringproject.model.Centre;
import ma.emsi.restspringproject.model.Etudiant;
import ma.emsi.restspringproject.repository.CentreRepository;
import ma.emsi.restspringproject.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestSpringProjectApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RestSpringProjectApplication.class, args);
    }
    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    CentreRepository centreRepository;
    @Override
    public void run(String... args) throws Exception {


        Centre ctr1=Centre.builder()
                .nom("Centre Maarif")
                .adress("Biranzarane")
                .build();
        centreRepository.save(ctr1);

        Centre ctr2=Centre.builder()
                .nom("Centre Moulay Youssef")
                .adress("Moulay Youssef")
                .build();
        centreRepository.save(ctr2);

        Etudiant et1=Etudiant.builder()
                .nom("Adnani")
                .prenom("Morad")
                .genre(Genre.Homme)
                .centre(ctr1)
                .build();
        etudiantRepository.save(et1);
        Etudiant et2=Etudiant.builder()
                .nom("Adnani")
                .prenom("samira")
                .genre(Genre.Femme)
                .centre(ctr2)
                .build();
        etudiantRepository.save(et2);
    }
}
