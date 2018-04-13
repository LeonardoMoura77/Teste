package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.dadosDeTeste.obtemLivro;
import br.emprestimo.modelo.Livro;
import br.emprestimo.modelo.Usuario;
import br.emprestimo.servico.ServicoEmprestimo;

public class UC06CadastrarLivro {

	public static Livro livro;
	public static obtemLivro obtemLivro;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		livro = obtemLivro.comDadosValidos();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void CT01UC06CadastrarLivro_com_isbn_invalido_branco() {
		try {
			livro.setIsbn("");
			fail("Deveria lan�ar uma exce��o.");
		} catch (RuntimeException e) {
			assertEquals("ISBN inv�lido.", e.getMessage());
		}
	}

	@Test
	public void CT02UC06CadastrarLivro_com_isbn_invalido_nulo() {
		try {
			livro.setIsbn(null);
			fail("Deveria lan�ar uma exce��o.");
		} catch (RuntimeException e) {
			assertEquals("ISBN inv�lido.", e.getMessage());
		}
	}

	@Test
	public void CT03UC06CadastrarLivro_com_isbn_valido() {
		assertEquals("121212", livro.getIsbn());
	}

	@Test
	public void CT04UC06CadastrarLivro_com_titulo_invalido_branco() {
		try {
			livro.setTitulo("");
			fail("Deveria lan�ar uma exce��o.");
		} catch (RuntimeException e) {
			assertEquals("T�tulo inv�lido.", e.getMessage());
		}
	}

	@Test
	public void CT05UC06CadastrarLivro_com_titulo_invalido_nulo() {
		try {
			livro.setTitulo(null);
			fail("Deveria lan�ar uma exce��o.");
		} catch (RuntimeException e) {
			assertEquals("T�tulo inv�lido.", e.getMessage());
		}
	}

	@Test
	public void CT06UC06CadastrarLivro_com_titulo_valido() {
		assertEquals("Engenharia de Software", livro.getTitulo());
	}

	@Test
	public void CT07UC06CadastrarLivro_com_autor_invalido_branco() {
		try {
			livro.setAutor("");
			fail("Deveria lan�ar uma exce��o.");
		} catch (RuntimeException e) {
			assertEquals("Autor inv�lido.", e.getMessage());
		}
	}

	@Test
	public void CT08UC06CadastrarLivro_com_autor_invalido_nulo() {
		try {
			livro.setAutor(null);
			fail("Deveria lan�ar uma exce��o.");
		} catch (RuntimeException e) {
			assertEquals("Autor inv�lido.", e.getMessage());
		}
	}

	@Test
	public void CT09UC06CadastrarLivro_com_autor_valido() {
		assertEquals("Pressman", livro.getAutor());
	}

}
