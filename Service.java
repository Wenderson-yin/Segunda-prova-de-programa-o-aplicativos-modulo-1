package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {

    static List<Cliente> listCliente = new ArrayList<>();

    public static void servico() {
        System.out.println("+++++++++++++++++++++++ BEM VINDO +++++++++++++++++++++++++++++++");
        Valorant:
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Para criar um novo cliente digite (1)");
            System.out.println("Para remover um produto do cliente digite (2)");
            System.out.println("Para atualizar o cliente digite (3)");
            System.out.println("Para remover cliente digite (4)");
            System.out.println("Para mostra um cliente especifico digite (5)");
            System.out.println("Para mostrar a lista de cliente digite (6)");
            System.out.println("Para Sair digite (7)");
            int opcaoEscolhida = scanner.nextInt();

            Cliente cliente = new Cliente();
            Produto produto = new Produto();

            if(opcaoEscolhida == 1){
                Scanner addCliente = new Scanner(System.in);
                System.out.println("Digite o nome do cliente");
                cliente.nome = addCliente.nextLine();
                System.out.println("Digite o CPF do cliente");
                cliente.CPF = addCliente.nextLine();
                listCliente.add(cliente);

                produto.ID = 1;
                produto.nome = "Wenderson";
                produto.precoIndividual = 9.50;
                produto.quantidade = 2;
                produto.precoTotal = (produto.precoIndividual * produto.quantidade);
                cliente.produtos.add(produto);
                if(produto.precoTotal > 100.00){
                    produto.precoTotal = (produto.precoTotal/0.1 );
                }
                else{
                    produto.precoTotal = (produto.precoTotal*0.1 );
                }
            }
            if(opcaoEscolhida == 2) {

                for (int i = 0; i <= listCliente.size(); i++){
                    System.out.println("Digite o CPF do cliente que deseja remover os produtos:");
                    Scanner removerProduto = new Scanner(System.in);
                    String remProduct = removerProduto.nextLine();
                    if (remProduct.equals(listCliente.get(i).CPF)){
                        cliente.produtos.remove(produto);
                        System.out.println("Produtos do cliente removido com êxito");
                    }
                }
            }
            if(opcaoEscolhida == 3){
                System.out.println("Informe o CPF do cliente");
                Scanner novoProd = new Scanner(System.in);
                String novProduto = novoProd.nextLine();

                for(int s = 0; s < listCliente.size(); s++){
                    if(novProduto.equals(listCliente.get(s).CPF)){
                        produto.ID= 1;
                        produto.nome = "Diego";
                        produto.precoIndividual = 1.00;
                        produto.quantidade = 15;
                        produto.precoTotal = (produto.quantidade * produto.precoIndividual);
                        cliente.produtos.add(produto);
                    }
                }
            }
            if(opcaoEscolhida == 4){
                for (int i = 0; i <= listCliente.size(); i++) {
                    System.out.println("Informe o CPF do cliente que deseja remover");
                    Scanner removerCliente = new Scanner(System.in);
                    String exCliente = removerCliente.nextLine();
                    if (exCliente.equals(listCliente.get(i).CPF)) {
                        listCliente.remove(i);
                        System.out.println("Cliente removido com sucesso");
                        continue Valorant;
                    }
                }
            }
            if(opcaoEscolhida == 5) {
                System.out.println("Informe o CPF do cliente:");
                Scanner digitarCPF = new Scanner(System.in);
                String CPFlog = digitarCPF.nextLine();
                for (Cliente c : listCliente) {
                    if (c.CPF.equals(CPFlog)) {
                        System.out.println(c.nome);
                        System.out.println(c.CPF);
                        System.out.println(c.produtos);
                        System.out.println(c.totalCompra);
                    }
                }
            }
            if(opcaoEscolhida == 6) {
                cliente.totalCompra = produto.precoTotal;
                for (Cliente x : listCliente) {
                    System.out.println(x.nome);
                    System.out.println(x.CPF);
                    for(Produto p : x.produtos){
                        System.out.println(p.ID);
                        System.out.println(p.nome);
                        System.out.println(p.precoTotal);
                    }
                }
            }
            if(opcaoEscolhida == 7){
                System.out.println("------ VOLTE SEMPRE ------");
                break Valorant;
            }
        }
    }
}