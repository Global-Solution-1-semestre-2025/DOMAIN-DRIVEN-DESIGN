package br.com.registros.agro.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "queimada")
@SequenceGenerator(name = "seq_queimada", sequenceName = "seq_queimada_id", allocationSize = 1)
public class Queimada {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_queimada")
    private Long id;

    @Column(name = "localizacao", length = 255)
    private String localizacao;

    @Column(name = "latitude", precision = 10 )
    private Double latitude;

    @Column(name = "longitude", precision = 10 )
    private Double longitude;

    @Column(name = "data_ocorrencia")
    private LocalDateTime dataOcorrencia;

    @Column(name = "area_afetada", precision = 10 )
    private Double areaAfetada;

    @Column(name = "status", length = 50)
    private String status;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public LocalDateTime getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(LocalDateTime dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public Double getAreaAfetada() {
        return areaAfetada;
    }

    public void setAreaAfetada(Double areaAfetada) {
        this.areaAfetada = areaAfetada;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

