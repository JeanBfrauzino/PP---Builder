package Builder;

public class DiretorSanduicheVegetariano {
    public Sanduiche fazerSanduiche() {
        return new Sanduiche.SanduicheBuilder()
                .pao("Integral")
                .queijo("Cheddar")
                .vegetais("Alface, Tomate, Cebola")
                .temCondimentos(true)
                .build();
    }
}
