
public class Ebook {

	private String title;
	private String autor;
	private int numberOfPages;
	private int currentPage = 1;

	public Ebook(String title, String autor, int numberOfPages) {
		this.title = title;
		this.autor = autor;
		this.numberOfPages = numberOfPages;
	}

	public String getTitle() {
		return title;
	}

	public String getAutor() {
		return autor;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public boolean setCurrentPage(int page) {
		if (page > 0 && page <= numberOfPages) {
			currentPage = page;
			return true;
		}
		return false;
	}

	public void nextPage() {
		if (currentPage < numberOfPages) {
			currentPage++;
		}
	}

	public void backPage() {
		if (currentPage > 1) {
			currentPage--;
		}
	}

	public String toString() {
		return "Título: " + title + "Autor: " + autor + "Página atual: " + currentPage+"Total de páginas: "+numberOfPages;
	}
}
