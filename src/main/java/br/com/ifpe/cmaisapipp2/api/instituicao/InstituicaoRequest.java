package br.com.ifpe.cmaisapipp2.api.instituicao;

import java.time.LocalDate;

import br.com.ifpe.cmaisapipp2.modelo.instituicao.Instituicao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class InstituicaoRequest {

  private String NomeInstituicao;

  private String CnpjInstituicao;

  private String EnderecoInstituicao;

  private String TelefoneInstituicao;

  private String Finalidade;

  private LocalDate DataConstituicao;

  private String EmailInstituicao;

  private String RedesSociaisIntituicao;

  private String ComprovanteCadastro;

  private String NomeResponsavel;

  private String CpfReponsavel;

  private String TelefoneResponsavel;

  private String EmailResponsavel;

  private String CargoReponsavel;

  private String SenhaAcesso;

  public Instituicao build() {

    return Instituicao.builder()
        .NomeInstituicao(NomeInstituicao)
        .CnpjInstituicao(CnpjInstituicao)
        .EnderecoInstituicao(EnderecoInstituicao)
        .TelefoneInstituicao(TelefoneInstituicao)
        .Finalidade(Finalidade)
        .DataConstituicao(DataConstituicao)
        .EmailInstituicao(EmailInstituicao)
        .RedesSociaisIntituicao(RedesSociaisIntituicao)
        .ComprovanteCadastro(ComprovanteCadastro)
        .NomeResponsavel(NomeResponsavel)
        .CpfReponsavel(CpfReponsavel)
        .TelefoneResponsavel(TelefoneResponsavel)
        .EmailResponsavel(EmailResponsavel)
        .CargoReponsavel(CargoReponsavel)
        .SenhaAcesso(SenhaAcesso)
        .build();
  }

}
