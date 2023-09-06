package br.com.portoseguro.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.portoseguro.DAO.BikeDAO;
import br.com.portoseguro.beans.AcessorioBike;
import br.com.portoseguro.beans.Bike;
import br.com.portoseguro.beans.Endereco;
import br.com.portoseguro.beans.PessoaFisica;
import br.com.portoseguro.beans.PessoaJuridica;

public class TesteCycleX {

// =============== MÉTODOS STATIC  ===============
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}

	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	    
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
// ------------ SAUDAÇÃO/EXPLICAÇÃO PARA O USUÁRIO
		String Saudacao = ("                                   Olá, seja bem-vindo(a) ao projeto Cycle-X!" + 
						   "\nAqui você poderá realizar suas vistorias de forma mais eficiente e sem gastos a mais." +
						   "\n                                                              Vamos lá?");
		JOptionPane.showMessageDialog(null, Saudacao);;
		
		
// ================	SCANNER (para a escolha de cadastro do usuário de acordo com a opção escolhida)  ================
				Scanner teclado = new Scanner(System.in);
				int escolha = 0;
				
				do {
				System.out.println("==============================" +
						   "\nComo deseja se cadastrar?" +
						   "\n------------------------------" +
						   "\n1 - PESSOA FÍSCA (PF)" +
						   "\n2 - PESSOA JURÍDICA (PJ)" +
						   "\n==============================" );
				escolha = teclado.nextInt();
				
	            if (escolha != 1 && escolha != 2) {
	                System.out.println("Opção inválida! Digite 1 para PF ou 2 para PJ.");
	            }
				} while (escolha != 1 && escolha != 2);		
				
				
// ================	MATCHCASE/SWITCH (o usuário vai preencher os dados de acordo com sua escolha de cadastro)  ================
		switch(escolha) {
		case 1:
			JOptionPane.showMessageDialog(null, "Ótimo, vamos começar!");
			
//---------- Se caso o cliente possuir menos de 18 anos, não podera contratar o seguro.
			int idade = inteiro("Idade do cliente: ");
			if (idade < 18) {
				JOptionPane.showMessageDialog(null, "Apenas pessoas maiores de 18 anos podem contratar o seguro!");
				return;
			} else {
			PessoaFisica objPessoaFisica = new PessoaFisica(texto("Nome do cliente: "),
					texto("Email do cliente: "),
					texto("Telefone do cliente: "),
					idade, // idade já coletada
					decimal("Renda do cliente: "),
					texto("CPF do cliente: "),
					texto("RG do cliente: "));
			System.out.println("=========== DADOS PESSOA FÍSICA ===========" + 
					"\nNome do cliente: " + objPessoaFisica.getNome() +
					"\nEmail do cliente: " + objPessoaFisica.getEmail() + 
			        "\nTelefone do cliente: " + objPessoaFisica.getTelefone() +
					"\nIdade do cliente: " + objPessoaFisica.getIdade() +
					"\nRenda do cliente: " + objPessoaFisica.getRenda() + 
					"\nCPF do cliente: " + objPessoaFisica.getCpf() +
					"\nRG do cliente: " + objPessoaFisica.getRg() +
					"\nCadastrado como: " + objPessoaFisica.identificacao());
			}
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Ótimo, vamos começar!");
			PessoaJuridica objPessoaJuridica = new PessoaJuridica(texto("Nome da empresa: "),
					texto("Email da empresa: "),
					texto("Telefone da empresa: "),
					inteiro("Idade da empresa: "),
					decimal("Renda da empresa: "),
					texto("Razão social da empresa: "),
					texto("CNPJ da empresa: "));
			System.out.println("=========== DADOS PESSOA JURÍDICA ===========" + 
			"\nNome da empresa: " + objPessoaJuridica.getNome() + 
			"\nEmail da empresa: " + objPessoaJuridica.getEmail() +
			"\nTelefone da empresa: " + objPessoaJuridica.getTelefone() + 
			"\nIdade da empresa: " + objPessoaJuridica.getIdade() +
			"\nRenda da empresa: " + objPessoaJuridica.getRenda() +
			"\nRazão social da empresa: " + objPessoaJuridica.getRazaoSocial() +
			"\nCNPJ da empresa: " + objPessoaJuridica.getCnpj() +
			"\nCadastrado como: " + objPessoaJuridica.identificacao());
			break;
		default: 
			System.out.println("Ops, opção inválida!");
			break;
}	
		
