## Descrição do desafio: criar uma aplicação Selenium com os seguintes casos de teste<br>

> Status do Projeto: Fase final :heavy_check_mark:<br>


##### Autor:<br>

- Fernando Damasio Alves <br>
---------------------------------------------------------------------------
### Caso de teste 1<br>
Desenvolver um projeto em selenium webdrive (java) e cucumber
<br>

#### Cenário 1:<br>
Cenario: Preencher os campos em Enter Vehicle Data
Cenario: Preencher os campos do formulário
   - Dado que eu estou no site "http://sampleapp.tricentis.com/101/app.php"
   - E clico na opcao Make
   - Entao seleciono a opcao Audi
   - E clico na opcao Model
   - Entao seleciono a opcao Scooter
   - E digito no campo Cylinder Capacity "100"
   - E digito no campo Engine Performance "150"
   - E digito no campo Date of Manufacture "01/01/2010"
   - E clico na opcao Number of Seats
   - Entao seleciono a opcao dois
   - E seleciono na campo Right Hand Drive a opcao Yes
   - E clico no campo Number of Seat
   - Entao seleciono a opcao um "1"
   - E clico no campo Fuel Type
   - Entao seleciono a opcao Petrol
   - E digito no campo Payload "500" 
   - E digito no campo Total Weight "550"  
   - E digito no campo List Price "1000"
   - E digito no campo License Plate Number "ABC1234"
   - E digito no campo Annual Mileage "100"
   - Entao clico em Insurant
   - E digito no campo First Name o nome "Fernando"
   - E digito  no campo Last Name o sobrenome "Damasio"
   - E digito no campo Date of Birth a data "05/30/1985"
   - E clico no campo Country
   - Entao seleciono a opcao Brazil
   - E digito no campo Zip Code "02730000"
   - E clico no campo Occupation
   - Entao seleciono a opcao Employee
   - E clico no campo Hobbies
   - Entao clico em Product    
   - E digito no campo Start Date "05/20/2022"
   - E seleciono no campo Insurance Sum "7.000.000,00"
   - E seleciono no campo Merit Rating "Bonus 1"
   - E seleciono no campo Damage Insurance "Full Coverage"
   - E seleciono no campo Optional Products a opcao Euro Protection
   - E seleciono no campo Cortesy Car "Yes"
   - Entao clico em Price
---------------------------------------------------------------------------      
### Tecnologias utilizadas:<br>

   :heavy_check_mark: Java
Linguagem de programacao para desenvolvimento da aplicacao<br>

:heavy_check_mark: Maven
Gerenciador de dependencias para o <b>Java</b><br>

:heavy_check_mark: <b>Cucumber</b><br>
Framework responsavel por traduzir uma linguagem humana em código Java

:heavy_check_mark: <b>Selenium</b><br>
Framework responsável por fazer a integração do código Java com a linguagem GutKing(Cucumber) abrindo o browser e fazendo o teste de comportamento<br>

---------------------------------------------------------------------------
### Pré-requisitos:<br>

- Instalar o Java:<br>
https://www.java.com/pt-BR/download/
- Instalar JDK:<br>
https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html

---------------------------------------------------------------------------
#### Configurando Selenium no seu computador:<br>
Fazendo download do Chrome Webdriver e colocar o arquivo descompactado da pasta driver na raiz do projeto<br>
>https://chromedriver.chromium.org/downloads<br>
##### Exemplo<br>

```bash
cd driver >https://chromedriver.storage.googleapsis.com/89.0.4389.23/chrome_1inux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip
cd ../driver<br>
```

#### Limpando e validando o Maven Windows:
```bash
mvnw.cmd clean<br>
```

#### Limpando e validando Maven Unix:
```bash
./mvnw clean
```

#### Executando teste no Unix:
```bash
./test.sh
```
#### Executando teste no Windows:
```bash
test.bat
```
---------------------------------------------------------------------------
## Estrutura de arquivos:
```
├───driver
├───src
│   ├───main
│   │   └───java
│   │       └───io
│   │           └───cucumber
│   │               └───fernando
│   └───test
│       ├───java
│       │   └───io
│       │       └───cucumber
│       │           └───fernando
│       └───resources
│           └───io
│               └───cucumber
│                   └───fernando
   
```