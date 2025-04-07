public class Eletronico extends Produto {

    //declara as variáveis
    private String marca;
    private int garantia_meses;

    // inicializa os atributos com os valores fornecidos
    public Eletronico(String codigo, String nome, double preco, String marca, int garantia_meses) {
        super(codigo, nome, preco);  // Chama o construtor da classe Produto
        this.marca = marca;
        this.garantia_meses = garantia_meses;
    }

    // retorna a marca do eletrônico
    public String getMarca() {
        return marca;
    }

    // define a marca do eletrônico
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // retorna a garantia do eletrônico em meses
    public int getGarantia_meses() {
        return garantia_meses;
    }

    // define a garantia do eletrônico em meses
    public void setGarantia_meses(int garantia_meses) {
        this.garantia_meses = garantia_meses;
    }

    // exibe as informações do eletrônico/classe Produto
    public void exibir_informacoes() {
        super.exibir_informacoes();  // Exibe as informações da classe Produto
        System.out.println("Garantia: " + this.garantia_meses + " meses");
        System.out.println("Marca......: " + this.marca);
    }
}
