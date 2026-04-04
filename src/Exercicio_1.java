/*
Quando você deixa um atributo como public, é como se estivesse dizendo = “qualquer um pode mexer nisso aqui do jeito que quiser”.
No começo parece prático, mas conforme o código cresce, isso vira bagunça. Você perde controle sobre o que está acontecendo com os dados.

Já com getters e setters, você coloca uma espécie de “porteiro” no seu dado. Antes de alguém ler ou alterar, passa por uma regra, isso te dá mais segurança e organização.

Usar getters e setters ajuda porque você evita que valores sem sentido sejam atribuídos, deixa o código mais fácil de manter no futuro,te dá liberdade pra mudar a lógica depois sem quebrar tudo*/

public class calcado {
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

/* Em uma empresa que cadastra preço de produtos, se não houvesse encapsulamento ele poderia
ser alterado sem querer ou de forma inválida. Mas, nesse caso, preco não pode ser menor ou igual a zero aplicando uma primeira barreira.
 */