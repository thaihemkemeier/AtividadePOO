import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe descrição, armazém e ano do veículo:");
        String descricaoVeiculo = scanner.nextLine();
        String armazemVeiculo = scanner.nextLine();
        int anoVeiculo = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Informe marca, modelo e potência do veículo:");
        String marca = scanner.nextLine();
        String modelo = scanner.nextLine();
        double potencia = scanner.nextDouble();
        scanner.nextLine();
        Veiculo veiculo = new Veiculo(descricaoVeiculo, armazemVeiculo, anoVeiculo, marca, modelo, potencia);
        veiculo.exibirInfo(); 
        System.out.println("Informe descrição, armazém e ano da publicação:");
        String descricaoPublicacao = scanner.nextLine();
        String armazemPublicacao = scanner.nextLine();
        int anoPublicacao = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Informe nome da publicação, autor e editora:");
        String nome = scanner.nextLine();
        String autor = scanner.nextLine();
        String editora = scanner.nextLine();
        Publicacao publicacao = new Publicacao(descricaoPublicacao, armazemPublicacao, anoPublicacao, nome, autor, editora);
        publicacao.exibirInfo(); 
    }
}
