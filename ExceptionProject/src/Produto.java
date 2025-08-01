
public class Produto {
	private int id;
	private String nome;
	private double preco;
	public int getId() {
		return id;
	}
	public void setId(int id) throws MyException {
		if (id <= 0) {
			throw new MyException("Id nao pode ser menor ou zero!");
		}
		
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws MyException {
		if (nome==null || nome.isEmpty()) {
			throw new MyException("Nome nao pode ser nulo ou falor");
		}
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", precol=" + preco + "]";
	}
	
	
	
}
