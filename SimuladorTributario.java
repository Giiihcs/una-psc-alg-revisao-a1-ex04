package src;

public class SimuladorTributario {

    // ================================
    // 1️⃣ MÉTODOS ESTÁTICOS DE CÁLCULO
    // ================================

    // Calcula o imposto antigo
    public static double calcularImpostoAntigo(double valorFaturamento, int aliquotaBase) {
        return valorFaturamento * (aliquotaBase / 100.0);
    }

    // Calcula o imposto proposto
    public static double calcularImpostoProposto(double valorFaturamento, int aliquotaProposta) {
        return valorFaturamento * (aliquotaProposta / 100.0);
    }

    // Calcula a diferença entre os dois impostos
    public static double calcularDiferenca(double impostoAntigo, double impostoProposto) {
        return Math.abs(impostoProposto - impostoAntigo);
    }

    // =====================================
    // 2️⃣ MÉTODO NÃO ESTÁTICO SEM RETORNO
    // =====================================
    public void statusDialogo(boolean acessoAoGoverno) {
        if (acessoAoGoverno) {
            System.out.println("STATUS: Diálogo aberto. Há espaço para negociação.");
        } else {
            System.out.println("STATUS: Fintechs reclamam de falta de acesso ao governo. Risco de derrota política.");
        }
    }

    // ================================
    // 3️⃣ MÉTODO PRINCIPAL (MAIN)
    // ================================
    public static void main(String[] args) {

        // 1. Definição do faturamento
        double faturamento = 50_000_000.00;
        int aliquotaAntiga = 6;  // Exemplo de alíquota antiga

        System.out.println("===== SIMULADOR TRIBUTÁRIO =====");
        System.out.println("Faturamento considerado: R$ " + faturamento);
        System.out.println();

        // 2. Simulação para proposta de elevação de 9%
        int aliquotaProposta1 = 9;
        double impostoAntigo1 = calcularImpostoAntigo(faturamento, aliquotaAntiga);
        double impostoProposto1 = calcularImpostoProposto(faturamento, aliquotaProposta1);
        double diferenca1 = calcularDiferenca(impostoAntigo1, impostoProposto1);

        System.out.println("📊 Proposta com alíquota de " + aliquotaProposta1 + "%:");
        System.out.println("Imposto antigo: R$ " + impostoAntigo1);
        System.out.println("Imposto proposto: R$ " + impostoProposto1);
        System.out.println("Diferença: R$ " + diferenca1);
        System.out.println();

        // 3. Simulação para proposta de elevação de 15%
        int aliquotaProposta2 = 15;
        double impostoAntigo2 = calcularImpostoAntigo(faturamento, aliquotaAntiga);
        double impostoProposto2 = calcularImpostoProposto(faturamento, aliquotaProposta2);
        double diferenca2 = calcularDiferenca(impostoAntigo2, impostoProposto2);

        System.out.println("📊 Proposta com alíquota de " + aliquotaProposta2 + "%:");
        System.out.println("Imposto antigo: R$ " + impostoAntigo2);
        System.out.println("Imposto proposto: R$ " + impostoProposto2);
        System.out.println("Diferença: R$ " + diferenca2);
        System.out.println();

        // 4. Instanciação da classe e chamadas ao método statusDialogo
        SimuladorTributario simulador = new SimuladorTributario();
        System.out.println("===== ANÁLISE DE DIÁLOGO POLÍTICO =====");
        simulador.statusDialogo(true);
        simulador.statusDialogo(false);
    }
}