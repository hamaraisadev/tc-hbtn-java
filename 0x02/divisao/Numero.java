

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
                System.out.print(a/b);
                return 0;
            }
        }
        catch (Exception e){
            System.out.println("Nao eh possivel dividir por zero");

        }finally {
            System.out.print("");
        }

        return 0;
    }
}

