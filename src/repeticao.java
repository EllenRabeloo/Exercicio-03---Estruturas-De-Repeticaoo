import java.util.Scanner;

public class repeticao {
     static void main(String[] args) {
        //algoritmo01();
        //algoritmo02();
        //algoritmo03();
        //algoritmo04();
        //algoritmo05();
        //algoritmo06();
        //algoritmo07();
        //algoritmo08();
        //algoritmo09();
        //algoritmo10();
        //algoritmo11();
        algoritmo12();
    }

//========================================================================================================================

    private static void algoritmo01() {
        Scanner scanner = new Scanner(System.in);

        //variaveis
        int n1;
        int n2;
        int operacao;
        int continuar = 1;


        //condicao de funcionamento
        while (continuar == 1) {

            //insercao de numeros pelo usuario
            System.out.println("Primeiro número: ");
            n1 = scanner.nextInt();
            System.out.println("Segundo número: ");
            n2 = scanner.nextInt();

            //menu de operacoes
            System.out.println("""
                    ========== Selecione a Operação ========== +
                    [1] - Adição
                    [2] - Subtração
                    [3] - Multiplicação
                    [4] - Divisão
                    ===========================================""");
            operacao = scanner.nextInt();

            //respostas ao comando do usuario
            switch (operacao) {
                case 1:
                    double soma = n1 + n2;
                    System.out.println(n1 + " + " + n2 + " = " + soma);
                    break;
                case 2:
                    double subtracao = n1 - n2;
                    System.out.println(n1 + " - " + n2 + " = " + subtracao);
                    break;
                case 3:
                    double produto = n1 * n2;
                    System.out.println(n1 + " x " + n2 + " = " + produto);
                    break;
                case 4:
                    int divisao = n1 / n2;
                    System.out.println(n1 + " / " + n2 + " = " + divisao);
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }

            //novos valores ou encerrar o programa
            System.out.println("""
                    
                    [1] Inserir novos valores
                    [2] Encerrar o programa
                    """);
            continuar = scanner.nextInt();
        }

        scanner.close();

    }

//========================================================================================================================

    private static void algoritmo02() {

        //variaveis
        int contador;
        double soma = 0;

        //somando numeros impares e multiplos de tres
        for (contador = 1; contador <= 500; contador++) {
            if (contador % 2 != 0 && contador % 3 == 0) {
                soma += contador;
            }
        }

        System.out.println("A soma dos números ímpares e múltiplos de três, de 1 a 500 é: " + soma);

    }

//========================================================================================================================

    private static void algoritmo03() {
        Scanner scanner = new Scanner(System.in);

        //variaveis
        int numFuncionario = 1;
        int meses = 1;
        int pessoas = 0;
        int maiorMes = 0;
        int menorMes = 0;
        int funcAntigo = 0;
        int funcRecente = 0;

        while (numFuncionario != 0 && meses > 0 && pessoas <= 300) {
            System.out.println("Informe o número do funcionário: ");
            numFuncionario = scanner.nextInt();

            System.out.println("Informe a quantidade de meses de trabalho: ");
            meses = scanner.nextInt();

            //condicao pra nao contar a pessoa mesmo se ela for sair
            if (numFuncionario != 0 && meses > 0) {
                pessoas += 1;
            }

            //maior e menor mes, funcionario mais recente e mais antigo
            if (pessoas == 1) {
                maiorMes = meses;
                menorMes = meses;
                funcAntigo = numFuncionario;
                funcRecente = numFuncionario;
            }
            else {
                if (meses > maiorMes) {
                    maiorMes = meses;
                    funcAntigo = numFuncionario;
                }
                if (meses < menorMes && meses != 0) {
                    menorMes = meses;
                    funcRecente = numFuncionario;
                }
            }
        }

        //nao imprimir funcionario 0 e meses 0
        if (pessoas > 0) {
            System.out.printf("""
                    Funcionário mais antigo: %d com %d meses trabalhado(s)
                    Funcionário mais recente: %d com %d meses trabalhado(s)
                    """, funcAntigo, maiorMes, funcRecente, menorMes);
        }

        scanner.close();

    }

//========================================================================================================================

