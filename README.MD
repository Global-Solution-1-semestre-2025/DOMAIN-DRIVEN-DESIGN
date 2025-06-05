# Documentação do projeto


### Video Explicativo Youtube:
https://youtu.be/U38kOI2wpUQ



##  Descrição do problema abordado

As queimadas geram impactos ambientais e econômicos.

*   Impactos ambientais : Emissão de gases poluentes, ameaça na sobrevivência de animais, alteração no ciclo da água e mudanças climáticas.
*   Impactos econômicos : Prejuízos financeiros para agropecuaristas e agricultores. 

##  Visão geral da arquitetura da solução

### Explicação do código java
*   Pacote service : Possui classes que possuem regras de negócio como a de salvar e listar os dados
*   Pacote Controller : Possui classes responsáveis pela chamada das requisições POST e GET para as urls específicas.
*   Pacote Repository : Possui interfaces responsáveis pela persistência de dados no banco de dados.
*   Pacote Domain : Possui as classes entidades com seus respectivos atributos.

### Explicação da usuabilidade

* O usuário entra no aplicativo web e registra dados da queimada, impacto ambiental e impacto economico. 
  Após ele ter preenchido esses dados é formado um relatório com todas as informações preenchidas por esse usuário.
  Então é possível listar os dados preenchidos, mostrando todas as informações referentes a queimada.

## Instruções para execução

1. Download do projeto java.
2. Fazer o carregamento de todas as dependências do maven, que estão presentes no arquivo pom.xml
3. Fazer a conexão com o banco de dados :
    Abrir o arquivo application.properties e visualizar o usuário e senha do banco de dados oracle
4. Abri o oracle sql developer e fazer a conexão do banco de dados.
5. Utilizar o Postman ou Insomnia para teste de requisições, 
    * Para requisições POST.
      1.  Inserir o json abaixo para cadastro de queimada. Inserir a url http://localhost:8080/api/queimadas
        { "localizacao": "Mato Grosso",
         "latitude": -21.2506,
         "longitude": -50.4194,
         "dataOcorrencia": "2025-06-02T14:30:00",
         "areaAfetada": 100.5,
         "status": "ATIVO"
         }
      2. Inserir o json abaixo para cadastro de impacto ambiental. Inserir a url http://localhost:8080/api/impacto-ambiental
         {
         "emissoesGases": 200.0,
         "tipoGas": "metano",
         "indicePoluicao": 300.0
         }
      3. Inserir json baixo para cadastro de impacto economico. Inserir a url http://localhost:8080/api/impacto-economico
         {
         "prejuizoFinanceiro": 50000.50,
         "setor": "Agropecuária",
         "tipoImpacto": "Perda de rebanho bovino"
         }

   * Para requisições GET
    Utilizar as urls
     http://localhost:8080/api/queimadas para listar dados de queimada.
     http://localhost:8080/api/impacto-ambiental para listar dados de impacto ambiental.
     http://localhost:8080/api/impacto-economico para listar dados de impacto economico.

## Exemplos básicos para o uso da API

*   Vamos supor que José é um agropecuarista e possui uma propriedade rural com criação de rebanho bovino.
    José percebe que sua propriedade está pegando fogo e seu pasto está morrendo , além de extinguir todo seu rebanho bovino.
    Para José registrar toda essa situação, ele entra no aplicativo web que desenvolvemos  para cadastrar todos os dados referente ao acontecimento.
*  Primeiro ele registra os dados da queimada em si, que são : localizacao, latitude, longitude, dataOcorrencia, areaAfetada, status.
*  Depois ele registra os dados de impactos ecônomicos que ele teve : prejuizoFinanceiro, setor,tipoImpacto.
*  Por fim ele registra os dados de impactos ambientais que sua propriedade teve : indicePoluicao, tipoGas, emissoesGases.

Todos esses registros, lhe darão o resultado de um relatório pois será possível ele listar todos os dados que foram registrados. 
Com base nesse relatório, os dados registrados servirão como medidas preventivas sobre o que ele teria que fazer para não sofrer as consequências.

## Requisitos Funcionais 

### Módulo de Queimadas
1. **Registro de Queimadas**
    - Cadastrar nova ocorrência de queimada com localização, coordenadas geográficas e data
    - Registrar área afetada em metros quadrados/hectares
    - Definir status da queimada (ex: ativa, controlada, extinta)
    - Consultar todas as queimadas registradas

2. **Monitoramento de Localização**
    - Registrar latitude e longitude da queimada
    - Visualizar histórico de ocorrências por localização

### Módulo de Impactos Econômicos
1. **Gestão de Prejuízos Financeiros**
    - Registrar prejuízos financeiros por setor
    - Consultar todos os impactos econômicos registrados

2. **Análise Setorial**
    - Registrar impactos por setor econômico
    - Acompanhar prejuízos acumulados por setor

### Módulo de Impactos Ambientais
1. **Monitoramento de Emissões**
    - Registrar emissões de gases
    - Medir índices de poluição
    - Consultar todos os impactos ambientais registrados

### Requisitos Gerais
* **Gestão de Dados**
    - Persistência de dados em banco de dados relacional
    - Consultas e listagens de registros
    - CRUD completo para todas as entidades
    - Interface RESTful para acesso aos dados

### Observações Técnicas:
- O sistema utiliza Spring Boot com arquitetura em camadas (Controller, Service, Repository)
- Implementação de API RESTful com endpoints para cada funcionalidade
- Uso de JPA/Hibernate para persistência de dados
- Validações de dados nas entidades

### Video Youtube:
https://youtu.be/U38kOI2wpUQ


