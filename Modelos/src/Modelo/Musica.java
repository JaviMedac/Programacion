package Modelo;


public class Musica {

    private String titulo;
    private String album;
    private String artista;
    private String duracion;

    public Musica(String titulo, String album, String artista, String duracion) {
        this.titulo = titulo;
        this.album = album;
        this.artista = artista;
        this.duracion = duracion;
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Musica{" + "titulo=" + titulo + ", album=" + album + ", artista=" + artista + ", duracion=" + duracion + '}';
    }

}
