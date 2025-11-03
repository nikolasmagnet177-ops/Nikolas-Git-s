import java.util.*;

public class quiz {
    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Map<String, Integer> ranking = new LinkedHashMap<>();
        boolean continuar = true;

        ranking.putIfAbsent("Criador", 300);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        while (continuar) {
            System.out.println(BOLD + YELLOW + "Bem-vindo ao Quiz de Trânsito!" + RESET);
            System.out.print("Digite o nome do jogador: ");
            String nome = leia.nextLine();
            int pontos = 0;

            // Modo administrador
            if (nome.equalsIgnoreCase("admin123")) {
                modoAdmin(leia, ranking);
                continue;
            }

            // Verifica se o nome já existe
            if (ranking.containsKey(nome)) {
                System.out.print("Esse nome já jogou antes! É você de novo? (s/n): ");
                String resposta = leia.nextLine();

                if (resposta.equalsIgnoreCase("n")) {
                    System.out.println(RED + "Use um nome diferente, nomes repetidos não são permitidos!" + RESET);
                    continue;
                } else {
                    System.out.println(YELLOW + "Beleza, vamos continuar com o mesmo jogador!" + RESET);
                }
            }
            System.out.println(BLUE + "--- Nível Fácil ---" + RESET);
            System.out.println("1 - Qual a velocidade máxima permitida em uma via urbana?");
            System.out.println("a) 40 km/h");
            System.out.println("b) 70 km/h");
            System.out.println("c) 60 km/h");
            System.out.println("d) 80 km/h");
            System.out.println("e) 100 km/h");
            String resposta1 = leia.nextLine();
            if (resposta1.equalsIgnoreCase("c")) {
                pontos += 15;
                System.out.println(GREEN + "  Resposta correta!" + RESET);
            } else {
                System.out.println(RED + "  Resposta incorreta!" + RESET);
            }
            System.out.println(GREEN + "Pontos atuais: " + pontos + RESET);

            System.out.println("2 - O que significa uma placa de trânsito com um triângulo invertido?");
            System.out.println("a) Pare");
            System.out.println("b) Dê a preferência");
            System.out.println("c) Proibido estacionar");
            System.out.println("d) Sentido proibido");
            System.out.println("e) Retorno");
            String resposta2 = leia.nextLine();
            if (resposta2.equalsIgnoreCase("b")) {
                pontos += 105;
                System.out.println(GREEN + "  Resposta correta!" + RESET);
            } else {
                System.out.println(RED + "  Resposta incorreta!" + RESET);
            }
            System.out.println(GREEN + "Pontos atuais: " + pontos + RESET);

            System.out.println(BLUE + "--- Nível Médio ---" + RESET);
            System.out.println("3 - Qual a distância mínima que um veículo deve manter ao estacionar próximo a uma esquina?");
            System.out.println("a) 3 metros");
            System.out.println("b) 5 metros");
            System.out.println("c) 7 metros");
            System.out.println("d) 10 metros");
            System.out.println("e) 15 metros");
            String resposta3 = leia.nextLine();
            if (resposta3.equalsIgnoreCase("b")) {
                pontos += 20;
                System.out.println(GREEN + "  Resposta correta!" + RESET);
            } else {
                System.out.println(RED + "  Resposta incorreta!" + RESET);
            }
            System.out.println(GREEN + "Pontos atuais: " + pontos + RESET);

            System.out.println("4 - Em uma via com várias faixas de trânsito no mesmo sentido, qual faixa deve ser utilizada para ultrapassagem?");
            System.out.println("a) Faixa da direita");
            System.out.println("b) Faixa do meio");
            System.out.println("c) Faixa da esquerda");
            System.out.println("d) Qualquer faixa");
            System.out.println("e) Nenhuma faixa");
            String resposta4 = leia.nextLine();
            if (resposta4.equalsIgnoreCase("c")) {
                pontos += 20;
                System.out.println(GREEN + "  Resposta correta!" + RESET);
            } else {
                System.out.println(RED + "  Resposta incorreta!" + RESET);
            }
            System.out.println(GREEN + "Pontos atuais: " + pontos + RESET);

            System.out.println(BLUE + "--- Nível Difícil ---" + RESET);
            System.out.println("5 - Qual é a penalidade para um motorista que dirige sob a influência de álcool com concentração igual ou superior a 0,6 mg/l de ar expelido?");
            System.out.println("a) Multa e suspensão do direito de dirigir");
            System.out.println("b) Apenas multa");
            System.out.println("c) Apenas suspensão");
            System.out.println("d) Advertência");
            System.out.println("e) Nenhuma penalidade");
            String resposta5 = leia.nextLine();
            if (resposta5.equalsIgnoreCase("a")) {
                pontos += 30;
                System.out.println(GREEN + "  Resposta correta!" + RESET);
            } else {
                System.out.println(RED + "  Resposta incorreta!" + RESET);
            }
            System.out.println(GREEN + "Pontos atuais: " + pontos + RESET);

            System.out.println("6 - Qual é a distância mínima que um veículo deve manter ao seguir outro veículo em uma via urbana?");
            System.out.println("a) 1 segundo");
            System.out.println("b) 2 segundos");
            System.out.println("c) 3 segundos");
            System.out.println("d) 4 segundos");
            System.out.println("e) 5 segundos");
            String resposta6 = leia.nextLine();
            if (resposta6.equalsIgnoreCase("c")) {
                pontos += 30;
                System.out.println(GREEN + "  Resposta correta!" + RESET);
            } else {
                System.out.println(RED + "  Resposta incorreta!" + RESET);
            }
            System.out.println(GREEN + "Pontos atuais: " + pontos + RESET);

            System.out.println(PURPLE + "--- Estudo de Casos ---" + RESET);
            System.out.println("7 - João foi à padaria e foi atropelado por uma moto que avançou o sinal vermelho. João não atravessava na faixa. Quais penalidades cada um sofrerá?");
            System.out.println("a) João: advertência verbal / Motoqueiro: multa leve");
            System.out.println("b) João: multa leve / Motoqueiro: multa grave e suspensão");
            System.out.println("c) João: advertência de segurança / Motoqueiro: multa gravíssima e suspensão");
            System.out.println("d) João: isento / Motoqueiro: advertência verbal");
            System.out.println("e) João: multa grave / Motoqueiro: multa leve");
            String resposta7 = leia.nextLine();
            if (resposta7.equalsIgnoreCase("c")) {
                pontos += 40;
                System.out.println(GREEN + "  Resposta correta!" + RESET);
            } else {
                System.out.println(RED + "  Resposta incorreta!" + RESET);
            }
            System.out.println(GREEN + "Pontos atuais: " + pontos + RESET);

            System.out.println("8 - Pedro fez ultrapassagem em faixa contínua e quase colidiu. Qual penalidade?");
            System.out.println("a) Multa leve");
            System.out.println("b) Multa grave e suspensão");
            System.out.println("c) Multa gravíssima e suspensão");
            System.out.println("d) Advertência");
            System.out.println("e) Nenhuma penalidade");
            String resposta8 = leia.nextLine();
            if (resposta8.equalsIgnoreCase("c")) {
                pontos += 40;
                System.out.println(GREEN + "  Resposta correta!" + RESET);
            } else {
                System.out.println(RED + "  Resposta incorreta!" + RESET);
            }
            System.out.println(GREEN + "Pontos atuais: " + pontos + RESET);

            System.out.println("9 - Um motorista estacionou em vaga exclusiva para ambulâncias. Penalidade?");
            System.out.println("a) Multa leve");
            System.out.println("b) Multa média");
            System.out.println("c) Multa gravíssima e remoção");
            System.out.println("d) Advertência");
            System.out.println("e) Nenhuma penalidade");
            String resposta9 = leia.nextLine();
            if (resposta9.equalsIgnoreCase("c")) {
                pontos += 40;
                System.out.println(GREEN + "  Resposta correta!" + RESET);
            } else {
                System.out.println(RED + "  Resposta incorreta!" + RESET);
            }
            System.out.println(GREEN + "Pontos atuais: " + pontos + RESET);

            System.out.println("10 - Um motorista abriu a porta do carro e derrubou um ciclista. Quem cometeu infração?");
            System.out.println("a) Apenas o ciclista");
            System.out.println("b) Apenas o motorista");
            System.out.println("c) Ambos");
            System.out.println("d) Nenhum");
            System.out.println("e) Apenas o motorista (advertência)");
            String resposta10 = leia.nextLine();
            if (resposta10.equalsIgnoreCase("b")) {
                pontos += 40;
                System.out.println(GREEN + "  Resposta correta!" + RESET);
            } else {
                System.out.println(RED + "  Resposta incorreta!" + RESET);
            }
            ranking.put(nome, pontos);
            
            mostrarRanking(ranking);

            System.out.print("\nDeseja jogar novamente?, pode ser mais de uma pessoa (s/n): ");
            String opcao = leia.nextLine();
            continuar = opcao.equalsIgnoreCase("s");
        }

