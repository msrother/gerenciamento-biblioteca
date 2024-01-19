import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Biblioteca {
    private List<Livro> acervo;
    private Set<String> categorias;

    public Biblioteca() {
        this.acervo = new ArrayList<>();
        this.categorias = new HashSet<>();
    }

    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
        categorias.add(livro.getCategoria());
    }

    public void removerLivro(Livro livro) {
        acervo.remove(livro);
    }

    public void listarLivros() {
        System.out.println("Livros na Biblioteca:");
        for (Livro livro : acervo) {
            System.out.println(livro.exibirDetalhes());
            System.out.println("---------------");
        }
    }

    public void listarCategorias() {
        System.out.println("Categorias na Biblioteca:");
        for (String categoria : categorias) {
            System.out.println(categoria);
        }
        System.out.println("---------------");
    }

    public void buscarPorCategoria(String categoria) {
        System.out.println("Livros na Categoria '" + categoria + "':");
        for (Livro livro : acervo) {
            if (livro.getCategoria().equals(categoria)) {
                System.out.println(livro.exibirDetalhes());
                System.out.println("---------------");
            }
        }
    }
}
