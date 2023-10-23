# tarefa_streams

Em Java, Stream é uma sequência de elementos que oferece uma maneira de processar coleções de dados de forma mais concisa e funcional. Ele não é uma estrutura de dados em si, mas uma maneira de lidar com dados de maneira mais eficiente e poderosa. Os Streams em Java permitem realizar operações sequenciais ou paralelas em coleções de dados, incluindo mapeamento, filtragem, redução e muitas outras operações.

Explicação do Código:
O código fornecido realiza o seguinte processo:

Inicialmente, ele solicita ao usuário que adicione nomes de homens e mulheres a uma lista.
Em seguida, solicita ao usuário que digite o sexo ('H' para homem e 'M' para mulher) correspondente a cada nome.
Os dados inseridos pelo usuário são coletados e armazenados em objetos da classe Pessoa, que possuem atributos como nome e gênero.
Posteriormente, os objetos Pessoa são filtrados em duas listas separadas com base no gênero - uma lista contendo homens e outra contendo mulheres.
As listas de homens e mulheres são ordenadas em ordem alfabética com base no nome.
Por fim, o programa imprime na tela os nomes das mulheres.
Para executar essas operações, o código utiliza recursos como Scanner para coletar dados de entrada do usuário, operações de Stream para filtrar e ordenar os objetos, e métodos como charAt(0) para obter o primeiro caractere da entrada do usuário. Além disso, é utilizado o método IntStream.range(0, tamanho) para criar uma sequência de índices que são usados para iterar sobre os elementos da lista.

## Skills utilizadas:
<div style="display: inline_block"><br>
   <img align="center" alt="Spring" height="50" width="50" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original.svg">
  <img align="center" alt="Spring" height="60" width="60" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg">
