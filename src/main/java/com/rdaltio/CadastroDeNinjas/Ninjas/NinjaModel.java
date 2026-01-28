package com.rdaltio.CadastroDeNinjas.Ninjas;

import com.rdaltio.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "idade")
    private int idade;

    //  Muitos ninjas podem ter somente uma missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreign Key
    private MissoesModel missoes;

}
