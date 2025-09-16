package condicionais;

import java.util.Scanner;

public class Horoscopo {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int signo;

		System.out.println("============================================");
		System.out.println("             Horóscopo do dia               ");
		System.out.println("============================================");
		System.out.println("                                            ");
		System.out.println("      1 - Capricórnio                       ");
		System.out.println("      2 - Aquário                           ");
		System.out.println("      3 - Peixes                            ");
		System.out.println("      4 - Áries                             ");
		System.out.println("      5 - Touro                             ");
		System.out.println("      6 - Gêmeos                            ");
		System.out.println("      7 - Câncer                            ");
		System.out.println("      8 - Leão                              ");
		System.out.println("      9 - Virgem                            ");
		System.out.println("      10 - Libra                            ");
		System.out.println("      11 - Escorpião                        ");
		System.out.println("      12 - Sagitário                        ");
		System.out.println("                                            ");
		System.out.println("============================================");
		System.out.println("Digite a opção desejada:                    ");
		signo = leia.nextInt();

		switch (signo) {

		case 1:
			System.out.println("Capricórnio: Trabalhe com disciplina; metas realistas e passos consistentes trarão progresso visível.");
			break;

		case 2:
		System.out.println("Aquário: Inove com colaboração — compartilhe suas ideias e ouça perspectivas diferentes para evoluir.");
			break;

		case 3:
			System.out.println("Peixes: Confie na intuição, mas mantenha os pés no chão; atenção aos detalhes evitará confusões.");
			break;

		case 4:
			System.out.println("Áries: Hoje concentre-se em ações rápidas e ponderadas — priorize uma tarefa importante e avance com confiança.");
			break;

		case 5:
			System.out.println("Touro: Evite gastos impulsivos; organize suas finanças e desfrute pequenos prazeres com moderação.");
			break;

		case 6:
			System.out.println("Gêmeos: Comunique-se com clareza — uma conversa aberta pode esclarecer mal-entendidos e abrir oportunidades.");
			break;

		case 7:
			System.out.println("Câncer: Cuide do seu bem-estar emocional; reserve tempo para descansar e fortalecer vínculos familiares.");
			break;

		case 8:
			System.out.println("Leão: Mostre suas ideias com segurança, mas escute antes de reagir — equilíbrio trará reconhecimento.");
			break;

		case 9:
			System.out.println("Virgem: Foque na organização: revisar prioridades e planejar pequenas ações aumentará sua produtividade.");
			break;

		case 10:
			System.out.println("Libra: Busque harmonia nas relações hoje — proponha um acordo justo e seja flexível nas negociações.");
			break;

		case 11:
			System.out.println("Escorpião: Intensidade pode ser positiva se bem dirigida — transforme emoções em determinação prática.");
			break;

		case 12:
			System.out.println("Sagitário: Abrace a curiosidade, mas finalize compromissos pendentes antes de começar algo novo.");
			break;
		default:
			System.out.println("Opção inválida!");
		}

		leia.close();
	}

}