// ======================= IF (para fazer com que o endereço não apareça caso o usuário digite uma opção inválida) ========================
		if(escolha == 1){
			Endereco objEndereco = new Endereco(texto("Logradouro: "),
	                inteiro("Número: "),
	                texto("CEP: "),
	                texto("Bairro: "),
	                texto("Município: "),
	                texto("Estado: "),
	                texto("Nacionalidade: "));
			System.out.println("============== ENDEREÇO ==============" +
			"\nLogradouro: " + objEndereco.getLogradouro() +
            "\nNúmero: " + objEndereco.getNumero() +
            "\nCEP: " + objEndereco.getCep() + 
            "\nBairro: " + objEndereco.getBairro() +
            "\nMunicípio: " + objEndereco.getMunicipio() +
            "\nEstado: " + objEndereco.getEstado() +
            "\nNacionalidade: " + objEndereco.getNacionalidade());
		}
		if(escolha == 2){
			Endereco objEndereco = new Endereco(texto("Logradouro: "),
	                inteiro("Número: "),
	                texto("CEP: "),
	                texto("Bairro: "),
	                texto("Município: "),
	                texto("Estado: "),
	                texto("Nacionalidade: "));
			System.out.println("============== ENDEREÇO ==============" +
			"\nLogradouro: " + objEndereco.getLogradouro() +
            "\nNúmero: " + objEndereco.getNumero() +
            "\nCEP: " + objEndereco.getCep() + 
            "\nBairro: " + objEndereco.getBairro() +	
            "\nMunicípio: " + objEndereco.getMunicipio() +
            "\nEstado: " + objEndereco.getEstado() +
            "\nNacionalidade: " + objEndereco.getNacionalidade());
		}
		
		
// =============== ENTRADA E SAÍDA DE DADOS DA BIKE ===================
		BikeDAO dao = new BikeDAO();
// ---------- Caso o preço da bike seja menor que R$2000, o código para.
		double precoBike = decimal("Preço da bicicleta: ");
		if (precoBike < 2000)  {
			JOptionPane.showMessageDialog(null, "Desculpe, o preço da bicicleta é menor que R$2000. Não é possível continuar.");
			return;
		}
		Bike objBike = new Bike(precoBike,
				texto("Marca da bicicleta: "),
                inteiro("Ano da bicicleta: "),
                texto("Tipo de bicicleta: "));
		System.out.println("========== BIKE ==========" +
				"\nPreço: " + objBike.getPrecoBike() +
				"\nMarca: " + objBike.getMarca() +
				"\nAno: " + objBike.getAno() +
				"\nTipo: " + objBike.getTipo());
		
		
//---------- O sistema pergunta ao usuário se a bike possui acessórios ----------
	int resposta = JOptionPane.showConfirmDialog(null, "Sua bike possui acessório(s)?", "ACESSÓRIOS DA BIKE",
			JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	
		if (resposta == JOptionPane.YES_OPTION) {
		

// --------- Lista para o cliente adicionar acessórios da bike caso haja
		List <AcessorioBike> listaAcessorios = new ArrayList <AcessorioBike>();
		AcessorioBike objAcessorioBike;
		int contador = 0;
		//Entrada
		do {
			objAcessorioBike = new AcessorioBike();
			objAcessorioBike.setNome(texto("Nome: "));
			objAcessorioBike.setMarca(texto("Marca: "));
			objAcessorioBike.setPreco(decimal("Preço: "));
			listaAcessorios.add(objAcessorioBike);
				
	    // Escolhemos entre ecerrar ou adicionar mais um acessório
		}while(JOptionPane.showConfirmDialog(null, "Adicionar outro acessório?", "ACESSÓRIOS DA BIKE", 
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0);
		for (AcessorioBike acessorioBike: listaAcessorios) {
			contador = contador + 1;
			System.out.println("------- Acessório " + contador + " -------" +
								"\nNome: " + acessorioBike.getNome() +
								"\nMarca: " + acessorioBike.getMarca() +
								"\nPreço: " + acessorioBike.getPreco());
	} 
		}else {
	System.out.println("Acessórios: Não há acessórios na bike.");
	
	}
	
	System.out.println(dao.inserir(objBike));
	

}}
