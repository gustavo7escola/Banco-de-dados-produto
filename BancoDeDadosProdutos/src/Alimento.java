import java.time.LocalDate;

public class Alimento extends Produto {

    //declara as variáveis
    private String dataValidade;
    private String categoria;

    // inicializa os atributos com os valores fornecidos
    public Alimento(String codigo, String nome, double preco, LocalDate dataValidade, String categoria) {
        super(codigo, nome, preco);  // Chama o construtor da classe Produto
        this.dataValidade = dataValidade.toString();  // Converte a data para String
        this.categoria = categoria;
    }

    // retorna a data de validade do alimento
    public String getDataValidade() {
        return dataValidade;
    }

    // define a data de validade do alimento
    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    // retorna a categoria do alimento
    public String getCategoria() {
        return categoria;
    }

    // define a categoria do alimento
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // exibe as informações do alimento/classe Produto
    public void exibir_informacoes() {
        super.exibir_informacoes();  // Exibe as informações da classe Produto
        System.out.println("Data de validade: " + this.dataValidade);
        System.out.println("Categoria......: " + this.categoria);
    }
}
