package com.s2it.prova.numerosinteiros;

import java.util.Arrays;
import java.util.Iterator;

public class NumerosInteiros {

	public Integer retornaC(final Integer a, final Integer b) {
		final StringBuilder resultado = new StringBuilder();
		Integer resultadoInteiro = a;

		if(a == null || a < 0) {
			return validaRetorno(b);
		}

		if(b == null || b < 0) {
			return validaRetorno(a);
		}

		Iterator<String> primeiroIterator = Arrays.stream(Integer.toString(Math.abs(a)).split("")).iterator();
		Iterator<String> segundoIterator = Arrays.stream(Integer.toString(Math.abs(b)).split("")).iterator();

		while(primeiroIterator.hasNext() || segundoIterator.hasNext()) {
			if(primeiroIterator.hasNext()) {
				resultado.append(primeiroIterator.next());
			}

			if(segundoIterator.hasNext()) {
				resultado.append(segundoIterator.next());
			}

			resultadoInteiro = Integer.valueOf(resultado.toString());

			if(resultadoInteiro > 1000000) {
				return -1;
			}
		}

		return resultadoInteiro;
	}

	private Integer validaRetorno(Integer retorno) {
		if(retorno > 1000000) {
			return -1;
		}
		
		return retorno;
	}
}