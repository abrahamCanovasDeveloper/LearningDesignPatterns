package creationalPatterns.singleton;

/**
 * Clase Singleton
 */
public class MyUniqueEntityClass {
    private static MyUniqueEntityClass instance;
    public String value;

    /*
     * Constructor privado, para controlar la creación de las instancias con el metodo publico getInstance()
     */
    private MyUniqueEntityClass(String name) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = name;
    }

    /**
     * Comprueba si existe una instancia ya creada de la clase
     * Devuelve la instancia cuando no existe
     * @param value
     * @return
     */
    public static MyUniqueEntityClass getInstance(String value) {
        if (instance == null) {
            instance = new MyUniqueEntityClass(value);
        }
        return instance;
    }
}
