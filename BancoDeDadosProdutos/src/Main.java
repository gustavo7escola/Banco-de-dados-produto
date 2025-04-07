import java.time.LocalDate;  // Importa as classes
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // criação de um objeto Scanner para ler dados do usuário
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        int opcaoMenu, opcaoProduto;
        String codigo;
        String nome;
        double preco;
        String marca;
        int garantia_meses;
        String tamanho;
        String material;
        LocalDate dataValidade;
        String categoria;

        // criação dos ArrayLists para armazenar os diferentes tipos de produtos
        ArrayList<Eletronico> arrele = new ArrayList<>();
        ArrayList<Roupa> arrrou = new ArrayList<>();
        ArrayList<Alimento> arrali = new ArrayList<>();

        // loop principal do programa que mantém o menu ativo até o usuário digitar '9' para sair
        do {
            // chama a função que exibe o menu para o usuário
            montarMenu();
            System.out.println("Informe a sua opcao : ");
            opcaoMenu = sc.nextInt();  // lê a opção escolhida pelo usuário
            if (opcaoMenu == 9) {
                break;  // sai se a opção for 9
            } else {
                System.out.println("1 - Eletronico \n2 - Roupa \n3 - Alimento");  // opções para escolher o tipo de produto
            }
            opcaoProduto = sc.nextInt();  // Lê o tipo de produto escolhido

            // switch para realizar operação escolhida
            switch (opcaoMenu) {
                case 1: { // Inclusão de novos produtos
                    if (opcaoProduto == 1) { // caso o usuário queira adicionar um Eletrônico
                        System.out.print("Codigo.: ");
                        codigo = sc.next();  // lê o código do eletrônico
                        System.out.print("\nNome.: ");
                        nome = sc.next();
                        System.out.print("\nPreco.: ");
                        preco = sc.nextDouble();
                        System.out.print("\nMarca.: ");
                        marca = sc.next();
                        System.out.print("\nGarantia.: ");
                        garantia_meses = sc.nextInt();

                        // cria o objeto Eletronico com os dados fornecidos e adiciona ao ArrayList
                        Eletronico e1 = new Eletronico(codigo, nome, preco, marca, garantia_meses);
                        arrele.add(e1);
                        break;

                    } else if (opcaoProduto == 2) { // Caso o usuário queira adicionar uma Roupa
                        System.out.print("Codigo.: ");
                        codigo = sc.next();  // lê o código da roupa
                        System.out.print("\nNome.: ");
                        nome = sc.next();
                        System.out.print("\nPreco.: ");
                        preco = sc.nextDouble();
                        System.out.print("\nTamanho.: ");
                        tamanho = sc.next();
                        System.out.print("\nMaterial.: ");
                        material = sc.next();

                        // cria o objeto Roupa com os dados fornecidos e adiciona ao ArrayList
                        Roupa r1 = new Roupa(codigo, nome, preco, tamanho, material);
                        arrrou.add(r1);
                        break;

                    } else if (opcaoProduto == 3) { // caso o usuário queira adicionar um Alimento
                        System.out.print("Codigo.: ");
                        codigo = sc.next();  // lê o código do alimento
                        System.out.print("\nNome.: ");
                        nome = sc.next();
                        System.out.print("\nPreco.: ");
                        preco = sc.nextDouble();
                        System.out.print("\nData de validade(AAAA-MM-DD).: ");
                        dataValidade = LocalDate.parse(sc.next());
                        System.out.print("\nCategoria.: ");
                        categoria = sc.next();

                        // cria o objeto Alimento com os dados fornecidos e adiciona ao ArrayList
                        Alimento a1 = new Alimento(codigo, nome, preco, dataValidade, categoria);
                        arrali.add(a1);
                        break;
                    }
                }

                case 2: {  // Alteração de produtos
                    boolean encontrado = false;  //verificar se o produto foi encontrado
                    if (opcaoProduto == 1) {
                        // alteração de Eletrônico
                        System.out.println("Informe o código do produto Eletronico");
                        codigo = sc.next();  // lê o código do produto
                        for (int i = 0; i < arrele.size(); i++) {
                            if (arrele.get(i).getCodigo().equals(codigo)) {  // procura o produto pelo código
                                System.out.println("Achei o código na posição " + i);
                                encontrado = true;

                                // lê os dados existentes e permite que o usuário altere
                                nome = arrele.get(i).getNome();
                                preco = arrele.get(i).getPreco();
                                marca = arrele.get(i).getMarca();
                                garantia_meses = arrele.get(i).getGarantia_meses();

                                // novos dados fornecidos para atualizar o produto
                                System.out.print("\nNome.: ");
                                nome = sc.next();
                                System.out.print("\nPreco: ");
                                preco = sc.nextDouble();
                                System.out.print("\nMarca: ");
                                marca = sc.next();
                                System.out.print("\nGarantia: ");
                                garantia_meses = sc.nextInt();

                                // atualiza o produto na lista com os novos dados
                                Eletronico e1 = new Eletronico(codigo, nome, preco, marca, garantia_meses);
                                arrele.set(i, e1);
                            }
                        }
                    } else if (opcaoProduto == 2) {
                        // alteração de Roupa
                        System.out.println("Informe o código do produto Roupa");
                        codigo = sc.next();  // lê o código do produto
                        for (int i = 0; i < arrrou.size(); i++) {
                            if (arrrou.get(i).getCodigo().equals(codigo)) {
                                System.out.println("Achei o código na posição " + i);
                                encontrado = true;
                                // lê os dados da roupa e permite alteração
                                nome = arrrou.get(i).getNome();
                                preco = arrrou.get(i).getPreco();
                                tamanho = arrrou.get(i).getTamanho();
                                material = arrrou.get(i).getMaterial();

                                // novos dados fornecidos para atualizar o produto
                                System.out.print("\nNome.: ");
                                nome = sc.next();
                                System.out.print("\nPreco: ");
                                preco = sc.nextDouble();
                                System.out.print("\nTamanho: ");
                                tamanho = sc.next();
                                System.out.print("\nMaterial: ");
                                material = sc.next();
                                Roupa r1 = new Roupa(codigo, nome, preco, tamanho, material);
                                arrrou.set(i, r1);
                                break;
                            }
                        }
                    } else if (opcaoProduto == 3) {
                        // alteração de Alimento
                        System.out.println("Informe o código do produto Alimento");
                        codigo = sc.next();  // lê o código do alimento
                        for (int i = 0; i < arrali.size(); i++) {
                            if (arrali.get(i).getCodigo().equals(codigo)) {
                                System.out.println("Achei o código na posição " + i);
                                encontrado = true;
                                // lê os dados do alimento e permite alteração
                                nome = arrali.get(i).getNome();
                                preco = arrali.get(i).getPreco();
                                dataValidade = LocalDate.parse(arrali.get(i).getDataValidade());
                                categoria = arrali.get(i).getCategoria();

                                // novos dados fornecidos para atualizar o produto
                                System.out.print("\nNome.: ");
                                nome = sc.next();
                                System.out.print("\nPreco: ");
                                preco = sc.nextDouble();
                                System.out.print("\nData validade(AAAA-MM-DD): ");
                                dataValidade = LocalDate.parse(sc.next());
                                System.out.print("\nCategoria: ");
                                categoria = sc.next();
                                Alimento a1 = new Alimento(codigo, nome, preco, dataValidade, categoria);
                                arrali.set(i, a1);
                            }
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Código não encontrado.");  // imprime caso o código não seja encontrado
                    }
                    break;
                }

                case 3: {  // exclusão de produtos
                    System.out.println("Informe o código do produto para exclusão");
                    codigo = sc.next();  // Lê o código do produto
                    boolean encontrado = false;  //verificar se o produto foi encontrado

                    // remove o produto Eletronico
                    for (int i = 0; i < arrele.size(); i++) {
                        if (arrele.get(i).getCodigo().equals(codigo)) {
                            arrele.remove(i);  // remove o eletrônico
                            encontrado = true;
                            break;
                        }
                    }

                    // remove a Roupa
                    for (int i = 0; i < arrrou.size(); i++) {
                        if (arrrou.get(i).getCodigo().equals(codigo)) {
                            arrrou.remove(i);  // remove a roupa
                            encontrado = true;
                            break;
                        }
                    }

                    // remove o Alimento
                    for (int i = 0; i < arrali.size(); i++) {
                        if (arrali.get(i).getCodigo().equals(codigo)) {
                            arrali.remove(i);  // remove o alimento
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Código não encontrado.");  // imprime caso o produto não seja encontrado
                    }
                    break;
                }

                case 4: {  // Listar produtos
                    if (opcaoProduto == 1) {
                        System.out.println("******** Eletrônicos ********");
                        for (Eletronico ele : arrele) {
                            ele.exibir_informacoes();  // exibe as informações do eletrônico
                        }
                    } else if (opcaoProduto == 2) {
                        System.out.println("******** Roupas ********");
                        for (Roupa rou : arrrou) {
                            rou.exibir_informacoes();  // exibe as informações da roupa
                        }
                    } else if (opcaoProduto == 3) {
                        System.out.println("******** Alimento ********");
                        for (Alimento ali : arrali) {
                            ali.exibir_informacoes();  // exibe as informações do alimento
                        }
                    }
                    break;
                }

                default:
                    System.out.println("Opção inválida.");  // imprime caso o usuário escolha uma opção inválida
                    break;
            }

        } while (opcaoMenu != 9);  // loop continuará até o usuário digitar 9 para sair

        if (opcaoMenu == 9) {
            System.out.println("Obrigado por utilizar o nosso programa");
        }
    }

    // exibe o menu de opções para o usuário
    public static void montarMenu() {
        System.out.println("********* MENU *********");
        System.out.println("*                      *");
        System.out.println("* 1 - Incluir          *");
        System.out.println("* 2 - Alterar          *");
        System.out.println("* 3 - Excluir          *");
        System.out.println("* 4 - Listar           *");
        System.out.println("* 9 - Fim              *");
        System.out.println("*************************");
    }
}
