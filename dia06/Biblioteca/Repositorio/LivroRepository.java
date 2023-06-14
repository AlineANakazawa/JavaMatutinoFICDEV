package dia06.Biblioteca.Repositorio;

import dia06.Biblioteca.Modelo.Livro;
import java.util.ArrayList;
import java.util.List;

public class LivroRepository {
    private List<Livro> livros = new ArrayList<>();
    private int proximoId = 1;
    
    public void cadastrar(Livro livro) {
        livro.setId(proximoId++);
        livros.add(livro);
    }
    
    public List<Livro> buscarTodos() {
        return livros;
    }
    
    public Livro buscarPorId(int id) {
        for(Livro livro : livros) {
            if(livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }
}
