   package javaapplication1;
   import java.util.*;
   public class XO_Game {
    static Scanner in =new Scanner(System.in);
    public static void pattern(){
         String [][] arr = new String[7][7];
        arr[0][0]="- "; arr[0][1]=" - "; arr[0][2]=" - "; arr[0][3]=" - "; arr[0][4]=" - "; arr[0][5]=" - "; arr[0][6]=" -";
        arr[1][0]="| "; arr[1][1]=" 1 "; arr[1][2]=" | "; arr[1][3]=" 2 "; arr[1][4]=" | "; arr[1][5]=" 3 "; arr[1][6]=" |";
        arr[2][0]="| "; arr[2][1]=" - "; arr[2][2]=" - "; arr[2][3]=" - "; arr[2][4]=" - "; arr[2][5]=" - "; arr[2][6]=" |";
        arr[3][0]="| "; arr[3][1]=" 4 "; arr[3][2]=" | "; arr[3][3]=" 5 "; arr[3][4]=" | "; arr[3][5]=" 6 "; arr[3][6]=" |";
        arr[4][0]="| "; arr[4][1]=" - "; arr[4][2]=" - "; arr[4][3]=" - "; arr[4][4]=" - "; arr[4][5]=" - "; arr[4][6]=" |";
        arr[5][0]="| "; arr[5][1]=" 7 "; arr[5][2]=" | "; arr[5][3]=" 8 "; arr[5][4]=" | "; arr[5][5]=" 9 "; arr[5][6]=" |";
        arr[6][0]="- "; arr[6][1]=" - "; arr[6][2]=" - "; arr[6][3]=" - "; arr[6][4]=" - "; arr[6][5]=" - "; arr[6][6]=" -";


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
    }


     public static void game() {
         for (int y = 0; y >-1 ; y++) {
         String s2, s3;
         String[][] arr = new String[7][7];
         arr[0][0] = "- ";
         arr[0][1] = " - ";
         arr[0][2] = " - ";
         arr[0][3] = " - ";
         arr[0][4] = " - ";
         arr[0][5] = "";
         arr[0][6] = "";
         arr[1][0] = "| ";
         arr[1][1] = "1";
         arr[1][2] = " | ";
         arr[1][3] = "2";
         arr[1][4] = " | ";
         arr[1][5] = "3";
         arr[1][6] = "|";
         arr[2][0] = "| ";
         arr[2][1] = " - ";
         arr[2][2] = " - ";
         arr[2][3] = " - ";
         arr[2][4] = " - ";
         arr[2][5] = "";
         arr[2][6] = "";
         arr[3][0] = "| ";
         arr[3][1] = "4";
         arr[3][2] = " | ";
         arr[3][3] = "5";
         arr[3][4] = " | ";
         arr[3][5] = "6";
         arr[3][6] = "|";
         arr[4][0] = "| ";
         arr[4][1] = " - ";
         arr[4][2] = " - ";
         arr[4][3] = " - ";
         arr[4][4] = " - ";
         arr[4][5] = "";
         arr[4][6] = "";
         arr[5][0] = "| ";
         arr[5][1] = "7";
         arr[5][2] = " | ";
         arr[5][3] = "8";
         arr[5][4] = " | ";
         arr[5][5] = "9";
         arr[5][6] = "|";
         arr[6][0] = "- ";
         arr[6][1] = " - ";
         arr[6][2] = " - ";
         arr[6][3] = " - ";
         arr[6][4] = " - ";
         arr[6][5] = "";
         arr[6][6] = "";
         System.out.println("Choose Your X Or O Yo Play" + "\n");
         System.out.print("Player 1 : ");
         s2 = in.next();
         System.out.print("Player 2 : ");
         s3 = in.next();
         String s1, s4;



             for (int i = 1; i <= 9; i++) {
                 if (i % 2 != 0) {
                     System.out.println("Player 1 Turn : ");
                     System.out.println("Choose The Position : ");
                     s1 = in.next();
                     for (int j = 0; j < arr.length; j++) {
                         for (int k = 0; k < arr.length; k++) {
                             if (s1.equals(arr[j][k])) {
                                 arr[j][k] = s2;
                             }
                         }

                     }
                     for (int u = 0; u < arr.length; u++) {
                         for (int l = 0; l < arr.length; l++) {
                             System.out.print(arr[u][l] + " ");
                         }
                         System.out.println();

                     }

                 } else {
                     System.out.println("Player 2 Turn : ");
                     System.out.println("Choose The Position : ");
                     s4 = in.next();
                     for (int j = 0; j < arr.length; j++) {
                         for (int k = 0; k < arr.length; k++) {
                             if (s4.equals(arr[j][k])) {
                                 arr[j][k] = s3;
                             }
                         }

                     }
                     for (int u = 0; u < arr.length; u++) {
                         for (int l = 0; l < arr.length; l++) {
                             System.out.print(arr[u][l] + " ");
                         }
                         System.out.println();

                     }

                 }

                 if (((arr[1][1] == arr[3][1]) && (arr[1][1] == arr[5][1]) || (arr[1][1] == arr[1][3]) && (arr[1][1] == arr[1][5])) && arr[1][1] == s2) {
                     System.out.println("Winner Winner ...... Player 1 Won The Game :)");
                     break;
                 } else if (((arr[1][1] == arr[3][1]) && (arr[1][1] == arr[5][1]) || (arr[1][1] == arr[1][3]) && (arr[1][1] == arr[1][5])) && arr[1][1] == s3) {
                     System.out.println("Winner Winner ...... Player 2 Won The Game :)");
                     break;
                 } else if (((arr[1][5] == arr[3][5]) && (arr[1][5] == arr[5][5]) || (arr[1][1] == arr[1][3]) && (arr[1][1] == arr[1][5])) && arr[1][5] == s2) {
                     System.out.println("Winner Winner ...... Player 1 Won The Game :)");
                     break;
                 } else if (((arr[1][5] == arr[3][5]) && (arr[1][5] == arr[5][5]) || (arr[1][1] == arr[1][3]) && (arr[1][1] == arr[1][5])) && arr[1][5] == s3) {
                     System.out.println("Winner Winner ...... Player 2 Won The Game :)");
                     break;
                 } else if ((arr[5][1] == arr[5][3]) && (arr[5][1] == arr[5][5]) && arr[5][1] == s2) {
                     System.out.println("Winner Winner ...... Player 1 Won The Game :)");
                     break;
                 } else if ((arr[5][1] == arr[5][3]) && (arr[5][1] == arr[5][5]) && arr[5][1] == s3) {
                     System.out.println("Winner Winner ...... Player 2 Won The Game :)");
                     break;
                 } else if ((arr[3][3] == arr[3][1]) && (arr[3][3] == arr[3][5]) && arr[3][3] == s2) {
                     System.out.println("Winner Winner ...... Player 1 Won The Game :)");
                     break;
                 } else if ((arr[3][3] == arr[3][1]) && (arr[3][3] == arr[3][5]) && arr[3][3] == s3) {
                     System.out.println("Winner Winner ...... Player 2 Won The Game :)");
                     break;
                 } else if (((arr[3][3] == arr[1][1]) && (arr[3][3] == arr[5][5]) || (arr[3][3] == arr[1][5]) && (arr[3][3] == arr[5][1])) && arr[3][3] == s2) {
                     System.out.println("Winner Winner ...... Player 1 Won The Game :)");
                     break;
                 } else if (((arr[3][3] == arr[1][1]) && (arr[3][3] == arr[5][5]) || (arr[3][3] == arr[1][5]) && (arr[3][3] == arr[5][1])) && arr[3][3] == s3) {
                     System.out.println("Winner Winner ...... Player 2 Won The Game :)");
                     break;
                 } else if (((arr[1][3] == arr[3][3]) && (arr[3][3] == arr[5][3])) && arr[3][3] == s2) {
                     System.out.println("Winner Winner ...... Player 1 Won The Game :)");
                     break;
                 } else if (((arr[1][3] == arr[3][3]) && (arr[3][3] == arr[5][3])) && arr[3][3] == s3) {
                     System.out.println("Winner Winner ...... Player 2 Won The Game :)");
                     break;
                 } else {
                     if (i == 9)
                         System.out.println("DRAW ..... :(");
                 }


             }
             System.out.println();
             System.out.println("Do you Want to Play Again ?");
             String s5= in.next();
             if(s5.equals("NO") || s5.equals("no")){
                 break;
             }

         }
     }
      public static void main(String[] args) {
        System.out.println("Press Start To Play : ");
        String s = in.next();
        if(s.equals("start") || s.equals("Start")){
            pattern();
        }
        game();


    }

}
