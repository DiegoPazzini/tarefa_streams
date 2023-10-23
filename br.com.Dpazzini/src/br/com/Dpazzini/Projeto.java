package br.com.Dpazzini;


import java.util.ArrayList; // Importação da classe ArrayList
import java.util.List; // Importação da classe List
import java.util.Scanner; // Importação da classe Scanner
import java.util.stream.Collectors; // Importação da classe Collectors
import java.util.stream.IntStream; // Importação da classe IntStream

public class Projeto { // Declaração da classe Projeto

    public static void main(String[] args) { // Método main, ponto de entrada do programa
        String nome; // Declaração da variável nome
        char gen; // Declaração da variável gen

        Scanner ler = new Scanner(System.in); // Criação de uma instância de Scanner para ler input do usuário

        List<Pessoa> pessoas = new ArrayList<>(); // Criação de uma lista de pessoas usando ArrayList

        System.out.println("Você pode adicionar nomes de homens e mulheres."); // Imprime uma mensagem no console
        System.out.println("\n***************************************************");
        System.out.println("* APENAS A LISTA DE GÊNERO FEMININO SERÁ IMPRESSA *");
        System.out.println("***************************************************\n");

        while (true) { // Loop infinito
            System.out.println("Se deseja parar, digite 'p'; caso contrário, digite o nome:"); // Imprime uma mensagem no console
            nome = ler.nextLine(); // Lê o nome digitado pelo usuário

            if (nome.equalsIgnoreCase("p")) { // Verifica se o usuário digitou 'p' para parar
                System.out.println("Até a próxima!"); // Imprime uma mensagem no console
                break; // Sai do loop
            }

            System.out.println("Digite o sexo 'H' ou 'M':"); // Imprime uma mensagem no console
            gen = ler.next().charAt(0); // Lê o gênero digitado pelo usuário, charAt(0) é usado para obter o primeiro caractere de uma string. A chamada desse método com o argumento 0 retorna o primeiro caractere da string.

            pessoas.add(new Pessoa(nome, gen)); // Adiciona uma nova pessoa à lista de pessoas
            ler.nextLine(); // Limpa o buffer
        }

        List<Pessoa> homem = pessoas.stream() // Cria um stream da lista de pessoas
                .filter(pessoa -> pessoa.getGen() == 'H' || pessoa.getGen() == 'h') // Filtra as pessoas do gênero masculino
                .collect(Collectors.toList()); // Coleta as pessoas filtradas em uma nova lista

        List<Pessoa> mulher = pessoas.stream() // Cria um stream da lista de pessoas
                .filter(pessoa -> pessoa.getGen() == 'M' || pessoa.getGen() == 'm') // Filtra as pessoas do gênero feminino
                .collect(Collectors.toList()); // Coleta as pessoas filtradas em uma nova lista

        homem.sort((p1, p2) -> p1.getNome().compareTo(p2.getNome())); // sort é usado para organizar os elementos dentro das listas homem e mulher em ordem alfabética com base no nome das pessoas.
        mulher.sort((p1, p2) -> p1.getNome().compareTo(p2.getNome())); // Ordena a lista de mulheres em ordem alfabética pelo nome
        //p1 e p2 são simplesmente variáveis que representam duas instâncias de objetos da classe Pessoa sendo comparadas com base em seus nomes durante o processo de ordenação.

        System.out.println("\nMulheres:\n"); // Imprime uma mensagem no console
        IntStream.range(0, mulher.size()) // Cria um IntStream com os índices da lista de mulheres
                .forEach(index -> System.out.println((index + 1) + ". " + mulher.get(index).getNome())); // Itera sobre o IntStream e imprime cada mulher com seu índice

    }
}