package br.sceweb.teste;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC01CadastrarEmpresa {
	
	static EmpresaDAO empresaDAO;
	static Empresa empresa;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresaDAO = new EmpresaDAO();
		empresa = new Empresa();
		
		empresa.setCnpj("89424232000180");
		empresa.setNomeDaEmpresa("kjdshiufsahfdsa");
		empresa.setNomeFantasia("piranguinha");
		empresa.setEndereco("sdgsgds");
		empresa.setTelefone("kjfdhiuagdiusfd");
	}

	@Test
	public void CT01UC01FBCadastraComSucesso() {
		empresaDAO.exclui("89424232000180");
		assertEquals(1, empresaDAO.adiciona(empresa));
		empresaDAO.exclui("89424232000180");
	}
	
	@Test
	public void CT01UC01FA1CadastrarCnpjInvalido() throws Exception{
		assertEquals(false, empresa.isValido("00000000000000"));
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
}
