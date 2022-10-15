package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Maze {
    public static void main(String[] args) {
        int r = 3,c = 3;
        int[][] matrix = new int[r][c];
        int[][] pathArray = new int[r][c];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                matrix[i][j] = in.nextInt();

//        System.out.println( maze(r,c));
//        System.out.println(path(r,c, ""));
//        System.out.println(pathDiagonal(r,c, ""));
//        System.out.println(obstacle(0,0, "", matrix));
//        System.out.println(allDirectionObstacle(0,0, "", matrix));
        printPath(0,0, "", matrix, pathArray, 1);
    }

    public static int maze(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }

        int right = maze(r, c - 1);
        int down = maze(r - 1, c);

        return right + down;
    }

    public static ArrayList<String> path(int r, int c, String p) {
        if (r == 1 && c == 1){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> mainList = new ArrayList<>();

        if(c > 1)
            mainList.addAll(path(r, c - 1, p + "H"));
        if(r > 1)
            mainList.addAll(path(r - 1, c, p + "V"));
        return mainList;
    }

    public static ArrayList<String> pathDiagonal(int r, int c, String p) {
        if (r == 1 && c == 1){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> mainList = new ArrayList<>();

        if(c > 1)
            mainList.addAll(pathDiagonal(r, c - 1, p + "H"));
        if(r > 1)
            mainList.addAll(pathDiagonal(r - 1, c, p + "V"));
        if(c > 1 && r > 1)
            mainList.addAll(pathDiagonal(r - 1, c - 1, p + "C"));
        return mainList;
    }

    public static ArrayList<String> obstacle(int r, int c, String p, int[][] matrix){
        if(r == matrix.length - 1 && c == matrix[0].length - 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> mainList = new ArrayList<>();
        if(matrix[r][c] == 0) {
            return new ArrayList<>();
        }
        if(c < matrix[0].length - 1)
            mainList.addAll(obstacle(r, c + 1, p + "H", matrix));
        if(r < matrix.length -1)
            mainList.addAll(obstacle(r + 1, c, p + "V", matrix));

        return mainList;
    }

    public static ArrayList<String> allDirectionObstacle(int r, int c, String p, int[][] matrix){
        if(r == matrix.length - 1 && c == matrix[0].length - 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> mainList = new ArrayList<>();
        if(matrix[r][c] == 0) {
            return new ArrayList<>();
        }

        matrix[r][c] = 0;

        if(c < matrix[0].length - 1)
            mainList.addAll(allDirectionObstacle(r, c + 1, p + "R", matrix));
        if(r < matrix.length -1)
            mainList.addAll(allDirectionObstacle(r + 1, c, p + "D", matrix));
        if(r > 0)
            mainList.addAll(allDirectionObstacle(r - 1, c, p + "U", matrix));
        if(c > 0)
            mainList.addAll(allDirectionObstacle(r, c - 1, p + "L", matrix));

        matrix[r][c] = 1;
        return mainList;
    }

    public static void printPath(int r, int c, String p, int[][] matrix, int[][] path, int step){
        if(r == matrix.length - 1 && c == matrix[0].length - 1){
            path[r][c] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }

        if(matrix[r][c] == 0)
            return;


        matrix[r][c] = 0;
        path[r][c] = step;

        if(c < matrix[0].length - 1)
            printPath(r, c + 1, p + "R", matrix, path, step + 1);
        if(r < matrix.length -1)
            printPath(r + 1, c, p + "D", matrix, path, step + 1);
        if(r > 0)
            printPath(r - 1, c, p + "U", matrix, path, step + 1);
        if(c > 0)
            printPath(r, c - 1, p + "L", matrix, path, step + 1);

        matrix[r][c] = 1;
        path[r][c] = 0;
    }
}
/*
        1 1 1
        1 0 1
        1 1 1
*/
