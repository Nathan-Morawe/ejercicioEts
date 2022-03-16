public class nathan {
    String tipo;
    Integer valor1;
    Integer valor2;

    /**
     * Constructor por defecto de la clase nathan
     */
    public nathan() {
    }

    /**
     * Constructor con solo un parametro de la clase
     * @param tipo de la clase para calcular el area
     */
    public nathan(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Constructor con 2 valores de la clase nathan
     * @param tipo de la clase para calcular el area
     * @param valor1 de la clase
     */
    public nathan(String tipo, Integer valor1) {
        this.tipo = tipo;
        this.valor1 = valor1;
    }

    /**
     * Constructor con 3 valores de la clase nathan
     * @param tipo de la clase para calcular el area
     * @param valor1 de la clase
     * @param valor2 de la clase
     */
    public nathan(String tipo, Integer valor1, Integer valor2) {
        this.tipo = tipo;
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
}
