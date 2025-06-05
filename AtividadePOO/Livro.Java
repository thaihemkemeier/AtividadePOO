public class Publicacao extends Item {
    String nome;
    String autor;
    String editora;

    public Publicacao(String descricao, String armazem, int ano, String nome, String autor, String editora) {
        super(descricao, ano, armazem);
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
    }

    @Override
    public void exibirInfo(){
        System.out.println("Sua descrição é: " + descricao + ", o armazém que está guardado é: " + armazem + ", versão do ano: " + ano);
        System.out.println("Nome da publicação: " + nome + ", autor(a): " + autor + ", editora: " + editora);
    }
}