package Builder;
public class Sanduiche {
    private String pao;
    private String carne;
    private String queijo;
    private String vegetais;
    private boolean temCondimentos;

    // Construtor privado
    private Sanduiche(SanduicheBuilder builder) {
        this.pao = builder.pao;
        this.carne = builder.carne;
        this.queijo = builder.queijo;
        this.vegetais = builder.vegetais;
        this.temCondimentos = builder.temCondimentos;
    }

    @Override
    public String toString() {
        return "Sanduiche{" +
                "pao='" + pao + '\'' +
                ", carne='" + carne + '\'' +
                ", queijo='" + queijo + '\'' +
                ", vegetais='" + vegetais + '\'' +
                ", temCondimentos=" + temCondimentos +
                '}';
    }

    public static class SanduicheBuilder {
        private String pao;
        private String carne;
        private String queijo;
        private String vegetais;
        private boolean temCondimentos;

        public SanduicheBuilder pao(String pao) {
            this.pao = pao;
            return this;
        }

        public SanduicheBuilder carne(String carne) {
            this.carne = carne;
            return this;
        }

        public SanduicheBuilder queijo(String queijo) {
            this.queijo = queijo;
            return this;
        }

        public SanduicheBuilder vegetais(String vegetais) {
            this.vegetais = vegetais;
            return this;
        }

        public SanduicheBuilder temCondimentos(boolean temCondimentos) {
            this.temCondimentos = temCondimentos;
            return this;
        }

        public Sanduiche build() {
            return new Sanduiche(this);
        }
    }
}
