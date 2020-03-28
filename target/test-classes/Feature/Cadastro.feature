#language: pt

Funcionalidade: realizar cadastro de um usuario no app do advantage demo

Contexto: Abrir o site advance para cadastrar o (usuario)
	Dado  que eu estiver no site Advance
	Quando eu clicar em cadastrar 
	E preencher o formulario
	
@Cadastro1
	Cenario: cadastrando o usuario com sucesso
	Quando aceitar os termos 
	E clicar em regristar
	Entao  aparecer o usuario logado e seu nome de acesso que foi feito o cadastro
	
@Cadastro2
Cenario: Nao pode deixar fazer o cadastro 
	Quando aceitar os termos 
	E clicar em regristar
	Entao  aparecerar mensagem de que  que usuario existe
	
