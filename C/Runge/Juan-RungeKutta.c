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
    
}