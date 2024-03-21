public class Banda {
    private Musica[] musicas = new Musica[10];
    private String nome;
    private int numeroDeIngrantes;

    public Banda( String nome, int numeroDeIngrantes) {
        this.nome = nome;
        this.numeroDeIngrantes = numeroDeIngrantes;
    }

    public void tocarMusica(int posicao){
        if(this.musicas[posicao] != null)   System.out.println("Tocando " + this.musicas[posicao].getNome() + " \uD83C\uDFB6 ");
    }

    public void tocarShow(){
        System.out.println("Tocando lineup de " + this.nome);
        for (int i = 0; i < this.musicas.length; i++) {
            if(this.musicas[i] != null)
                System.out.println("Tocando: " + this.musicas[i].getNome());
        }
        System.out.println("Fim do show");
    }

    public void adicionarMusica(Musica musica){
        for (int i = 0; i < this.musicas.length; i++) {
            if(this.musicas[i] == null){
                this.musicas[i] = musica;
                System.out.println(musica.getNome() + " adicionada");
                break;
            }
        }
    }

    public void deletarMusica(String nome){
        for (int i = 0; i < this.musicas.length; i++) {
            if(this.musicas[i] != null && this.musicas[i].getNome() == nome){
                this.musicas[i] = null;
                break;
            }
        }
    }




}
