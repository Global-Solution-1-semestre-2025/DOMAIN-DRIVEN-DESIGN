
package br.com.registros.agro.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "impactos_economicos")
@SequenceGenerator(name = "seq_impacto_economico", sequenceName = "seq_impacto_economico_id", allocationSize = 1)
public class ImpactoEconomico {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_impacto_economico")
    private Long id;

    @Column(name = "prejuizo_financeiro",  precision = 10)
    private BigDecimal prejuizoFinanceiro;

    @Column(name = "setor",   length = 255)
    private String setor;

    @Column(name = "tipo_impacto",   length = 255)
    private String tipoImpacto;

    // Getters
    public Long getId() {
        return id;
    }

    public BigDecimal getPrejuizoFinanceiro() {
        return prejuizoFinanceiro;
    }

    public String getSetor() {
        return setor;
    }

    public String getTipoImpacto() {
        return tipoImpacto;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setPrejuizoFinanceiro(BigDecimal prejuizoFinanceiro) {
        this.prejuizoFinanceiro = prejuizoFinanceiro;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setTipoImpacto(String tipoImpacto) {
        this.tipoImpacto = tipoImpacto;
    }
}