import java.util.Scanner;

public class Assignment6C
{
    public static void printArray (String[][] array)
    {
        for(int a=0;a<array.length;a++)
        {
            for(int b=0;b<array[a].length;b++)
                System.out.print('|'+array[a][b]);
            System.out.println('|');
        }
    }
    public static boolean isBoardFull (String[][] array)
    {
        for(int a=0;a<array.length;a++)
        {
            for(int b=0;b<array[a].length;b++)
                if(array[a][b]==" ")
                    return  false;
        }
        return true;
    }
    public static void addDisc (String[][] array, int column, char player)
    {
        if(array[0][column]!=" ")
            return;
        for(int a=0;a<array.length;a++)
        {
            if(a==array.length-1||array[a+1][column]!=" ")
            {array[a][column]=Character.toString(player);return;}

        }
    }
    public static boolean winVertical (String[][] array, char player)
    {
        for(int a=0;a<array.length;a++)
        {
            int sum=0;
            for (int b = 0; b < array[a].length; b++)
                if(array[a][b].equals(Character.toString(player)))
                    sum++;
            if(sum==4)
                return true;
        }
        return false;
    }
    public static boolean winHorizontal (String[][] array, char player)
    {
        for(int a=0;a<array.length;a++)
        {
            int sum=0;
            for (int b = 0; b < array[a].length; b++)
                if(array[b][a].equals(Character.toString(player)))
                    sum++;
            if(sum==4)
                return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("[Connect Four]\n");

        String[][]board=new String[4][4];
        for(int a=0;a<4;a++)
            for(int b=0;b<4;b++)
                board[a][b]=" ";

        int col;

        while (true)
        {
            System.out.print("Player 1, enter a row: ");
            col=scan.nextInt();
            while(col<0||col>3)
            {
                System.out.println("Invalid row,again enter");
                col=scan.nextInt();

            }
            addDisc(board,col,'X');
            printArray(board);
            if(winVertical(board,'X')||winHorizontal(board,'X'))
            {
                System.out.println("Player 1 wins!");
                break;
            }
            if(isBoardFull(board))
            {
                System.out.println("No one wins!");
                break;
            }
            System.out.print("Player 2, enter a row: ");
            col=scan.nextInt();
            while(col<0||col>3)
            {
                System.out.println("Invalid row,again enter");
                col=scan.nextInt();

            }
            addDisc(board,col,'O');
            printArray(board);
            if(winVertical(board,'O')||winHorizontal(board,'O'))
            {
                System.out.println("Player 2 wins!");
                break;
            }
            if(isBoardFull(board))
            {
                System.out.println("No one wins!");
                break;
            }
        }
    }

}
