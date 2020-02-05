#language: pt

Funcionalidade: Pesquisando um produto pela barra de pesquisa

@pesquisaproduto1
  Cenario:
  Dado que eu esteja na aplicacao
 	Quando  eu escrevar o nome do produto
  E eu clicar na pesquisar
  E clicar no produto
  Quando eu adicioanar no carinho 
  Entao serei direcionado a tela de login para cadastro

@pesquisaproduto2
  Cenario:
  Dado que eu esteja na aplicacao
  Quando eu escrever o nome do produto  que nao existe
  E clicar na barra de pesquisa
  Entao tera a mensagem que nao existe o produto pesquisado
