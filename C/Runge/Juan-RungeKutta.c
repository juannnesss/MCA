1//
//  Juan-RungeKutta.c
//  
//
//  Created by Juan Vargas on 2/10/16.
//
//

#include "Juan-RungeKutta.h"
#include <math.h>
#include <stdio.h>

typedef double (*derivative)(double t,double y);
double RungePaso2(double paso,double t, double y, derivative dev);
double RungePaso4(double paso,double t, double y, derivative dev);
double func_y(double t, double y);

int main(void)
{
    double Runge2_y;
    double Runge4_y;
    double t;
    
    double Tiempo= 2.0;
    double paso=1E-3;
    int numeroPasos=(int)(Tiempo/paso);
    
    
    //iniciamos en tiempo 0
    t=0.0;
    //condiciones iniciales
    Runge2_y=1.0;
    Runge4_y=1.0;
    for (int i=0; i<numeroPasos; i++)
    {
        printf("%f %.15e\n", t,Runge2_y);
        Runge2_y+=RungePaso2(paso,t,RungePaso2,func_y);
        
    }
 
    
}

double RungePaso2(double paso,double t, double y, derivative dev)
{
    double k1,k2;
    double paso_y;
    k1=dev(t,y);
    k2=dev(t+paso,y+paso*k1);
    paso_y=0.5*(k1+k2)*paso;
    return paso;
}