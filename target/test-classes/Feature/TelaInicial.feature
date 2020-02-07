#language: pt
Funcionalidade: Buscar um produto por tela inicial do app

  Contexto: 
    Dado que eu estiver na aplicacao

  @telainicial1
  Cenario: clicando no produto escolhido e sendo direcionado a tela de login
    Quando eu escolher o produto
    E Adicionar no carinho
    Entao serei direcionado a tela de login

  @telainicial2
  Cenario: mensagem de erro que nao foi encontrado o produto
 		Quando eu escolher o produto
    Entao serei direcionado a tela errada
