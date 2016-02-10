

#include <stdio.h>

int main(void)
{
    int a=0;
    float x;
    while(a<101)
    {
        printf("%d\n",a);
        x=(*(float*)&a);
        printf("%.20e\n",x);
        a++;
    }
    
    
    
}


