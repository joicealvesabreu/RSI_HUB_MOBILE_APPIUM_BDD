#language: pt

Funcionalidade: Pesquisando um produto pela barra de pesquisa

Contexto:
	Dado que eu esteja na aplicacao
	
@pesquisaproduto1
  Cenario: buscando um produto 

 	Quando eu escrevar o nome do produto
  E eu clicar na pesquisar
  E clicar no produto
  Quando eu adicioanar no carinho 
  Entao serei direcionado a tela de login para cadastro

@pesquisaproduto2
  Cenario: buscando um produto que nao existe
  
  Quando eu escrevar o nome do produto que nao existe
  E eu clicar na pesquisar
  Entao tera a mensagem que nao existe o produto pesquisado
