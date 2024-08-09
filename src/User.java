public class User {
    public static void main(String[] args) {
        PersonagemJogo personagem1 = new PersonagemJogo("Alex", 1.65f, 65f, "Parda", "Espada" );
        PersonagemJogo personagem2 = new PersonagemJogo("Ana", 1.62f, 58f, "Branca", "Lança");

        personagem1.atacar();
        personagem2.atacar();
        personagem1.correr();
        personagem1.atacar();
        personagem2.correr();
        personagem2.correr();
    }
}
