#include <math.h>
#include <stdlib.h>
#include <stdio.h>


double func(double x);
double promedio(double *x,int numeroPuntos);
int main (int argc, char **argv)
{
    int numeroPuntos;
    double x;
    double *f;
    int i;
    double integral;
    
    numeroPuntos=atoi(argv[1]);
    f = malloc(numeroPuntos * sizeof(double));
   /* if(!(f = malloc(numeroPuntos * sizeof(double))))
    {
       fprintf(stderr, "problem with f allocation\n");
        exit(1);
    }
    */
    for (int i=0; i<numeroPuntos; i++)
    {
        x=drand48();
        f[i]=func(x);
    }
    
    integral=promedio(f,numeroPuntos);
    printf("la integral es: %f\n",integral);
    return 0;
   
   
   
   
   
   
    
}

double func(double x)
{
    return (pow(x,-(1/3))+(x/10));
}
double promedio(double *x,int numeroPuntos)
{
    double a;
    a=0.0;
    for (int i=0;i<numeroPuntos; i++)
    {
        a+=x[i];
    }
    a/=numeroPuntos;
    return a;
}

