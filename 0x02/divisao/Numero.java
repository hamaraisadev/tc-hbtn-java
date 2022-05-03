package divisao;

public class Numero {
    public static int dividir(int a, int b)
    {
        try
        {
            if(a/b < Integer.MAX_VALUE)
            {
                return a/b;
            }
            else {
                System.out.println(a/b);
                return 0;
            }
        }
        catch (Exception e){
            System.out.println("Não eh possível dividir por zero");

        }finally {
            System.out.println("");
        }

        return 0;
    }
}

