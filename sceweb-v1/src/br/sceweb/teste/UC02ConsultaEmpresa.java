package br.sceweb.teste;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC02ConsultaEmpresa {

	 static EmpresaDAO empresaDAO;
	static Empresa empresa;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	empresa.setNomeDaEmpresa("empresa x");
	empresa.setCnpj("89525232000186");
	empresa.setNomeFantasia("empresa x");
	empresa.setEndereco("rua tauqari");
	empresa.setTelefone("11 3745-2158" );
	
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	public void CT01UC02ConsultarEmpresa_com_sucesso (){
		empresaDAO.adiciona(empresa);
		assertTrue(empresa.equals(empresaDAO.consultaEmpresas("89525232000186")));
		empresaDAO.exclui("89525232000186");
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		empresaDAO.exclui("89525232000186");
	}
}