    private static void algoritmo04() {
        Scanner scanner = new Scanner(System.in);

        //variaveis
        int contador;
        double altura;
        double mediaMulheres;
        String sexo;
        String sexoMaiorAltura = " ";
        double menorAltura = 0;
        double maiorAltura = 0;
        double soma = 0;
        int contadorHomens = 0;
        int contadorMulheres = 0;



        for (contador = 1; contador <= 15; contador++) {
            //sexo do usuario
            System.out.println("Informe seu sexo [M/F]: ");
            sexo = scanner.next();

            //restricao de letras, o ignore case ignora as letras maiusculas ou minusculas
            while (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
                System.out.println("Sexo Inválido!");
                System.out.println("Informe seu sexo [M/F]: ");
                sexo = scanner.next();
            }

            //altura do usuario
            System.out.println("Informe sua altura em metros: ");
            altura = scanner.nextDouble();

            //se sexo feminino
            if (sexo.equalsIgnoreCase("f")) {
                soma += altura;
                contadorMulheres += 1;
            }
            //se sexo masculino
            else {
                contadorHomens += 1;
            }

            //menor e maior altura e sexo
            if (contador == 1) {
                menorAltura = altura;
                maiorAltura = altura;
                sexoMaiorAltura = sexo;
            }
            else {
                if (altura < menorAltura) {
                    menorAltura = altura;
                }
                if (altura > maiorAltura) {
                    maiorAltura = altura;
                    sexoMaiorAltura = sexo;
                }
            }
        }

        mediaMulheres = soma / contadorMulheres;
        System.out.printf("""
                A menor altura do grupo é: %.2f metros
                A média de altura das mulheres é: %.2f metros
                O número de homens é: %d homens
                O sexo da pessoa com maior altura é: %s
                """, menorAltura, mediaMulheres, contadorHomens, sexoMaiorAltura.toUpperCase());
                //procurei uma forma de colocar as palavras em um bloco de impressao só e achei o printf

        scanner.close();

    }

//========================================================================================================================

    private static void algoritmo05() {
        Scanner scanner = new Scanner(System.in);

        //variaveis
        double salario;
        int filhos;
        double mediaSalario;
        double mediaFilhos;
        double percentual250;
        int pessoas = 0;
        double somaSalario = 0;
        int somaFilhos = 0;
        double maiorSalario = 0;
        int salario250 = 0;


        do {
            //dados e validacao salario
            System.out.println("Informe o salário (ou valor negativo para encerramento): R$ ");
            salario = scanner.nextDouble();

            if (salario >= 0) {
                //contador de pessoas e soma do salario
                pessoas += 1;
                somaSalario += salario;

                //maior salario
                if (pessoas == 1) {
                    maiorSalario = salario;
                } else {
                    if (salario > maiorSalario) {
                        maiorSalario = salario;
                    }
                }

                //pessoas com salario ate 250
                if (salario <= 250) {
                    salario250 += 1;
                }

                //dados filhos
                System.out.println("Informe o número de filhos: ");
                filhos = scanner.nextInt();

                //soma de filhos
                somaFilhos += filhos;
            }
        } while (salario >= 0);


        //caso a pessoa pare no começo nao roda isso
        if (pessoas > 0) {
            //medias
            mediaSalario = somaSalario / pessoas;
            mediaFilhos = (double) somaFilhos / pessoas;
            //adicionei o double para nao ignorar os decimais
            percentual250 = ((double)salario250 / pessoas) * 100;

            System.out.printf("""
                    A média do salário da população é de R$%.2f
                    A média do número de filhos é de %.2f individuos
                    O maior salário é de R$ %.2f
                    O percentual de pessoas com salário até R$250,00 é %.2f%%
                    """, mediaSalario, mediaFilhos, maiorSalario, percentual250);
        }

        scanner.close();

    }

//========================================================================================================================

