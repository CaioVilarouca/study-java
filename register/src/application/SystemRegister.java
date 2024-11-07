package application;

import java.util.InputMismatchException;
import java.util.Scanner;
import entities.HubStock;
import entities.Product;

public class SystemRegister {
    Scanner scanner = new Scanner(System.in);
    Product product = new Product();
    HubStock hubStock = new HubStock();

    // Votores
    private String[] nameStock = new String[3];
    private Integer[] amountStock = new Integer[3];
    private Double[] valueStock = new Double[3];
    private double valueEnd = 0;

    public void starRegister() {
        for (int i = 0; i < 3; i++) {
            System.out.println("\nNovo registro de produto. \n");
            newRegister(i);
            register(i);
            scanner.nextLine(); //Consumir a quebra de linha
        }
        printRegister();
    }

    public void newRegister(int i) {
        System.out.print("Nome: ");
        product.setNameProduct(scanner.nextLine());

        // Coleta de dados
        while (true) {
            try {
                System.out.print("Valor R$ ");
                product.setValueProduct(scanner.nextDouble());
                if (product.getValueProduct() <= 0) {
                    throw new IllegalArgumentException("O valor não pode ser negativo ou 0");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor numérico.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        
        while (true) {
            try {
                System.out.print("Quantidade: ");
                hubStock.setAmount(scanner.nextInt());
                if (hubStock.getAmount() <= 0) {
                    throw new IllegalArgumentException("A quantidade não pode ser negativa ou zero.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor numérico.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        // Calculando o valor
        valueEnd += hubStock.getValueStock(product.getValueProduct(), hubStock.getAmount());

        // Armazenado os dados
        nameStock[i] = product.getNameProduct();
        amountStock[i] = hubStock.getAmount();
        valueStock[i] = hubStock.getValueStock();
    }

    public void register(int i) {
        System.out.println("\nNovo registro inserido | Número [" + (i + 1) + "]:\n");
        System.out.printf("Nome: [%s] | Preço de custo: [R$%.2f] \nQuantidade em estoque: [x%d]\nValor do estoque: [R$%.2f] \n\n",
                product.getNameProduct(), product.getValueProduct(), hubStock.getAmount(), hubStock.getValueStock());
    }

    public void printRegister() {
        System.out.println("\nRegistros de Produtos:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Nome do produto: " + nameStock[i]);
            System.out.println("Quantidade: " + amountStock[i]);
            System.out.printf("Valor do estoque: R$%.2f \n", valueStock[i]);
        }
        System.out.printf("\nValor do estoque todo R$ %.2f", valueEnd);
    }
}
