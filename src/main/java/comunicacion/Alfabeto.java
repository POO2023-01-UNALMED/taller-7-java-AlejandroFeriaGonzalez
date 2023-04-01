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
        for (int i = 0; i < letras.length; i++) {
            if (i != letras.length - 1) {
                alfabeto += letras[i] + ", ";
            } else {
                alfabeto += letras[i];
            }
        }

        return alfabeto;
    }

        return alfabeto;
    }
}
