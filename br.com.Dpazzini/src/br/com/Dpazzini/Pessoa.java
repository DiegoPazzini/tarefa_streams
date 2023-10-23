package br.com.Dpazzini;

class Pessoa implements Comparable<Pessoa> {
    
    private String nome; // Declaração do atributo nome, que armazena o nome da pessoa
    private char gen; // Declaração do atributo gen, que armazena o gênero da pessoa

    public Pessoa(String nome, char gen) { // Construtor da classe Pessoa, recebe nome e gen como parâmetros
        this.nome = nome; // Atribui o valor recebido ao atributo nome
        this.gen = gen; // Atribui o valor recebido ao atributo gen
    }

    public String getNome() { // Método getter para obter o nome da pessoa
        return nome; // Retorna o valor do atributo nome
    }

    public char getGen() { // Método getter para obter o gênero da pessoa
        return gen; // Retorna o valor do atributo gen
    }

    @Override
    public int compareTo(Pessoa outraPessoa) { // Implementação do método compareTo() da interface Comparable, outrapessoa é apenas um nome de variável escolhido para representar o objeto do tipo Pessoa com o qual a instância atual está sendo comparada dentro do método compareTo. 
        return 0; // Retorna 0 por enquanto, pois a comparação não foi implementada
    }
}