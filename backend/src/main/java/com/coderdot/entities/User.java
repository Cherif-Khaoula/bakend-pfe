package com.coderdot.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    private String telephone;
    private String adresse;
    private LocalDate dateNaissance;
    private LocalDate dateEmbauche;
    private String departement;
    private String poste;
    private BigDecimal salaire;

    @Enumerated(EnumType.STRING)
    private StatutUtilisateur statut; // Enum pour 'actif', 'inactif', 'suspendu'

    private String photoProfil;

    private LocalDate derniereConnexion;

    @Column(updatable = false)
    private LocalDate createdAt;

    private LocalDate updatedAt;

    // Constructeur par défaut
    public User() {
        this.createdAt = LocalDate.now(); // Définit la date de création automatiquement
        this.statut = StatutUtilisateur.ACTIF; // Définit le statut par défaut
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public UserRole getRole() { return role; }
    public void setRole(UserRole role) { this.role = role; }

    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public LocalDate getDateNaissance() { return dateNaissance; }
    public void setDateNaissance(LocalDate dateNaissance) { this.dateNaissance = dateNaissance; }

    public LocalDate getDateEmbauche() { return dateEmbauche; }
    public void setDateEmbauche(LocalDate dateEmbauche) { this.dateEmbauche = dateEmbauche; }

    public String getDepartement() { return departement; }
    public void setDepartement(String departement) { this.departement = departement; }

    public String getPoste() { return poste; }
    public void setPoste(String poste) { this.poste = poste; }

    public BigDecimal getSalaire() { return salaire; }
    public void setSalaire(BigDecimal salaire) { this.salaire = salaire; }

    public StatutUtilisateur getStatut() { return statut; }
    public void setStatut(StatutUtilisateur statut) { this.statut = statut; }

    public String getPhotoProfil() { return photoProfil; }
    public void setPhotoProfil(String photoProfil) { this.photoProfil = photoProfil; }

    public LocalDate getDerniereConnexion() { return derniereConnexion; }
    public void setDerniereConnexion(LocalDate derniereConnexion) { this.derniereConnexion = derniereConnexion; }

    public LocalDate getCreatedAt() { return createdAt; }

    public LocalDate getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDate updatedAt) { this.updatedAt = updatedAt; }
}
