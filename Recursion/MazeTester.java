public class MazeTester
{
   public static void main(String[] args)
   {
      char[][] mazeArray = { { '*', ' ', '*', '*', '*', '*', '*', '*', '*' },
            { '*', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*' },
            { '*', ' ', '*', '*', '*', '*', '*', ' ', '*' },
            { '*', ' ', '*', ' ', '*', ' ', ' ', ' ', '*' },
            { '*', ' ', '*', ' ', '*', '*', '*', ' ', '*' },
            { '*', ' ', ' ', ' ', '*', ' ', ' ', ' ', '*' },
            { '*', '*', '*', ' ', '*', ' ', '*', ' ', '*' },
            { '*', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*' },
            { '*', '*', '*', '*', '*', '*', '*', ' ', '*' } };
      Maze maze = new Maze(mazeArray);

      System.out.println(maze.escape(3, 7));

      for (Coordinate c : maze.getPath())
      {
         System.out.println("(" + c.getRow() + ", " + c.getCol() + ")");
      }
   }
}
