package br.com.managementhomenew.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "home")
public class Home {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_home")
    private Long idHome;

    @Column(name = "home_name")
    private String homeName;

    @Column(name = "home_latitude")
    private float homeLatitude;

    @Column(name = "home_longitude")
    private float homeLongitude;

    public Home(Long id) {
        this.idHome = id;
    }
}
