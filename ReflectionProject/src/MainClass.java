
public class MainClass {
	public static void main(String[] args) throws Exception {
		Produto p = new Produto(1,"Computador",1000.0);
		ClassExplorer.exploreMetadata(p);
	}
}
