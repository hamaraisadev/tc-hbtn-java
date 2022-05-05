package encapsulamento;

public class Program2 {
    public static void main(String[] args) {
        PersonagemGame1 personagem1 = new PersonagemGame1();

        personagem1.setNome("Sonic");
        personagem1.setSaudeAtual(10);

        System.out.printf("Nome: %s - Saude: %d\n", personagem1.getNome(), personagem1.getSaudeAtual());
    }
}

