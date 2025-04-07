public class Roupa extends Produto {

    //declara as variáveis
    private String tamanho;
    private String material;

    // inicializa os atributos com os valores fornecidos
    public Roupa(String codigo, String nome, double preco, String tamanho, String material) {
        super(codigo, nome, preco);  // Chama o construtor da classe Produto
        this.tamanho = tamanho;
        this.material = material;
    }

    // retorna o tamanho da roupa
    public String getTamanho() {
        return tamanho;
    }

    // define o tamanho da roupa
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    // retorna o material da roupa
    public String getMaterial() {
        return material;
    }

    // define o material da roupa
    public void setMaterial(String material) {
        this.material = material;
    }

    // exibe as informações da roupa/classe Produto
    public void exibir_informacoes() {
        super.exibir_informacoes();  // Exibe as informações da classe Produto
        System.out.println("Tamanho........: " + this.tamanho);
        System.out.println("Material......: " + this.material);
    }
}