        System.out.println(CYAN + "Quiz encerrado. Obrigado por jogar!" + RESET);
        leia.close();
    }
    // Modo administrador
    private static void modoAdmin(Scanner leia, Map<String, Integer> ranking) {
        boolean adminContinuar = true;

        while (adminContinuar) {
            System.out.println(BOLD + RED + "\n=== Modo Administrador ===" + RESET);
            System.out.println("1 - Ver ranking completo");
            System.out.println("2 - Adicionar ou editar jogador");
            System.out.println("3 - Sair do modo admin");
            System.out.print("Escolha uma opção: ");
            String opcaoAdmin = leia.nextLine();

            switch (opcaoAdmin) {
                case "1" -> mostrarRanking(ranking);
                case "2" -> {
                    System.out.print("Digite o nome do jogador a adicionar/editar: ");
                    String nome = leia.nextLine();
                    System.out.print("Digite os pontos desse jogador (ou digite 'MAX'): ");
                    String input = leia.nextLine();
                    int pontos;

                    if (input.equalsIgnoreCase("MAX")) {
                        pontos = 300;
                    } else {
                        try {
                            pontos = Integer.parseInt(input);
                        } catch (NumberFormatException e) {
                            System.out.println(RED + "Pontos inválidos! Use um número inteiro ou 'MAX'." + RESET);
                            break;
                        }
                    }
                    ranking.put(nome, pontos);
                    System.out.println(GREEN + "Jogador adicionado/atualizado com sucesso!" + RESET);
                }
                case "3" -> {
                    adminContinuar = false;
                System.out.print("\033[H\033[2J");
                System.out.flush();
                }
                default -> System.out.println(RED + "Opção inválida!" + RESET);
            }
        }
    }

    private static void mostrarRanking(Map<String, Integer> ranking) {
        System.out.println(BOLD + "\nRanking Atual:" + RESET);
        int posicao = 1;
        for (Map.Entry<String, Integer> entry : ranking.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .toList()) {

            String cor;
            switch (posicao) {
                case 1 -> cor = "\u001B[33m";
                case 2 -> cor = "\u001B[37m";
                case 3 -> cor = "\u001B[31m";
                default -> cor = "\u001B[36m";
            }

            String pontos = (entry.getValue() >= 300) ? "MAX" : String.valueOf(entry.getValue());
            System.out.println(cor + posicao + "º " + entry.getKey() + " - " + pontos + " pontos" + RESET);
            posicao++;
        }
    }
}
