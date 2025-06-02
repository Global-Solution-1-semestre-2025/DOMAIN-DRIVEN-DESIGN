-- Criação da sequência para o ID
CREATE SEQUENCE seq_queimada_id
    START WITH 1
    INCREMENT BY 1
    NOCACHE
    NOCYCLE;



-- Criação da tabela
CREATE TABLE queimada (
    id NUMBER DEFAULT seq_queimada_id.NEXTVAL PRIMARY KEY,
    localizacao VARCHAR2(255),
    latitude NUMBER(10,6),
    longitude NUMBER(10,6),
    data_ocorrencia TIMESTAMP,
    area_afetada NUMBER(10,2),
    status VARCHAR2(50)
);

SELECT * FROM queimada;

// TABELA IMPACTOS_AMBIENTAIS

-- Criação da sequência para o ID
CREATE SEQUENCE seq_impacto_ambiental_id
    START WITH 1
    INCREMENT BY 1
    NOCACHE
    NOCYCLE;

-- Criação da tabela
CREATE TABLE impactos_ambientais (
    id NUMBER DEFAULT seq_impacto_ambiental_id.NEXTVAL PRIMARY KEY,
    tipo_gas VARCHAR2(255),
    emissoes_gases NUMBER(10,6),
    indice_poluicao NUMBER(10,6)
);

SELECT * FROM impactos_ambientais;

// TABELA IMPACTOS_ECONOMICOS

-- Criação da sequence
CREATE SEQUENCE seq_impacto_economico_id
    START WITH 1
    INCREMENT BY 1
    MINVALUE 1
    NOMAXVALUE
    NOCYCLE
    CACHE 20;

-- Criação da tabela
CREATE TABLE impactos_economicos (
    id NUMBER(19) NOT NULL,
    prejuizo_financeiro NUMBER(19,2),
    setor VARCHAR2(255),
    tipo_impacto VARCHAR2(255),
    CONSTRAINT pk_impactos_economicos PRIMARY KEY (id)
);

SELECT * FROM impactos_economicos;



    