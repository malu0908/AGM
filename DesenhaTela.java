package AlgKruskal;

import javax.swing.JFrame;

public class DesenhaTela extends JFrame {
	int tamanho = 58;
	private int[] seqCidade = new int[tamanho];
	private double[][] matriz = new double[tamanho][2];
	private DesenhaGrafo grafo;
	
	public DesenhaTela() {
		this.setSize(750, 750);
		this.setTitle("Árvore Geradora Mínima");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.grafo = new DesenhaGrafo();
		this.add(grafo);
	}

	public DesenhaGrafo getDesenhaGrafo() {
		return this.grafo;
	}
}
