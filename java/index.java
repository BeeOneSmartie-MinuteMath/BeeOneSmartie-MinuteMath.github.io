import java.util.Scanner;
class problems
{
    void addition1()
    {
        for(int count = 1; count <= 10; count++)
        {
            try (Scanner keyboard = new Scanner(System.in)) 
            {
                int max = 10;
                int min = 0;
                int x = (int)(Math.random() * (max - min + 1) + min);
                int y = (int)(Math.random() * (max - min + 1) + min);
                int a = 0;
                int s = 0;

            
                a = x + y;

                System.out.println("What is: "+x+" + "+y);
                s = keyboard.nextInt();
                
                if (a == s)
                {
                    System.out.println("Correct! "+x+" + "+y+" = "+s);
                }
                else
                {
                    System.out.println("Wrong! "+x+" + "+y+" = "+a);
                }
            }
        }
    }
    void subtraction1()
    {
        for(int count = 1; count <= 10; count++)
        {
            try (Scanner keyboard = new Scanner(System.in)) 
            {
                int max = 10;
                int min = 0;
                int x = (int)(Math.random() * (max - min + 1) + min);
                int y = (int)(Math.random() * (max - min + 1) + min);
                int a = 0;
                int s = 0;

                if(x > y)
                {
                    a = x - y;
                    System.out.println("What is: "+x+" - "+y);
                    s = keyboard.nextInt();
                
                    if (a == s)
                    {
                        System.out.println("Correct! "+x+" - "+y+" = "+s);
                    }
                    else
                    {
                        System.out.println("Wrong! "+x+" - "+y+" = "+a);
                    }
                }
                if(x < y)
                    {
                        a = y - x;
                        System.out.println("What is: "+y+" - "+x);
                        s = keyboard.nextInt();
                
                    if (a == s)
                    {
                        System.out.println("Correct! "+y+" - "+x+" = "+s);
                    }
                    else
                    {
                        System.out.println("Wrong! "+y+" - "+x+" = "+a);
                    }
                }
                
            }
        }
    }
    void numberline()
    {
        for(int count = 1; count <= 10; count++)
        {
            try (Scanner keyboard = new Scanner(System.in)) 
            {
                int nmax = 19;
                int nmin = 5;
                int x = (int)(Math.random() * (nmax - nmin + 1) + nmin);

                int qmax = 5;
                int qmin = 1;
                int y = (int)(Math.random() * (qmax - qmin + 1) + qmin);

                int a = 0;
                int s = 0;

                int[] nL = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
                int[] RnL = new int[5];

                RnL[4] = nL[x];
                for (int countz = 3; countz >= 0; countz--)
                {
                    RnL[countz] = nL[x-(countz-4)];
                }
                if (y == 1)
                {
                    a = RnL[4];
                    System.out.println("What is the missing number: _ "+RnL[3]+" "+RnL[2]+" "+RnL[1]+" "+RnL[0]);
                    s = keyboard.nextInt();
                    if (a == s)
                    {
                        System.out.println("Correct!");
                    }
                    else
                    {
                        System.out.println("Wrong!");
                    }
                }
                if (y == 2)
                {
                    a = RnL[3];
                    System.out.println("What is the missing number: "+RnL[4]+" _ "+RnL[2]+" "+RnL[1]+" "+RnL[0]);
                    s = keyboard.nextInt();
                    if (a == s)
                    {
                        System.out.println("Correct!");
                    }
                    else
                    {
                        System.out.println("Wrong!");
                    }
                }
                if (y == 3)
                {
                    a = RnL[2];
                    System.out.println("What is the missing number: "+RnL[4]+" "+RnL[3]+" _ "+RnL[1]+" "+RnL[0]);
                    s = keyboard.nextInt();
                    if (a == s)
                    {
                        System.out.println("Correct!");
                    }
                    else
                    {
                        System.out.println("Wrong!");
                    }
                }
                if (y == 4)
                {
                    a = RnL[1];
                    System.out.println("What is the missing number: "+RnL[4]+" "+RnL[3]+" "+RnL[2]+" _ "+RnL[0]);
                    s = keyboard.nextInt();
                    if (a == s)
                    {
                        System.out.println("Correct!");
                    }
                    else
                    {
                        System.out.println("Wrong!");
                    }
                }
                if (y == 5)
                {
                    a = RnL[0];
                    System.out.println("What is the missing number: "+RnL[4]+" "+RnL[3]+" "+RnL[2]+" "+RnL[1]+" _");
                    s = keyboard.nextInt();
                    if (a == s)
                    {
                        System.out.println("Correct!");
                    }
                    else
                    {
                        System.out.println("Wrong!");
                    }
                }
            }
        }
    }
}
public class copypastereplace 
{
    public static void main(String[] args) 
    {
        problems ace = new problems();
        ace.numberline();
    }
}
