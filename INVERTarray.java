import java.util.Scanner;
/* Rony Gustavo Molina Hernandez 
 * 1M7-S
 * carnet: 2024- 1679U
 */
        public class INVERTarray {
        
            public static int[] arreglo;
            public static int tasmanio = 0;
            public static Scanner leer = new Scanner(System.in);
        
            public static void main(String[] args) throws Exception {
        
                boolean condicionSalida = true;
        
                do {
        
                    try {
        
                        System.out.println("Ingrese el tamaño del arreglo que no supere los 16 y sea mayor a 1 y que tampoco sea negativo ");
                        tasmanio = leer.nextInt();
                        condicionSalida = (tasmanio >= 2 && tasmanio <= 15) ? false : true;
        
                    } catch (Exception e) {
                        System.out.println(e);
                        System.out.println("Ocurrió algo, revisar");
                        leer.nextLine();
                    }
        
                } while (condicionSalida);
        
                //recibimos el array del metodo
                int array[] = REPRESENT();
        
                System.out.println("este es el arreglo normal");
        
                Mostrar(array);



                inversMostrar(array);
        
            }
             public static void Mostrar(int[] a) {
        
                for (int i : a) {
                    System.out.println(i);
                }
           
                System.out.println("aqui se presenta el metodo inverso");
            }
            
            public static int[] REPRESENT() {
        
                int[] arreglo = new int[tasmanio];
        
                for (int i = 0; i < arreglo.length; i++) {
                    System.out.println("ingrese el valor [" + (i) + "]");
                    arreglo[i] = leer.nextInt();
                }
        
                return arreglo;
            }
        
            //metodo inverso
            public static void inversMostrar(int[] x){
            for (int j = x.length - 1; j >= 0 ; j--) {
                System.out.println(x[j]);
            }
            }
            //los voy a apalzar a todos
           //regale puntos por procedimiento profe
    }

