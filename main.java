import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        // Exercício 01
        int[] numeros = {5, 10, 15, 20, 25};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número: " + numeros[i]);
        }

        // Exercício 02
        String[] cidades = {"Maringá", "Recife", "Fortaleza", "Cascavel"};
        for (String cidade : cidades) {
            System.out.println("Cidade: " + cidade);
        }

        // Exercício 03
        int[] valores = {1, 2, 3, 4, 5, 6};
        int soma = 0;
        for (int i = 0; i < valores.length; i++) {
            soma = soma + valores[i];
        }
        System.out.println("Soma total: " + soma);

        // Exercício 04
        ArrayList<String> produtos = new ArrayList<>();
        produtos.add("Arroz");
        produtos.add("Feijão");
        produtos.add("Leite");
        produtos.add("Macarrão");
        produtos.add("Café");
        for (String produto : produtos) {
            System.out.println("Produto: " + produto);
        }

        // Exercício 05
        produtos.remove("Macarrão");
        System.out.println("Lista após remoção:");
        for (String produto : produtos) {
            System.out.println("Produto: " + produto);
        }

        // Exercício 06
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome de um produto para procurar: ");
        String nomeBusca = scanner.nextLine();
        if (produtos.contains(nomeBusca)) {
            System.out.println("Produto encontrado!");
        } else {
            System.out.println("Produto não encontrado.");
        }

        // Exercício 07
        HashMap<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Ana", 30);
        pessoas.put("João", 25);
        pessoas.put("Lucas", 40);
        pessoas.put("Paula", 22);
        pessoas.put("Bruno", 35);

        for (String nome : pessoas.keySet()) {
            int idade = pessoas.get(nome);
            System.out.println(nome + " tem " + idade + " anos.");
        }

        scanner.close();

        // Exercício 08
        System.out.print("Digite o nome de uma pessoa para buscar a idade: ");
        String nomeProcurado = scanner.nextLine();
        if (pessoas.containsKey(nomeProcurado)) {
            System.out.println(nomeProcurado + " tem " + pessoas.get(nomeProcurado) + " anos.");
        } else {
            System.out.println("Pessoa não encontrada.");
        }

        // Exercício 09
        ArrayList<String> listaNomes = new ArrayList<>();
        HashMap<String, Integer> mapaNomes = new HashMap<>();

        for (int i = 0; i < 10000; i++) {
            String nome = "Nome" + i;
            listaNomes.add(nome);
            mapaNomes.put(nome, i);
        }

        System.out.print("Digite um nome para buscar (ex: Nome9999): ");
        String nomeBuscaPerformance = scanner.nextLine();

        long inicioLista = System.currentTimeMillis();
        for (String nome : listaNomes) {
            if (nome.equals(nomeBuscaPerformance)) {
                break;
            }
        }
        long fimLista = System.currentTimeMillis();
        System.out.println("Tempo de busca no ArrayList: " + (fimLista - inicioLista) + " ms");

        long inicioMapa = System.currentTimeMillis();
        mapaNomes.get(nomeBuscaPerformance);
        long fimMapa = System.currentTimeMillis();
        System.out.println("Tempo de busca no HashMap: " + (fimMapa - inicioMapa) + " ms");

        // Exercício 10
        HashMap<Integer, String> cadastroProdutos = new HashMap<>();
        String continuar;

        do {
            System.out.print("Digite o código do produto (número): ");
            int codigo = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Digite o nome do produto: ");
            String nomeProduto = scanner.nextLine();

            cadastroProdutos.put(codigo, nomeProduto);

            System.out.print("Deseja cadastrar outro produto? (s/n): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

        System.out.print("Digite o código de um produto para buscar: ");
        int codigoBusca = scanner.nextInt();

        if (cadastroProdutos.containsKey(codigoBusca)) {
            System.out.println("Produto encontrado: " + cadastroProdutos.get(codigoBusca));
        } else {
            System.out.println("Produto não encontrado.");
        }

        System.out.println("Lista de todos os produtos cadastrados:");
        for (Integer codigo : cadastroProdutos.keySet()) {
            System.out.println("Código: " + codigo + " - Produto: " + cadastroProdutos.get(codigo));
        }

    }
}
