//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //operacion uno
        double operacionUno = ((12 + 8) * (5 - 3) - (6 / 2));
        double operacionUnoD = operacionUno / ((3 * 4) + (8 / 2));

        //operacion dos
        double partUno = ((9*5)-(15+3) + (8*2) - (12/4) * (7+2) - ((6*3)/2) );
        double partDos = (( 2 + ((2*3)/(4-2)))  + (5 * ( (8/4 )+ 1 ) )  - ( 6/ (2+1) ));
        double resPartSup = partUno / partDos;

        //
        double partTres = ((((4+2) *(7-1))/(3-1))  + ((3*2) - (5+1)) * ( 8/2));
        double partCuatro = ((3+ ((6/2 ) + ( 7/2 ))) + (2 * (3+ (8/4))));
        double restPartInf = partTres / partCuatro ;

        double resFinal = resPartSup / restPartInf;



        //operacion tres

        double operacionTres =(((6 + 4) * 3) - (18 / 2)) ;
        double operacionTresD =  operacionTres/((8 - 5) + (3 * 2));

        System.out.println( "el resultado de la operacion uno es :"+ operacionUnoD );
        System.out.println( "el resultado de la operacion dos es:  "  + resFinal  );
        System.out.println( "el resultado de la operacion tres es: " + operacionTresD);

    }

}