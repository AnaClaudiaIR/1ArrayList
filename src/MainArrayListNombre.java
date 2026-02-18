
import java.util.ArrayList;
import java.util.List;

    public class MainArrayListNombre{
        public static void main(String[] args) {
            //1. Creación de la lista
            List<String> lista = new ArrayList<>();

            //2. Añadir elementos
            lista.add("Elemento1");
            lista.add("Elemento2");
            lista.add("Elemento2");

            lista.add(3,"Elemento3");
            lista.add(4,"Elemento4");

            //3. Mostrar elementos de la lista
            for (String elemento:lista){
                System.out.println(elemento);
            }

            //4. Eliminar elementos de la lista
            lista.remove(4);
            lista.remove("Elemento1");

            System.out.println("-----------------------------");
            for (String elemento:lista){
                System.out.println(elemento);
            }
        }
    }

