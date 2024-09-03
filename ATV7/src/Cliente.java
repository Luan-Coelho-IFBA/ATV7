import java.util.ArrayList;
import java.util.Collections;

public class Cliente {
	public static void main(String[] args) {
		Conta c1 = new Conta(2, "Luan", 1000.00, 200.00);
		Conta c2 = new Conta(1, "Gabriel", 5000.00, 1200.00);
		Conta c3 = new Conta(3, "Breno", 1000.00, 40.00);
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		// Adicionando contas à lista
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		
		// Ordenando por números
		
		Collections.sort(contas, new NumeroComparator());
		
		for (Conta conta : contas) {
			conta.mostrarDetalhes();
		}
		
		// Ordenando por nomes
		
		Collections.sort(contas, new NomeComparator());
		
		for (Conta conta : contas) {
			conta.mostrarDetalhes();
		}
	}
}
