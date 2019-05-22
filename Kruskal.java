package AlgKruskal;

import java.io.IOException;
import java.util.Arrays;

public class Kruskal {
	Aresta[] arestas = new Aresta[58 * 57];
	UnionFind conjuntos = new UnionFind();
	
	public Kruskal() {
		// gera os conjuntos iniciais composto por conjuntos unitarios
		conjuntos.criaEstrutura();

		// cria uma vetor com as arestas em ordem crescente
		int w = 0;
		for (int i = 0; i < 58; i++) {
			for (int j = 0; j < 58; j++) {
				if (i != j) {
					arestas[w] = new Aresta(i, j, Matrizes.getMatrizAdj()[i][j]);
					w++;
				}
			}
		}

		Arrays.sort(arestas);
	}

	public void executa() throws IOException {
		Aresta resultado[] = new Aresta[57];
		int w = 0;
		for(int i = 0; i < arestas.length; i++) {
			if(!(conjuntos.teste(arestas[i].vertice1, arestas[i].vertice2))) {
				conjuntos.juntar(arestas[i].vertice1, arestas[i].vertice2);
				resultado[w] = arestas[i];
				w++;
			}
		}
		
		Vetor.setVetor(resultado);
		
//		for(int i = 0; i < resultado.length; i++) {
//			System.out.print(i+1 + " " + "(" + resultado[i].vertice1 + "," + resultado[i].vertice2 + ")" + " " +resultado[i].peso);
//			System.out.println();
//		}
	}
}
