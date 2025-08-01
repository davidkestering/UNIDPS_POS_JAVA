import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {
	public static void main(String[] args) {
		List<Veiculo> lista = new ArrayList<>() {{
			add(new Veiculo("Corsa", "Cinza", 25000, 1998, 160));
			add(new Veiculo("Corolla", "Prata", 70000, 2020, 200));
			add(new Veiculo("Corolla", "Preto", 100000, 2025, 210));
			add(new Veiculo("X1", "Branco", 250000, 2023, 250));
			add(new Veiculo("GLA200", "Prata", 300000, 2025, 280));
		}};
		
		lista.stream().forEach(v -> {
			System.out.println(v);
		});
		
		//lista imutavel
		/*List<Veiculo> ordenada = lista.stream()
									  .sorted(Comparator.comparing(Veiculo::getMarca))
									  .toList();
		
		System.out.println(ordenada);*/
		
		//lista mutavel
		List<Veiculo> ordenada = lista.stream()
				  .sorted(Comparator.comparing(Veiculo::getMarca))
				  .collect(Collectors.toList());

		System.out.println(ordenada);
		
		List<Veiculo> corolas = lista.stream()
									 .filter(v-> v.getMarca().equalsIgnoreCase("corolla"))
									 .toList();
		
		System.out.println(corolas);
		
		double precoMedio = lista.stream().mapToDouble(Veiculo::getPreco).average().orElse(0);
		System.out.println("Preco medio = "+precoMedio);
		double precoMenor = lista.stream().mapToDouble(Veiculo::getPreco).min().orElse(0);
		System.out.println("Menor Preco = "+precoMenor);
		double precoMaior = lista.stream().mapToDouble(Veiculo::getPreco).max().orElse(0);
		System.out.println("Maior Preco = "+precoMaior);
		
		double precoMedioCorollas = lista.stream()
									    .filter(v->v.getMarca().equalsIgnoreCase("corolla"))
									    .mapToDouble(Veiculo::getPreco)
									    .average()
									    .orElse(0);
		System.out.println("Media dos Corollas = "+precoMedioCorollas);
		
		List<Veiculo> listaCorolla = lista.stream()
										  .filter(v-> v.getMarca().equalsIgnoreCase("corolla"))
										  .map(v->converterParaMaiusculo(v))
										  .toList();
		System.out.println(listaCorolla);
	}
	
	public static Veiculo converterParaMaiusculo(Veiculo v) {
		return new Veiculo(v.getMarca().toUpperCase(),
							v.getCor().toUpperCase(),
							v.getPreco(),
							v.getAno(),
							v.getVelMaxima());
	}
}
