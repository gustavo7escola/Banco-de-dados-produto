public class Produto {

    //declara as variáveis
    private String codigo;
    private String nome;
    private double preco;

    // inicializa os atributos com os valores fornecidos
    public Produto(String codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    // construtor padrão que não inicializa os atributos
    public Produto() {

    }

    // retorna o código do produto
    public String getCodigo() {
        return codigo;
    }

    // retorna o nome do produto
    public String getNome() {
        return nome;
    }

    // define o nome do produto
    public void setNome(String nome) {
        this.nome = nome;
    }

    // retorna o preço do produto
    public double getPreco() {
        return preco;
    }

    // define o preço do produto
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // exibe as informações do produto
    public void exibir_informacoes() {
        System.out.println("Codigo........: " + this.codigo);
        System.out.println("Nome..........: " + this.nome);
        System.out.println("Preco.........: " + this.preco);
    }
}
