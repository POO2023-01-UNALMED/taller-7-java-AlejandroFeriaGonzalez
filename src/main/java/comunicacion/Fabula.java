package comunicacion;

public class Fabula extends Escrito {
    private String ensenanza, interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return palabrasPagina * this.getPaginas() * 1;
    }

    @Override
    public String interpretacion() {
        return getOrigen() + "\n" +
                getTitulo() + "\n" +
                getAutor() + "\n" +
                getPaginas() + "\n" +
                getEnsenanza();
    }

    @Override
    public String toString() {
        return null;
    }

    // *getter y setters */
    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}
