//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class GamingConsoleReport {
    public static void main(String[] args) {

        //Gaming Console

        String[] gamingConsole = {"PS5","XBOX","SWITCH"};

        //Cities

        String[]  cities  = {"Cape Town","Port Elizabeth","Pretoria"};

        //Data:rows = gamingConsole,columns = Cape Town,Port Elizabeth,Pretoria

        int [][] sales = {{1000, 2000, 3000},//Cape Town
                {2000, 3000, 4000},//Port Elizabeth
                {1500, 1100, 1200}//Pretoria
        };

        //Header

        System.out.println("Gaming Console Report");
        System.out.println("____________________________");

        //Print data

        for (int i  = 0;i < cities.length;i++){
            System.out.printf("cities[i]," +
                    gamingConsole[i][0],
                            gamingConsole[i][1],
                    gamingConsole[i][2]);
        }

        System.out.println("____________________________");
        System.out.println("Console Sales Totals For Each City");
        System.out.println("____________________________");


        //Calculate and print city totals
        for ( int i = 0;i< cities.length;i++){
            int citiesTotals = gamingConsole[i]
                    [0] + gamingConsole[i][1] + gamingConsole[i][0];

            System.out.println("CITY WITH MOST SALES: PORT ELIZABETH");

            System.out.println("__________________________");
        }



    }
    }
