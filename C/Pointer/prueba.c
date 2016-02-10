//
//  prueba.c
//  
//
//  Created by Juan Vargas on 19.01.16.
//
//
#include "prueba.h"

double fun(double *x);
double fun2(double y);
void cambiar(double *a, double *b);

int main(void)
{
    double *x;
    double y;
    int t=10;
    
    

    y=10.0;
//printf("el x: %f\n",x);
    for (int i=0; i<t;i++)
    {
        x[i]=i;
    }
    cambiar(x[2],x[3]);
    printf("el y: %f\n",y);
    printf("el x[2]: %f\n",x[2]);
    printf("el x[3]: %f\n", x[3]);
    
    
}
void cambiar(double *a,double *b)
{
    double temp=*a;
    *a=*b;
    *b=temp;
}


