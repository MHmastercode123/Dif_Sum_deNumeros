import java.util.Scanner;

public class  Numerostarea  { 
//RONY GUSTAVO MOLINA HERNANDEZ 
//CARNET 2024-1679U 1m7-s
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Solicitar al usuario ingresar tres números enteros diferentes
            System.out.println("Ingrese el primer número entero:");
            int num1 = scanner.nextInt();
    
            System.out.println("Ingrese el segundo número entero:");
            int num2 = scanner.nextInt();
    
            System.out.println("Ingrese el tercer número entero:");
            int num3 = scanner.nextInt();
    
            // Calcular la suma de los dos números más pequeños
            int sumaMenores = sumaDosMenores(num1, num2, num3);
    
            // Calcular la diferencia entre los dos números más grandes
            int diferenciaMayores = diferenciaDosMayores(num1, num2, num3);
    
            // Encontrar cuál de los tres números es el mayor
            int mayor = encontrarMayor(num1, num2, num3);
    
            // Mostrar resultados por pantalla
            System.out.println("La suma de los dos números más pequeños es: " + sumaMenores);
            System.out.println("La diferencia entre los dos números más grandes es: " + diferenciaMayores);
            System.out.println("El mayor de los tres números es: " + mayor);
        }
    
        // Método para encontrar la suma de los dos números más pequeños
        public static int sumaDosMenores(int a, int b, int c) {
            int min1 = Math.min(a, b);
            int min2 = Math.min(Math.max(a, b), c);
            return min1 + min2;
        }
    
        // Método para encontrar la diferencia entre los dos números más grandes
        public static int diferenciaDosMayores(int a, int b, int c) {
            int max1 = Math.max(a, b);
            int max2 = Math.max(Math.min(a, b), c);
            return max1 - max2;
        }
    
        // Método para encontrar el mayor de los tres números
        public static int encontrarMayor(int a, int b, int c) {
            return Math.max(Math.max(a, b), c);
        }
    }

        
       
      


      
      
