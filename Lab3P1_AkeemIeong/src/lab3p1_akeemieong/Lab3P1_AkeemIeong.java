package lab3p1_akeemieong;

import java.util.Scanner;

public class Lab3P1_AkeemIeong {

    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    int opcion;
    do{
        System.out.println("1<-Diptongo");
        System.out.println("2<-Sumatoria Pi");
        System.out.println("3<-Time Clock");
        System.out.println("4<-Salir del programa");
        opcion=leer.nextInt();
        switch (opcion){
            case 1:
                String palabra;
                    System.out.println("Ingrese una palabra: ");
                    palabra=leer.next().toLowerCase();
                   for (int i = 0; i < palabra.length(); i++) {
                       char letra=palabra.charAt(i);
                       for (int j = i+1; j < palabra.length(); j++) {
                           char letra1=palabra.charAt(j);
                           if (letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'&&letra1=='a'||letra1=='e'||letra1=='i'||letra1=='o'||letra1=='u'){
                        System.out.println("La palabra es un diptongo");
                    }
                    else 
                        System.out.println("La palabra no es un diptongo");
                       }
                }
                    
                break;
            case 2:
                int limite;
                System.out.println("Ingrese un numero limite: ");
                limite=leer.nextInt();
                if (limite>0){
                    double over=0,down=0,result=0,sumatoria=0,finale=0;
                    for(int i=0;i<limite;i++){
                        over=Math.pow(-1, i);
                        down=2*i+1;
                        result=over/down;
                        sumatoria=sumatoria+result;
                    }
                    finale=sumatoria*4;
                    System.out.println("Resultado: "+finale);
                }
                break;
            case 3:
                int impar,conta=1;
                System.out.println("Ingrese un tamano impar: ");
                impar=leer.nextInt();
       
                    if (impar%2==1){
                        int var=0;
                        var=impar;
                        for (int q=0;q<=impar/2;q++){
                            
                            for (int e=0;e<conta;e++){
                                System.out.print(" ");
                                
                            }
                            for (int w=0;w<var;w++){
                                System.out.print("*");
                            }
                            var=var-2;
                            conta=conta+1;
                        System.out.println();
                        }
                        for (int i = 1; i <=impar/2; i++) {
                            for (int j = 1; j <= conta-2; j++) {
                                System.out.print(" ");
                         
                            }
                            conta=conta-1;
                            for (int j = 1; j <= var+4; j++) {
                                System.out.print("*");
                            }
                            var=var+2;
                            System.out.println();
                        }
                        
                     
                    }
                    else
                        System.out.println("Ingrese un valor impar");
                    break;
                }
      
        
    }
    while(opcion!=4);
    }
    
}
