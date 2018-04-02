package com.s2it.prova.numerosinteiros.teste;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.s2it.prova.numerosinteiros.NumerosInteiros;

public class NumerosInteirosTest {

	NumerosInteiros numerosInteiros = new NumerosInteiros();

	@Test
	public void retornaCorretamenteMesmoTamanho() {
		Integer retorno = numerosInteiros.retornaC(89, 34);
		assertTrue("Não retornou 8394", retorno == 8394);
	}

	@Test
	public void retornaCorretamenteAMaior() {
		Integer retorno = numerosInteiros.retornaC(8899, 45);
		assertTrue("Não retornou 848599", retorno == 848599);
	}

	@Test
	public void retornaCorretamenteBMaior() {
		Integer retorno = numerosInteiros.retornaC(45, 8899);
		assertTrue("Não retornou 485899", retorno == 485899);
	}

	@Test
	public void retornaNegativo() {
		Integer retorno = numerosInteiros.retornaC(10000, 10000);
		assertTrue("Não retornou negativo por ser maior que 1000000", retorno == -1);
	}

	@Test
	public void retornaANull() {
		Integer retorno = numerosInteiros.retornaC(null, 10000);
		assertTrue("Não retornou mesmo número de B", retorno == 10000);
	}

	@Test
	public void retornaBNull() {
		Integer retorno = numerosInteiros.retornaC(10000, null);
		assertTrue("Não retornou mesmo número de A", retorno == 10000);
	}

	@Test
	public void retornaAMaiorQue1000000() {
		Integer retorno = numerosInteiros.retornaC(1000001, null);
		assertTrue("Maior que 1000000 e não retornou negativo", retorno == -1);
	}

	@Test
	public void retornaBMaiorQue1000000() {
		Integer retorno = numerosInteiros.retornaC(null, 1000001);
		assertTrue("Maior que 1000000 e não retornou negativo", retorno == -1);
	}

	@Test
	public void retornaANegativo() {
		Integer retorno = numerosInteiros.retornaC(-1, 100);
		assertTrue("Não retornou valor de B", retorno == 100);
	}

	@Test
	public void retornaBNegativo() {
		Integer retorno = numerosInteiros.retornaC(100, -1);
		assertTrue("Não retornou valor de A", retorno == 100);
	}
}