#language: pt

Funcionalidade: realizar cadastro de um usuario no app do advantage demo
  Como usuario preencher o formulario com informaçoes validas.

 Contexto: 
    Dado que eu estiver na app
  @tag1
  Cenario: 
    
    Quando selecionar a opcao login
    E clicar em nova conta
    E eu preencher o formulario
    Quando eu clicar em registrar
    Entao minha conta estar logada

  @tag2
  Cenario: 

    Quando selecionar a opcao login
    E clicar em nova conta
    E eu preencher o formulario
    Quando eu clicar em registrar
    Entao aparecerar que a conta ja existe