    private static void algoritmo06() {
        Scanner scanner = new Scanner(System.in);

        //variaveis
        int positivos = 0;
        int negativos = 0;
        int totalValores = 0;
        double soma = 0;
        double valores;
        double media;
        double percPositivo;
        double percNegativo;

        //nao tinha condicao de parada, e pra nao ficar perguntado toda hora se deseja continuar eu considerei o 0 flag
        while (true) {
            System.out.println("Informe o valor a ser calculado ([0] para parar): ");
            valores = scanner.nextDouble();

            if (valores == 0) {
                break;
            }
            //soma e calcula a quantidade de numeros, condicao pro 0 da parada nao entrar na conta
            else {
                totalValores += 1;
                soma += valores;

                //seleciona positivos e negativos
                if (valores > 0) {
                    positivos += 1;
                }
                else {
                    negativos += 1;
                }
            }

        }

        //calculo da media e percentuais, adicionei o double pra nao ignorar os decimais
        media = soma / totalValores;
        percPositivo = ((double) positivos / totalValores) * 100;
        percNegativo = ((double) negativos / totalValores) * 100;


        //evitar erro de divisao que tava dando ao inserir zero no cmc
        if (totalValores > 0) {
            System.out.printf("""
                    Média aritmética dos valores lidos: %.2f
                    Quantidade de valores positivos: %d
                    Quantidade de valores negativos: %d
                    Percentual de valores positivos: %.2f%%
                    Percentual de valores negativos: %.2f%%
                    """, media, positivos, negativos, percPositivo, percNegativo);
        }

        scanner.close();

    }

// =======================================================================================================================

    private static void algoritmo07() {
        Scanner scanner = new Scanner(System.in);

        //variaveis
        int contador;
        int valores;
        double media;
        int totalValores = 0;
        int soma = 0;


        for (contador = 1; contador <= 75; contador++) {
            System.out.println("Informe os valores inteiros a serem calculados: ");
            valores = scanner.nextInt();

            //condicao de positivos
            while (valores < 0) {
                System.out.println("Apenas números positivos!");
                System.out.println("Informe os valores a serem calculados: ");
                valores = scanner.nextInt();
            }

            //soma e total de valores
            soma += valores;
            totalValores += 1;
        }

        //fazendo nao ignorar os decimais na conta
        media = (double) soma / totalValores;

        System.out.println("Foram lidos " + totalValores + " números, sua média aritmética é " + media);

        scanner.close();

    }

// =======================================================================================================================

    private static void algoritmo08() {
        Scanner scanner = new Scanner(System.in);

        //variaveis
        String nome;
        int sexo;
        int contador;
        double altura;
        String nomeMaiorAltura = " ";
        String nomeMenorAltura = " ";
        int mulheres = 0;
        int homens = 0;
        double menorAltura = 0;
        double maiorAltura = 0;
        double somaAlturaHomens = 0;
        double somaAlturaMulheres = 0;
        double somaAlturaTurma = 0;
        double mediaAlturaMulheres = 0;
        double mediaAlturaHomens = 0;
        double mediaAlturaTurma = 0;


        for (contador = 1; contador <= 15; contador++) {
            //entrada de dados
            System.out.println("Informe seu nome: ");
            nome = scanner.next();

            System.out.println("Informe sua altura: ");
            altura = scanner.nextDouble();
            //soma da altura geral
            somaAlturaTurma += altura;


            //maior e menor altura
            if (contador == 1) {
                maiorAltura = altura;
                menorAltura = altura;
                nomeMaiorAltura = nome;
                nomeMenorAltura = nome;
            }
            else {
                if (altura > maiorAltura) {
                    maiorAltura = altura;
                    nomeMaiorAltura = nome;
                }
                if (altura < menorAltura) {
                    menorAltura = altura;
                    nomeMenorAltura = nome;
                }
            }

            //separacao de sexos
            do {
                System.out.print("""
                        Informe seu sexo:
                        [1] Masculino
                        [2] Feminino
                        """);
                sexo = scanner.nextInt();

            } while (sexo != 1 && sexo != 2);

            if (sexo == 1) {
                somaAlturaHomens += altura;
                homens += 1;
            }
            else {
                somaAlturaMulheres += altura;
                mulheres += 1;
            }
        }

        //medias evitando divisao por 0;
        if (mulheres > 0) {
            mediaAlturaMulheres = somaAlturaMulheres / mulheres;
        }
        if (homens > 0) {
            mediaAlturaHomens = somaAlturaHomens / homens;
        }
        mediaAlturaTurma = somaAlturaTurma / contador;


        System.out.printf("""
                Maior altura da turma: %s, com %.2f cm
                Menor altura da turma: %s, com %.2f cm
                Média de altura das mulheres: %.2f cm
                Média de altura dos homens: %.2f cm
                Média de altura da turma: %.2f cm
                """, nomeMaiorAltura, maiorAltura, nomeMenorAltura, menorAltura, mediaAlturaMulheres, mediaAlturaHomens, mediaAlturaTurma);

        scanner.close();
    }

// =======================================================================================================================

