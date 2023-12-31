package br.com.ifpe.cmaisapipp2.modelo.instituicao;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import br.com.ifpe.cmaisapipp2.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "instituicao")
@Where(clause = "habilitado = true")

public class Instituicao extends EntidadeAuditavel {

  @Column
  private String NomeInstituicao;

  @Column
  private String CnpjInstituicao;

  @Column
  private String EnderecoInstituicao;

  @Column
  private String TelefoneInstituicao;

  @Column
  private String Finalidade;

  @Column
  private LocalDate DataConstituicao;

  @Column
  private String EmailInstituicao;

  @Column
  private String RedesSociaisIntituicao;

  @Column
  private String ComprovanteCadastro;

  @Column
  private String NomeResponsavel;

  @Column
  private String CpfReponsavel;

  @Column
  private String TelefoneResponsavel;

  @Column
  private String EmailResponsavel;

  @Column
  private String CargoReponsavel;

  @Column
  private String SenhaAcesso;
}
