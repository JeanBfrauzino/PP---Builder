package Builder;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DiretorSanduicheVegetariano diretorVegetariano = new DiretorSanduicheVegetariano();
        DiretorSanduicheCarnivoro diretorCarnivoro = new DiretorSanduicheCarnivoro();

        System.out.println("Escolha uma opção:");
        System.out.println("1. Sanduíche Vegetariano Padrão");
        System.out.println("2. Sanduíche para Amantes de Carne Padrão");
        System.out.println("3. Personalizar seu próprio sanduíche");

        int escolha = scanner.nextInt();
        scanner.nextLine();  // Consumir nova linha

        Sanduiche sanduiche = null;

        switch (escolha) {
            case 1:
                sanduiche = diretorVegetariano.fazerSanduiche();
                break;
            case 2:
                sanduiche = diretorCarnivoro.fazerSanduiche();
                break;
            case 3:
                Sanduiche.SanduicheBuilder builderPersonalizado = new Sanduiche.SanduicheBuilder();

                System.out.print("Escolha o tipo de pão: ");
                builderPersonalizado.pao(scanner.nextLine());

                System.out.print("Escolha a carne (deixe vazio se não quiser): ");
                builderPersonalizado.carne(scanner.nextLine());

                System.out.print("Escolha o tipo de queijo: ");
                builderPersonalizado.queijo(scanner.nextLine());

                System.out.print("Escolha os vegetais: ");
                builderPersonalizado.vegetais(scanner.nextLine());

                System.out.print("Quer condimentos (true/false)? ");
                builderPersonalizado.temCondimentos(scanner.nextBoolean());

                sanduiche = builderPersonalizado.build();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        if (sanduiche != null) {
            System.out.println("Seu sanduíche foi criado:");
            System.out.println(sanduiche);
        }

        scanner.close();
    }
}
