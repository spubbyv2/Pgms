/*********************************************************************
     Author    : Your Name
     Course    : COP 2270 Sec ANSI C Online
     Professor : Michael Robinson
     Program # : Program Purpose/Description
                 {A brief description of the program }
     Due Date  : MM/DD/YYYY

     Certification:
     I hereby certify that this work is my own and none of it is the work of any other person.

     ..........{ your signature }..........
*********************************************************************/
#include <stdio.h>
#include <math.h>
#include <stdlib.h>


void processAbsoluteValues(int i, int j, double x, double y)
{

    printf("abs(i) = %d\n", abs(i));
    printf("abs(j) = %d\n", abs(j));
    printf("abs(x) = %1.1f\n", fabs(x));
    printf("abs(y) = %1.2f\n", fabs(y));
    
}


void processRoundValues(int i, int j, double x, double y)
{

    printf("round(i) = %.0f\n", round(i));
    printf("round(j) = %.0f\n", round(j));
    printf("round(x) = %.0f\n", round(x));
    printf("round(y) = %.0f\n", round(y));    

}


void processCeilingValues(int i, int j, double x, double y)
{

    printf("ceil(i) = %.0f\n", ceil(i));
    printf("ceil(j) = %.0f\n", ceil(j));
    printf("ceil(x) = %.0f\n", ceil(x));
    printf("ceil(y) = %.0f\n", ceil(y));

}


void processFlooringValues(int i, int j, double x, double y)
{

    printf("floor(i) = %.0f\n", floor(i));
    printf("floor(j) = %.0f\n", floor(j));
    printf("floor(x) = %.0f\n", floor(x));
    printf("floor(y) = %.0f\n", floor(y));


}


void processMinimumValues(int i, int j, double x, double y)
{

    int minI = fmin(i,j);
    double minD = fmin(x,y);

    printf("The minimum value of [%d] and [%d] = %d\n",i,j,minI);
    printf("The minimum value of [%.2f] and [%.2f] = %.2f\n",x,y,minD);
    
}


void processMaximumValues(int i, int j, double x, double y)
{

    int maxI = fmax(i,j);
    double maxD = fmax(x,y);

    printf("The maximum value of [%d] and [%d] = %d\n",i,j,maxI);
    printf("The maximum value of [%.2f] and [%.2f] = %.2f\n",x,y,maxD);

}


void processTrigFunctionsValues(int i, int j, double x, double y)
{

    printf("cos(i) = %.5f sin(i) = %.5f tan(i) = %.5f\n", cos(i), sin(i), tan(i));
    printf("cos(j) = %.5f sin(j) = %.5f tan(j) = %.5f\n", cos(j), sin(j), tan(j));
    printf("cos(x) = %.5f sin(x) = %.5f tan(x) = %.5f\n", cos(x), sin(x), tan(x));
    printf("cos(y) = %.5f sin(y) = %.5f  tan(y) = %.5f\n", cos(y), sin(y), tan(y));


}


void processExponentialValues(int i, int j, double x, double y)
{

    printf("exp(i) = %.5f\n", exp(i));
    printf("exp(j) = %.5f\n", exp(j));
    printf("exp(x) = %.5f\n", exp(x));
    printf("exp(y) = %.5f\n", exp(y));

}


void processLogValues(int i, int j, double x, double y)
{

    printf("log(i) = %.5f\n", log(i));
    printf("log(j) = %.5f\n", log(j));
    printf("log(x) = %.5f\n", log(x));
    printf("log(y) = %.5f\n", log(y));

}


void processPowerValues(int i, int j, double x, double y)
{

    printf("i^j = %.0f\n", pow(i,j) );
    printf("i^x = %.5f\n", pow(i,x) );
    printf("i^y = %.5f\n", pow(i,y) );

    printf("j^i = %.0f\n", pow(j,i) );
    printf("j^x = %.5f\n", pow(j,x) );
    printf("j^y = %.5f\n", pow(j,y) );

    printf("x^i = %.0f\n", pow(x,i) );
    printf("x^j = %.5f\n", pow(x,j) );
    printf("x^y = %.5f\n", pow(x,y) );

    printf("y^i = %.0f\n", pow(y,i) );
    printf("y^j = %.5f\n", pow(y,j) );
    printf("y^x = %.5f\n", pow(y,x) );

}


void processSquareRootsValues(int i, int j, double x, double y)
{

    printf("sqrt(i) = %.5f\n", sqrt(i));
    printf("sqrt(j) = %.5f\n", sqrt(j));
    printf("sqrt(x) = %.5f\n", sqrt(x));
    printf("sqrt(y) = %.5f\n", sqrt(y));

}


void processRandomValues()
{

    int randomVar = rand();
    printf("Your lucky number today is: %d\n", randomVar);

}


void myName(char name[],int length)
{

    printf("My name is [%s]\n", name);

    for (int x = 0; x < length; x++)
    {

        if (name[x] == 'a' || name[x] == 'e' || name[x] == 'i' || name[x] == 'o' || name[x] == 'u')
            printf("character [%c] located at position [%d] is a vowel\n", name[x], x);
        else if (name[x] == '%' || name[x] == '$')
            printf("character [%c] located at position [%d] is a symbol\n", name[x], x);
        else if (name[x] == ' ')
            printf("character [%c] located at position [%d] is a space\n", name[x], x);
        else
            printf("character [%c] located at position [%d] is a consonant\n", name[x], x); 
    }
        

}


void pyramid(char name[], int length)
{

   

}


int main()
{

    int i = 7;
    int j = 9;
    double x = 72.5;
    double y = -0.34;
    char name[] = "Sebastian $ Jose % Medina";
    int length = sizeof(name)/sizeof(name[0]);

    processAbsoluteValues(i,j,x,y);
    processRoundValues(i,j,x,y);
    processCeilingValues(i,j,x,y);
    processFlooringValues(i,j,x,y);
    processMinimumValues(i,j,x,y);
    processMaximumValues(i,j,x,y);
    processTrigFunctionsValues(i,j,x,y);
    processExponentialValues(i,j,x,y);
    processLogValues(i,j,x,y);
    processPowerValues(i,j,x,y);
    processSquareRootsValues(i,j,x,y);
    processRandomValues();
    myName(name, length);

    return 0;
}