package Builder;

public class DiretorSanduicheCarnivoro {
    public Sanduiche fazerSanduiche() {
        return new Sanduiche.SanduicheBuilder()
                .pao("Italiano")
                .carne("Presunto, Peru, Bacon")
                .queijo("Provolone")
                .vegetais("Alface, Tomate")
                .temCondimentos(true)
                .build();
    }
}
