package banco;

public class Banco {

    public static void main(String[] args) {
        String nombre = "Antonio";
        Cuenta c;
        String[] valores = {"`1000", " -2500", "100"};
        try {
            c = new Cuenta(nombre, 25, 1000);
            System.out.println("Estado: " + c.toString());
            procesarMovimientos(c, valores);
            System.out.println("Estado: " + c.toString());
        } catch (CuentaException e) {  //CAPTURA CUALQUIER EXCEPCIÓN RELACIONADA
            System.out.println("Error: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {  // ERROR DE ACCESO CON INDICE FUERA
            System.out.println("Error: no hay argumentos suficientes al programa");
        } catch (NumberFormatException e) {  // ERROR DE CONVERSIÓN NUMÉRICA
            System.out.println("Error de formato numerico: " + e.getMessage());
        } catch (Exception e) {  // CAPTURA CUALQUIER EXCEPCIÓN
            System.out.println("Error inesperado");
            e.printStackTrace();
        } finally {  //SE IMPRIME SIEMPRE
            System.out.println("Fin de programa");
        }
    }

    public static void procesarMovimientos(Cuenta c, String[] movs) throws SaldoInsuficienteException {
        for (int i = 0; i < movs.length; i++) {
            c.movimiento(Double.parseDouble(movs[i]));
        }
    }

}
