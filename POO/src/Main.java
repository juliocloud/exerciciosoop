public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor(
                "Arthur Schopenhauer"
        );

        Livro livro1 = new Livro("A sociedade do anel", 10);
        Livro livro2 = new Livro("As duas torres", 10);
        Livro livro3 = new Livro("O retorno do rei", 10);


        Livro livro4 = new Livro("A pedra filosofal", 10);
        Livro livro5 = new Livro("A fuga de Azkaban", 10);
        Livro livro6 = new Livro("As reliquias da morte", 10);


        Saga saga = new Saga(10);
        Saga saga2 = new Saga(10);

        saga.adicionarLivro(livro1);
        saga.adicionarLivro(livro2);
        saga.adicionarLivro(livro3);

        saga2.adicionarLivro(livro4);
        saga2.adicionarLivro(livro5);
        saga2.adicionarLivro(livro6);

        autor.adicionarSaga(saga);
        autor.adicionarSaga(saga2);
        autor.listarSagas();

        Musica musica1 = new Musica("Black Dog" , "Led Zeppelin IV");
        Musica musica2 = new Musica("The Lemon Song" , "Led Zeppelin II");

        Banda banda = new Banda("Led Zeppelin", 4);

        banda.tocarMusica(0);
        banda.tocarShow();
        banda.adicionarMusica(musica1);
        banda.adicionarMusica(musica2);
        banda.adicionarMusica(new Musica("Stairway to heaven", "Led Zeppelin IV"));
        banda.tocarShow();

    }
}