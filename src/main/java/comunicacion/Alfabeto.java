package comunicacion;

public class Alfabeto extends Pictograma {

    private static String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras ,String interpretacion) {
        super(origen);
        Alfabeto.letras = letras;
        this.interpretacion = interpretacion;
    }

    public int cantidadLetras() {
        return letras.length;
    }

    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        String alfabeto = "";
        for (String letra : letras) {
            alfabeto += letra + ", ";
        }

        return alfabeto;
    }
}
