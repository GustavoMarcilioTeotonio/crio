package com.senai.eli.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

@Table(name = "admin")
@Entity
@Getter
@Setter
public class Admin {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", nullable = false)
    @Email
    private String email;

    @Column(name = "ultimoAcesso")
    private LocalDateTime ultimoAcesso;

    @Column(name = "senha", nullable = false)
    private String senha;

    @Column(name = "usuario", nullable = false)
    private String usuario;
}
