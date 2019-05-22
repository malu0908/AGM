package AlgKruskal;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.TimeUnit;

public class DesenhaGrafo extends JPanel {

	public void paintComponent(Graphics grafo) {
		super.paintComponent(grafo);
		this.setBackground(Color.black);

		int escala = 6;
		int i = 0;
		String x = Integer.toString(Vetor.getVetor()[i].vertice1);
		String x1 = Integer.toString(Vetor.getVetor()[i].vertice2);

		// termina de printar os vertices
		for (i = 0; i < Vetor.getVetor().length; i++) {
			grafo.setColor(Color.white);
			grafo.drawLine((int) (Matrizes.getMatriz()[Vetor.getVetor()[i].vertice1][0] * escala),
					(int) (Matrizes.getMatriz()[Vetor.getVetor()[i].vertice1][1] * escala),
					(int) (Matrizes.getMatriz()[Vetor.getVetor()[i].vertice2][0] * escala),
					(int) (Matrizes.getMatriz()[Vetor.getVetor()[i].vertice2][1] * escala));

			grafo.setColor(Color.red);
			grafo.fillOval((int) (Matrizes.getMatriz()[Vetor.getVetor()[i].vertice1][0] * escala - 5),
					(int) (Matrizes.getMatriz()[Vetor.getVetor()[i].vertice1][1] * escala - 5), 10, 10);
			grafo.setColor(Color.white);
			x = Integer.toString(Vetor.getVetor()[i].vertice1);
			grafo.drawString(x, (int) (Matrizes.getMatriz()[Vetor.getVetor()[i].vertice1][0] * escala - 5),
					(int) (Matrizes.getMatriz()[Vetor.getVetor()[i].vertice1][1] * escala - 5));

			grafo.setColor(Color.red);
			grafo.fillOval((int) (Matrizes.getMatriz()[Vetor.getVetor()[i].vertice2][0] * escala - 5),
					(int) (Matrizes.getMatriz()[Vetor.getVetor()[i].vertice2][1] * escala - 5), 10, 10);
			x1 = Integer.toString(Vetor.getVetor()[i].vertice2);
			grafo.setColor(Color.white);
			grafo.drawString(x1, (int) (Matrizes.getMatriz()[Vetor.getVetor()[i].vertice2][0] * escala - 5),
					(int) (Matrizes.getMatriz()[Vetor.getVetor()[i].vertice2][1] * escala - 5));
			System.out.println(i);

		}

	}

//	public void update(Observable o, Object arg) {
//		Vetor.setVetor((Aresta[])arg);
//		this.repaint();
//		try {Thread.sleep(100);} catch (InterruptedException ex) {}
//	}

}