package domain;

public class Coche {
    private String matricula;
    private String marca;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    private String modelo;
    private String potencia;

    public Coche(){

    }

    public Coche(String matricula, String marca, String modelo, String potencia, int velocidadMaxima) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.velocidadMaxima = velocidadMaxima;
    }

    private int velocidadMaxima;

    public static class  Chasis{
        String material;

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public int getPeso() {
            return peso;
        }

        public void setPeso(int peso) {
            this.peso = peso;
        }

        int peso;

        public Chasis() {
            this.material = material;
            this.peso = peso;
        }
    }
    public static class rueda{
        int medida;
        String tipo;

        public rueda() {

        }

        public int getMedida() {
            return medida;
        }

        public void setMedida(int medida) {
            this.medida = medida;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public rueda(int medida, String tipo, String marca, String modelo) {
            this.medida = medida;
            this.tipo = tipo;
            this.marca = marca;
            this.modelo = modelo;
        }

        String marca;
        String modelo;

    }

}
