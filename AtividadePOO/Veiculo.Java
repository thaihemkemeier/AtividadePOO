public class Veiculo extends Item {
    String marca;
    String modelo;
    double potencia;

    public Veiculo(String descricao, String armazem, int ano, String marca, String modelo, double potencia) {
        super(descricao, ano, armazem);
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    @Override
    public void exibirInfo(){
        System.out.println("Sua descrição é: " + descricao + ", o armazém que está guardado é: " + armazem + ", versão do ano: " + ano);
        System.out.println("Modelo: " + modelo + ", marca: " + marca + ", com potência: " + potencia);
    }
}