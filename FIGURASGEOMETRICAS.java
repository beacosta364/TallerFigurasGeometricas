import java.util.Scanner;

/**
 * FIGURASGEOMETRICAS
 * Brayan Estein Acosta Achinte
 */
public class FIGURASGEOMETRICAS {
    int opcion;
    int angulo1;
    int angulo2;
    int angulo3;
    int base;
    int altura;
    float lado;
    double radio;
    

    public void SeleccionFigura() {
        System.out.println("seleccione la opcion que desee verificar solo con numeros enteros");
        System.out.println("1:círculo, 2:rectángulo, 3:cuadrado, 4:triángulo rectángulo");
        Scanner scanner = new Scanner(System.in);
        opcion=scanner.nextInt();
        
    //círculo, el rectángulo, el cuadrado y el triángulo rectángulo
    switch (opcion) {
        case 1:
            //círculo
            System.out.println("Seleccionaste la opción círculo");
            ingresarRadioCirculo();;
            calcularAreaYPerimetroCirculo();
            break;
        case 2:
            //rectángulo
            System.out.println("Seleccionaste la opción rectángulo");
            ingresarBaseYAlturaRectangulo();
            calcularAreaYPerimetroRectangulo();
            break;
        case 3:
            //cuadrado
            System.out.println("Seleccionaste la opción cuadrado");
            ingresarLado();
            calcularAreaYPerimetroCuadrado();
            break;
        case 4:
            //triángulo rectángulo
            System.out.println("Seleccionaste la opción triángulo rectángulo");
            ingresarBaseYAlturaTrianguloRectangulo();
            calcularAreaYPerimetroTrianguloRectangulo();
            determinarTipoTriangulo();
            break;
        default:
            System.out.println("Opción no válida");
    }
    }

    ////metodos para triángulo rectángulo

    public void ingresarBaseYAlturaTrianguloRectangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la base del triángulo rectángulo: ");
        base = scanner.nextInt();

        System.out.println("Ingrese la altura del triángulo rectángulo: ");
        altura = scanner.nextInt();
    }

    public void calcularAreaYPerimetroTrianguloRectangulo() {
        double area = 0.5 * base * altura;
        double hipotenusa = Math.sqrt(base * base + altura * altura);
        double perimetro = base + altura + hipotenusa;

        System.out.println("Área del triángulo rectángulo es: " + area);
        System.out.println("Perímetro del triángulo rectángulo es: " + perimetro);
        System.out.println("la hipotenusa del triángulo rectángulo es: "+ hipotenusa);
    }

    public void determinarTipoTriangulo(){
        double baseDividida = base / 2;
        if (altura * altura == baseDividida * baseDividida + altura * altura) {
            System.out.println("equilátero");
        } else if (altura * altura == baseDividida * baseDividida) {
            System.out.println("isósceles");
        } else {
            System.out.println("escaleno");
        }
    }
        ////////////////////////////////////////////////////////////////////////////////////////////////
        ///metodos para cuadrado
        public void ingresarLado() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese la longitud de un lado del cuadrado en centímetros, si tiene decimal use coma:");
            lado = scanner.nextFloat();
            scanner.close();
        }
    
        public void calcularAreaYPerimetroCuadrado() {
            double area = lado * lado;
            double perimetro = 4 * lado;
    
            System.out.println("Área del cuadrado: " + area + " cm²");
            System.out.println("Perímetro del cuadrado: " + perimetro + " cm");
        }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    ///metodos para circulo
    public void ingresarRadioCirculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo en centímetros:");
        radio = scanner.nextDouble();
        scanner.close();
    }

    public void calcularAreaYPerimetroCirculo() { 
        double PI=3.1415;    
        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;
        System.out.println("Área del circulo es : " + area );
        System.out.println("Perímetro del circulo : " + perimetro);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    ///metodos para rectángulo
    public void ingresarBaseYAlturaRectangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la base del rectángulo:");
        base = scanner.nextInt();

        System.out.println("Ingrese la altura del rectángulo:");
        altura = scanner.nextInt();
        scanner.close();
    }

    public void calcularAreaYPerimetroRectangulo() { 
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        System.out.println("Área del rectángulo es : " + area );
        System.out.println("Perímetro del rectángulo : " + perimetro);
    }


    public static void main(String[] args) {
        FIGURASGEOMETRICAS figuras = new FIGURASGEOMETRICAS();
        figuras.SeleccionFigura(); 
    }
}