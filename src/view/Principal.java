package view;

import br.edu.fateczl.arvore.inteiro.ArvoreInt;

public class Principal {

	public static void main(String[] args) {
		ArvoreInt a = new ArvoreInt();
		int [] vetor = {7, 8, 3, 4, 2, 1, 6, 5};
		for (int i: vetor) {
			a.insert(i);
		}
		try {
			a.remove(7);
			a.remove(6);
			a.prefixSearch();
			a.infixSearch();
			a.postfixSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