    private static void algoritmo09() {
        Scanner scanner = new Scanner(System.in);

        //variaveis
        int n;
        int contador;
        double nota;
        double maiorNota = 0;
        double menorNota = 0;

        //informando o numero n de alunos
        System.out.println("Informe o número de alunos na turma: ");
        n = scanner.nextInt();

        for (contador = 1; contador <= n; contador++) {
            System.out.println("Informe sua nota: ");
            nota = scanner.nextDouble();

            //validacao de min e max
            while (nota < 0 || nota > 15) {
                System.out.println("As notas vão de 0 a 15!");
                System.out.println("Informe sua nota: ");
                nota = scanner.nextDouble();
            }

            //maior e menor nota
            if (contador == 1) {
                maiorNota = nota;
                menorNota = nota;
            }
            else {
                if (nota > maiorNota) {
                    maiorNota = nota;
                }
                if (nota < menorNota) {
                    menorNota = nota;
                }
            }
        }

        System.out.printf("""
                A maior nota da turma foi: %.2f
                A menor nota da turma foi: %.2f
                """, maiorNota, menorNota);

        scanner.close();

    }
// =======================================================================================================================

    private static void algoritmo10() {

        //variaveis
        double centimetros = 0;
        int polegada = 0;
        double resultado;

        //fazendo um titulo so pra organizar
        System.out.println("========== Tabela de Conversão ============");

        for (polegada = 1; polegada <= 20; polegada++) {
                centimetros = polegada * 2.54;

                System.out.println(polegada + " polegada = " + centimetros + " centimetros");

        }

    }

// =======================================================================================================================

    private static void algoritmo11() {
         Scanner scanner = new Scanner(System.in);

        //variaveis
        int minimo;
        int maximo;
        int contador;
        double soma = 0;

        do {
            System.out.println("Informe o limite mínimo: ");
            minimo = scanner.nextInt();

            System.out.println("Informe o limite máximo: ");
            maximo = scanner.nextInt();

            if (minimo < 0 || maximo < 0) {
                System.out.println("Apenas números inteiros e positivos!");
            } else if (minimo > maximo) {
                System.out.println("O limite mínimo não pode ser maior que o máximo!");
            }
            //validacao pra nao aceitar numeros negativos e nao deixar o minimo ser maior que o maximo

        } while (maximo < 0 || minimo < 0 || minimo > maximo);


        for (contador = minimo; contador <= maximo; contador++) {
            if (contador % 2 == 0) {
                soma += contador;
            }
        }

        System.out.println("No intervalo definido a soma dos números pares é " + soma);

        scanner.close();

    }

// =======================================================================================================================

    public static void algoritmo12() {
         Scanner scanner = new Scanner(System.in);

        //variaveis
        int contador;
        int matricula;
        double nota;
        double maiorNota = 0;
        double segundaMaior = 0;
        int matriculaMaior = 0;
        int matriculaSegundaMaior = 0;

        for (contador = 1; contador <= 100; contador++) {
            System.out.println("Informe o número da matricula: ");
            matricula = scanner.nextInt();

            System.out.println("Informe sua nota: ");
            nota = scanner.nextDouble();

            if (contador == 1) {
                maiorNota = nota;
                segundaMaior = nota;
                matriculaMaior = matricula;
                matriculaSegundaMaior = matricula;
            }
            else {
                if (nota > maiorNota) {
                    //fazendo a maior nota virar a segunda maior caso perder o cargo de primeira
                    segundaMaior = maiorNota;
                    matriculaSegundaMaior = matriculaMaior;

                    //atualizando a nova maior
                    maiorNota = nota;
                    matriculaMaior = matricula;
                }
                else if (nota > segundaMaior) {
                    segundaMaior = nota;
                    matriculaSegundaMaior = matricula;

                }
            }
        }

        System.out.printf("""
                Maior nota = %.2f, obtida pelo número de matrícula %d
                Segunda maior nota = %.2f, obtida pelo número de matrícula %d
                """, maiorNota, matriculaMaior, segundaMaior, matriculaSegundaMaior);

        scanner.close();
    }
}

