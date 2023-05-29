package Animais;

public abstract class Animal {
        protected String nome;
        protected String cor;
        protected String estadoDeEspirito;
        protected int altura;
        protected double peso;
        public Animal(String nome, String cor, double peso) {
                this.nome = nome;
                this.cor = cor;
                this.peso = peso;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getCor() {
                return cor;
        }

        public void setCor(String cor) {
                this.cor = cor;
        }

        public String getEstadoDeEspirito() {
                return estadoDeEspirito;
        }

        public void setEstadoDeEspirito(String estadoDeEspirito) {
                this.estadoDeEspirito = estadoDeEspirito;
        }

        public int getAltura() {
                return altura;
        }

        public void setAltura(int altura) {
                this.altura = altura;
        }

        public double getPeso() {
                return peso;
        }

        public void setPeso(double peso) {
                this.peso = peso;
        }

        //METODS
        protected void comer(){}
        protected void dormir(){}
        protected abstract void soar();
}