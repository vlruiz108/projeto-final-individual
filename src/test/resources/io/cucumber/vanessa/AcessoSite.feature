#language: pt
Funcionalidade: Criar um projeto em selenium webdrive (java) e cucumber usando Page objects (precisamos executar o script através da feature)

  Cenario: Ter um passo a passo para o teste automatico (Coloca algum verificador do objeto antes de fazer as acoes):
    Dado que acesso o site "http://sampleapp.tricentis.com/101/app.php"
    E preencho o formulario, aba "Enter Vehicle Data"
      | Make                    | Audi       |           |
      | Model                   | Scooter    |           |
      | Cylinder Capacity [ccm] | São Paulo  |           |
      | Performance [kW]        |        100 |           |
      | Date of Manufacture     | 03/31/2021 |           |
      | Right Hand Drive        |            | Yes       |
      | Number of Seats         |            |         1 |
      | Fuel Type               |            | Petrol    |
      | Payload [kg]            |            |       100 |
      | Total Weight [kg]       |            |      1000 |
      | List Price [$]          |            |    15.000 |
      | License Plate Number    |            | 124360456 |
      | Annual Mileage [mi]     |            |    40.000 |
    Entao clico no botao Next

  Cenario: Acessar a aba Insurant Data e preencher o formulario
    Dado que preencho o formulario, aba Insurant Data
      | First Name    | Maria     |            |
      | Last Name     | Silva     |            |
      | Date of Birth | São Paulo | 01/01/1980 |
      | Country       | Brazil    |            |
      | Zip Code      | 03080-000 |            |
      | Occupation    |           | Empregada  |
      | Hobbies       | Correr    |            |
    Entao clico botao Next

  Cenario: Acessar o formulario do produto
    Dado que eu estou na aba Product Data do formulario
    E preencho os campos com os valores do produto
      | campos           | valores         |
      | startdate        | 10/04/2021      |
      | insurancesum     |    5.000.000,00 |
      | meritrating      | Bonus 1         |
      | damageinsurance  | No Coverage     |
      | optionalproducts | Euro Protection |
      | courtesycar      | No              |
    Entao eu clico no botao PriceOption

  Cenario: Acessar o formulario de preco
    Dado eu estou na aba "Select Price Option" do formulario
    E clico no botao Select Option
    Entao eu clico em "Send Quote"

  Cenario: Acessar o formulario de envio de dados
    Dado que preencho os campos com os valores de quote
      | campos          | valores         |
      | email           | teste@teste.com |
      | phone           |        12345678 |
      | username        | teste           |
      | password        | testePassword#1 |
      | confirmpassword | testePassword#1 |
      | comments        | teste           |
    Entao clico no botao send de quote
   
