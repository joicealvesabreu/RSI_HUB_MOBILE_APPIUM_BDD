#language: pt

Funcionalidade: realizar cadastro de um usuario no app do advantage demo
  Como usuario preencher o formulario com informaçoes validas.

  @tag1
  Cenario: 
    Dado que estou na aplicacao
    Quando selecionar a opcao login
    E clicar em nova conta
    E eu preencher o formulario
    Dado que eu aceite os termos
    Quando eu clicar em registrar
    Entao minha conta estar logada

  @tag2
  Cenario: 
    Dado que estou na aplicacao
    Quando selecionar a opcao login
    E clicar em nova conta
    E preencher o formulario com dados de conta ja registrada
    Dado que eu aceite os termos
    Quando eu clicar em regristar
    Entao aparecerar uma mensagem que ususario ja tem conta
