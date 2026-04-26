import java.util.Scanner;

public class ListaVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\nMENU:");
            System.out.println("1 - Ex1");
            System.out.println("2 - Ex2");
            System.out.println("3 - Ex3");
            System.out.println("4 - Ex4");
            System.out.println("5 - Ex5");
            System.out.println("6 - Ex6");
            System.out.println("7 - Ex7");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            if (!sc.hasNextInt()) {
                System.out.println("Digite um número válido!");
                sc.next(); // limpa erro
                continue;
            }

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    int[] v1 = new int[5];
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Digite: ");
                        v1[i] = sc.nextInt();
                    }
                    for (int i = 0; i < 5; i++) {
                        System.out.println(v1[i]);
                    }
                    break;

                case 2:
                    double[] v2 = new double[10];
                    for (int i = 0; i < 10; i++) {
                        System.out.print("Digite: ");
                        v2[i] = sc.nextDouble();
                    }
                    for (int i = 9; i >= 0; i--) {
                        System.out.println(v2[i]);
                    }
                    break;

                case 3:
                    double soma = 0;
                    double[] notas = new double[4];
                    for (int i = 0; i < 4; i++) {
                        System.out.print("Nota: ");
                        notas[i] = sc.nextDouble();
                        soma += notas[i];
                    }
                    System.out.println("Média: " + (soma / 4));
                    break;

                case 4:
                    char[] letras = new char[10];
                    int cons = 0;

                    for (int i = 0; i < 10; i++) {
                        System.out.print("Letra: ");
                        letras[i] = sc.next().charAt(0);

                        if ("aeiouAEIOU".indexOf(letras[i]) == -1) {
                            cons++;
                        }
                    }

                    System.out.println("Consoantes:");
                    for (int i = 0; i < 10; i++) {
                        if ("aeiouAEIOU".indexOf(letras[i]) == -1) {
                            System.out.println(letras[i]);
                        }
                    }

                    System.out.println("Total: " + cons);
                    break;

                case 5:
                    int[] nums = new int[20];
                    int[] pares = new int[20];
                    int[] imp = new int[20];
                    int p = 0, im = 0;

                    for (int i = 0; i < 20; i++) {
                        System.out.print("Número: ");
                        nums[i] = sc.nextInt();

                        if (nums[i] % 2 == 0) {
                            pares[p] = nums[i];
                            p++;
                        } else {
                            imp[im] = nums[i];
                            im++;
                        }
                    }

                    System.out.println("Pares:");
                    for (int i = 0; i < p; i++) {
                        System.out.println(pares[i]);
                    }

                    System.out.println("Ímpares:");
                    for (int i = 0; i < im; i++) {
                        System.out.println(imp[i]);
                    }
                    break;

                case 6:
                    int aprov = 0;

                    for (int i = 0; i < 10; i++) {
                        double s = 0;

                        System.out.println("Aluno " + (i + 1));

                        for (int j = 0; j < 4; j++) {
                            System.out.print("Nota: ");
                            s += sc.nextDouble();
                        }

                        double media = s / 4;

                        if (media >= 7) {
                            aprov++;
                        }
                    }

                    System.out.println("Aprovados: " + aprov);
                    break;

                case 7:
                    int[] v7 = new int[5];
                    int soma7 = 0;
                    int mult = 1;

                    for (int i = 0; i < 5; i++) {
                        System.out.print("Digite: ");
                        v7[i] = sc.nextInt();
                        soma7 += v7[i];
                        mult *= v7[i];
                    }

                    System.out.println("Soma: " + soma7);
                    System.out.println("Multiplicação: " + mult);
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}