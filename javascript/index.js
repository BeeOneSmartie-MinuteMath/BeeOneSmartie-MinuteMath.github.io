.problems
{//start class
        for(let count = 1; count <= 10; count++)
        {
            try (Scanner keyboard = new Scanner(System.in)) 
            {
                var nmax = 19;
                var nmin = 5;
                var x = (int)(Math.random() * (nmax - nmin + 1) + nmin);

                var qmax = 5;
                var qmin = 1;
                var y = (int)(Math.random() * (qmax - qmin + 1) + qmin);

                var a = 0;
                var s = 0;

                const nL = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20];
                const RnL = [5];

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
} //end class
