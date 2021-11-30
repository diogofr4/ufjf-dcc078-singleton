import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Pizza {
    private String tamanho;
    private String borda;
    private boolean queijo;
    private boolean lombo;
    private boolean manjericao;
    private boolean catupiry;

    public static class Builder {
        private String tamanho;
        private String borda;
        private boolean queijo;
        private boolean lombo;
        private boolean manjericao;
        private boolean catupiry;

        public Builder(String tamanho, String borda) {
            this.tamanho = tamanho;
            this.borda = borda;
        }
        public Builder queijoAdicional(boolean queijo) {
            this.queijo = queijo;
            return this;
        }
        public Builder lomboAdicional(boolean lombo) {
            this.lombo = lombo;
            return this;
        }
        public Builder manjericaoAdicional(boolean manjericao) {
            this.manjericao = manjericao;
            return this;
        }
        public Builder catupiryAdicional(boolean catupiry) {
            this.catupiry = catupiry;
            return this;
        }
        public Pizza build() {
            return new Pizza(this);
        }
    }

    private Pizza(Builder builder) {
        this.tamanho = builder.tamanho;
        this.borda = builder.borda;
        this.queijo = builder.queijo;
        this.lombo = builder.lombo;
        this.manjericao = builder.manjericao;
        this.catupiry = builder.catupiry;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getBorda() {
        return borda;
    }

    public boolean temQueijo() {
        return queijo;
    }

    public boolean temLombo() {
        return lombo;
    }

    public boolean temManjericao() {
        return manjericao;
    }

    public boolean temCatupiry() {
        return catupiry;
    }
}

