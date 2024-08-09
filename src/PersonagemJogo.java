public class PersonagemJogo {
    public String nome;
    public float altura;
    public float peso;
    public String corPele;
    public String temperamento;
    public int agilidade;
    public int forca;
    public String arma;
    public int velocidade = 0;

    //Construtor
    public PersonagemJogo(String nome, float altura, float peso, String corPele, String arma) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.corPele = corPele;
        this.arma = arma;
    }

    public PersonagemJogo() {
    }

    //Métodos

    public void atacar() {
        System.out.println("Ataque de " + nome + " com " + arma);
    }

    public void correr() {
        velocidade++;
        System.out.println("Velocidade atual de "+nome+": " + velocidade);
    }

    public void pular() {
        System.out.println("Pulou");
    }

    public void desviar() {
        System.out.println("Desviou");
    }

}
