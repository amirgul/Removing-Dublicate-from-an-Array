public class Main
{

    public static void main(String[] args)
    {
        char[] anArray = {'b','d','a','b','f','a','g','a','a','f'};
        display(removeDublicate(anArray));


    }

    public static char[] removeDublicate(char[] anArray)
    {
        boolean[] isTrue = new boolean[anArray.length];
        int counter = 0;
        for(int i = 0; i<anArray.length; i++)
        {
            isTrue[i] = true;
            counter++;
            for(int k = 0; k<i; k++)
            {
                if(anArray[i] == anArray[k])
                {
                    isTrue[i] = false;
                    counter--;
                    k = i;
                }
            }

        }

        char[] updateArray = new char[counter];
        int k = 0;
        for(int i = 0; i<anArray.length; i++)
        {
            if(isTrue[i] == true)
            {
                updateArray[k] = anArray[i];
                k++;
            }
        }
        return updateArray;

    }
    public static void display(char[] anArray)
    {
        for(int i = 0; i<anArray.length; i++)
        {
            System.out.print(anArray[i]+ " ");
        }
    }
}
