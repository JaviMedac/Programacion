package refactorizacion;

/**
 *
 * @author Jorge Martínez
 */
public class ClassA {

    /**
     * @return the atributo1
     */
    public int getAtributo1() {
        return atributo1;
    }

    /**
     * @param atributo1 the atributo1 to set
     */
    public void setAtributo1(int atributo1) {
        this.atributo1 = atributo1;
    }

    /**
     * @return the atributo2
     */
    public String getAtributo2() {
        return atributo2;
    }

    /**
     * @param atributo2 the atributo2 to set
     */
    public void setAtributo2(String atributo2) {
        this.atributo2 = atributo2;
    }

    /**
     * @return the atributo3
     */
    public float getAtributo3() {
        return atributo3;
    }

    /**
     * @param atributo3 the atributo3 to set
     */
    public void setAtributo3(float atributo3) {
        this.atributo3 = atributo3;
    }

    private int atributo1;
    private String atributo2;
    private float atributo3;

    public int metodo1(int par0) {
        int a = 0;
        int b = 10;
        return a + b;
    }

    public int metodo2() {
        int a = 110;
        int b = 10;
        return a - b;
    }

    public void metodo3() {
        int valor = metodo2();
        NuevoMetodo();
    }

    private void NuevoMetodo() {
        System.out.println("Estamos en metodo 3");
        System.out.println("Esto es una prueba");
    }

    public int metodo5(int num1) {
        return num1;
    }

}
