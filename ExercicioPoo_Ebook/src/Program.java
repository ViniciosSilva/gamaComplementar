
public class Program {

	public static void main(String[] args) {

		Ebook livro = new Ebook("O Sr. Dos An�is", "Tolkien", 718);
		if (livro.setCurrentPage(98)) {
			System.out.println("Pagina atual: " + livro.getCurrentPage());
		} else {
			System.out.println("P�gina inv�lida");
		}

		System.out.println(livro);

		livro.backPage();
		livro.backPage();
		System.out.println(livro);
		
		livro.nextPage();
		System.out.println(livro);
	}

}
