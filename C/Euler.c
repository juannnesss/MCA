//
//  Euler.c
//  
//
//  Created by Juan Vargas on 26.01.16.
//
//

#include "Euler.h"
#include <math.h>
int main (void)
{
    double ti=0.01;
    double y0=2;
    double h=0.005;
    int n=(int)(2/h);
 printf("%f %.15e\n", ti, y0);
    for (int i=0;i<n;i++)
    {
        ti+=h;
        y0=y0*(pow((1-2*h),i));
        
        
      printf("%f %.15e\n", ti, y0);
    }
    return 0;
    
}
