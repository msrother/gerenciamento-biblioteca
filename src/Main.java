public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Aprendendo a programar", "Steews Hesstedr", "Programação");
        Livro livro2 = new Livro("História do PC", "Walllis Papper", "Computação");
        Livro livro3 = new Livro("João e o pé de feijão", "John Tales", "História");

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Listar os livros
        biblioteca.listarLivros();

        // Listar todas as categorias
        biblioteca.listarCategorias();

        // Buscar por uma categoria específica
        biblioteca.buscarPorCategoria("Computação");
    }


}
