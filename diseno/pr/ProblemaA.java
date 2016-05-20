
class HelloWorldApp
{
    public static void main(String[] args)
    {
        int trans =Integer.parseInt(args[0]);
        int periodo=Integer.parseInt(args[1]);
        int m=Integer.parseInt(args[2]);
        int n=Integer.parseInt(args[3]);
        /*
        int len=lenth(trans);
        double r=createRational(trans,periodo,m,n);
        double eq1=eq1(m,r);
        double p=eq1-r;
        double q=(Math.pow(10,m))-1;
        */
        double p_prima=((trans*nueves(n))+periodo);
        double q_prima=(Math.pow(10,m))*(nueves(n));
        double gcd=GCD((int)p_prima,(int)q_prima);
        p_prima=p_prima/gcd;
        q_prima=q_prima/gcd;
        
       /*
        while(p-((int)p)!=0)
        {
            
            p=p*10;
            q=q*10;
            System.out.println(""+p+":"+q);
        }
        
    */
       
        
        System.out.println((int)p_prima+"/"+(int)q_prima); // Display the string.
    }
    
    public static int lenth(int n)
    {
        return (int)(Math.log10(n)+1);
    }
    public static Double createRational(int trans, int peri,int m,int n)
    {
        Double rta=null;
        String transiente=null;
        String periodo=null;
        if(lenth(trans)==m&&lenth(peri)==n)
        {
            rta=new Double("0."+trans+peri);
            return rta;
        }
        if(trans==0)
        {
            transiente=""+0;
        }
        else if(lenth(trans)<m)
        {
            int ce=m-lenth(trans);
            transiente=new String(new char[ce]).replace("\0", "0");
            transiente+=trans;
            
        }
        else
        {
            transiente=""+trans;
        }
        if(lenth(peri)<n)
        {
            int ce=n-lenth(peri);
            periodo=new String(new char[ce]).replace("\0", "0");
            periodo+=peri;
        }
        else
        {
            periodo=""+peri;
        }
        int i=0;
        while(i<5)
        {
            periodo+=periodo;
            i++;
        }
        rta=new Double("0."+transiente+periodo);
        return rta;
    }
    public static double eq1(int m,double r)
    {
        return (Math.pow(10,m))*(r);
    }
    public static double nueves(int n)
    {
        String string="";
        for(int i=0;i<n;i++)
        {
            string+="9";
        }
        return new Double(string);
    }
    public static int GCD(int a, int b)
    {
        if (b==0) return a;
        return GCD(b,a%b);
    }
    
}
