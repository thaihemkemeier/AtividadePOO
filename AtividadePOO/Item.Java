    public class Item {
        protected String descricao;
        protected int ano;
        protected String armazem;

        public Item(String descricao, int ano, String armazem){
            this.descricao = descricao;
            this.armazem = armazem;
            this.ano = ano;
        }

        public void exibirInfo(){
            System.out.println("Seu item é: " + descricao + ", do ano: " + ano + ", e está no armazém: " + armazem);
        }
    }