package reproductormúsica;


public class Canciones{
    private String titulo;
    private double duracion;
    private String artista;
    private String album;
    private int estrellas;
    
    public Canciones(String t, double d, String at, String al){
        this.titulo = t;
        this.duracion = d;
        this.artista = at;
        this.album = al;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getEstrellas() {
        return estrellas;
    }
    

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    @Override
    public String toString() {
        return "Titulo=" + titulo + ", Duración=" + duracion + ", Artista=" + artista + ", Album=" + album;
    }
    




    

    
    
    
}
