public class Autor {
    private String nome;
    private Saga[] sagas = new Saga[10];

    public void listarSagas(){
        for (int i = 0; i < this.sagas.length; i++) {
            if(this.sagas[i] != null) {
            System.out.println("Saga >> " + i);
            Livro[] livros = this.sagas[i].getLivros();
                for (int j = 0; j < livros.length; j++) {
                    if(livros[j] != null)
                        System.out.println(livros[j].getTitulo());
                }
            }
        }
    }

    public void adicionarSaga(Saga saga){
        for (int i = 0; i < sagas.length; i++) {
            if(sagas[i] == null){
                sagas[i] = saga;
                break;
            }
        }
    }

    public Autor(String nome) {
        this.nome = nome;
    }
}
