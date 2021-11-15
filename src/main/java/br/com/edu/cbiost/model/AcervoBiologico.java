package br.com.edu.cbiost.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AcervoBiologico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO")
    private Long codigo;

    @Column(name = "TOMBO")
    @Size(min = 1, max = 10)
    private String tombo;

    @Column(name = "FILO")
    private String filo;

    @Column(name = "SUB_FILO")
    private String subFilo;

    @Column(name = "CLASSE")
    private String classe;

    @Column(name = "ORDEM")
    private String ordem;

    @Column(name = "FAMILIA")
    private String familia;

    @Column(name = "IDENT_TAX_OUTRO")
    private String identTaxOutro;

    @Column(name = "NUM_ESPECIME")
    private String numEspecime;

    @Column(name = "DTA_COLETA")
    @Temporal(TemporalType.DATE)
    private Date dtaColeta;

    @Column(name = "NOME_COLETOR")
    private String nomeColetor;

    @Column(name = "LOCALIDADE")
    private String localidade;

    @Column(name = "TIPO")
    private String tipo;

    @Column(name = "CONDICAO")
    private String condicao;

    @Column(name = "VIA_FIXACAO")
    private String viaFixacao;

    @Column(name = "ARMARIO")
    private String armario;

    @Column(name = "GAVETA")
    private String gaveta;

    @Column(name = "LOCAL_ARM_OUTRO")
    private String localArmOutro;

    @Column(name = "EMP_NOME")
    private String empNome;

    @Column(name = "EMP_DTA")
    @Temporal(TemporalType.DATE)
    private Date empDta;

    @Column(name = "TOMBO_DTA")
    @Temporal(TemporalType.DATE)
    private Date tomboDta;

    @Column(name = "TOMBO_RESP")
    private String tomboResp;

    @Override
    public String toString() {
        return ReflectionToStringBuilder
                .toString(this, ToStringStyle.JSON_STYLE, true, true);
    }
}
