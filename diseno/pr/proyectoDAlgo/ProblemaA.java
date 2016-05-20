/*
 Autor: Juan Sebastian Vargas
 Codigo:201215310
 */
class ProblemaA
{
    public static void main(String[] args)
    {
        //lectura de entrada
        int trans =Integer.parseInt(args[0]);
        int periodo=Integer.parseInt(args[1]);
        int m=Integer.parseInt(args[2]);
        int n=Integer.parseInt(args[3]);

        //se encuentra p y q, pero no son primos relativos
        double p_prima=((trans*nueves(n))+periodo);
        double q_prima=(Math.pow(10,m))*(nueves(n));
        //se encuentra el GCD y se divide
        double gcd=GCD((int)p_prima,(int)q_prima);
        p_prima=p_prima/gcd;
        q_prima=q_prima/gcd;

        // Se imprime la salida
        System.out.println((int)p_prima+"/"+(int)q_prima); // Display the string.
    }


    // genera un double con n nueves seguidos
    public static double nueves(int n)
    {
        String string="";
        for(int i=0;i<n;i++)
        {
            string+="9";
        }
        return new Double(string);
    }
    //Greatest Common Divisor
    public static int GCD(int a, int b)
    {
        if (b==0) return a;
        return GCD(b,a%b);
    }
    
}
