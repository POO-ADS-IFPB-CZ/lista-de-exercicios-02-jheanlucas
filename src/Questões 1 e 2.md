# Respostas da Atividade

## Questão 1

Quando você deixa um atributo como `public`, é como se estivesse dizendo: "qualquer um pode mexer nisso aqui do jeito que quiser".

No começo parece prático, mas conforme o código cresce, isso vira bagunça. Você perde controle sobre o que está acontecendo com os dados.

Já com getters e setters, você coloca uma espécie de "porteiro" no seu dado. Antes de alguém ler ou alterar, passa por uma regra. Isso te dá mais segurança e organização.

Usar getters e setters ajuda porque você evita que valores sem sentido sejam atribuídos, deixa o código mais fácil de manter no futuro e te dá liberdade para mudar a lógica depois sem quebrar tudo.

```java
public class Calcado {

    private double preco;

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido!");
        }
    }

    public double getPreco() {
        return preco;
    }
}
```

Em uma empresa que cadastra preço de produtos, se não houvesse encapsulamento, ele poderia ser alterado sem querer ou de forma inválida. Mas, nesse caso, `preco` não pode ser menor ou igual a zero, aplicando uma primeira barreira.

## Questão 2

**A)** Para representar um livro poderíamos usar título, autor, editora, gêneros ou gênero.

**B)** Porque a classe Livro não representa um livro da vida real de forma completa. Considera-se apenas as características essenciais para o sistema, ignorando detalhes desnecessários e mantendo apenas o que é relevante.

**C)** `emprestar()`, `reservar()`, `getTitulo()`.
