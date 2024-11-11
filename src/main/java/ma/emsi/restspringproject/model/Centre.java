package ma.emsi.restspringproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="Centre")
public class Centre  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name="nom_centre", nullable=false)
    String nom;
    @Column(name="adress_centre")
    String adress;

    @OneToMany(mappedBy = "centre")
    List<Etudiant> listEtudiants;
}
