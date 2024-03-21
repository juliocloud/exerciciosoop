public class Saga {
    private int nota;
    private Livro[] livros = new Livro[10];
    public void listarLivros(){
        for (int i = 0; i < this.livros.length; i++) {
            if(this.livros[i] != null){
                System.out.println(this.livros[i].getTitulo());
            }
        }
    }

    public void adicionarLivro(Livro livro){
        for (int i = 0; i < this.livros.length; i++) {
            if(this.livros[i] == null){
                this.livros[i] = livro;
                break;
            }
        }
    }

    public Livro[] getLivros() {
        return livros;
    }

    public Saga(int nota, Livro[] livros) {
        this.nota = nota;
        this.livros = livros;
    }
}
