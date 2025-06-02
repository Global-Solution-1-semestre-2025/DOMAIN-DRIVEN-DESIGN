package br.com.registros.agro.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "impactos_ambientais")
@SequenceGenerator(name = "seq_impacto_ambiental", sequenceName = "seq_impacto_ambiental_id", allocationSize = 1)
public class ImpactoAmbiental {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_impacto_ambiental")
    private Long id;

    @Column(name = "emissoes_gases",  precision = 10)
    private Double emissoesGases;

    @Column(name = "tipo_gas", length = 255)
    private String tipoGas;

    @Column(name = "indice_poluicao", precision = 10)
    private Double indicePoluicao;

    // Getters
    public Long getId() {
        return id;
    }

    public Double getEmissoesGases() {
        return emissoesGases;
    }

    public String getTipoGas() {
        return tipoGas;
    }

    public Double getIndicePoluicao() {
        return indicePoluicao;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setEmissoesGases(Double emissoesGases) {
        this.emissoesGases = emissoesGases;
    }

    public void setTipoGas(String tipoGas) {
        this.tipoGas = tipoGas;
    }

    public void setIndicePoluicao(Double indicePoluicao) {
        this.indicePoluicao = indicePoluicao;
    }
}
