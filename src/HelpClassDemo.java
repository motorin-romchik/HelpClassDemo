class Help {
    void helpon (int what) {
        switch(what) {
            case '1':
                System.out.println("Oпepaтop if:\n");
                System.out.println("if(ycлoвиe} оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("Oпepaтop switch:\n");
                System. out. println ( "switch (выражение} { ");
                System.out.println(" case константа:");
                System.out.println(" последовательность операторов");
                System.out.println(" break;");
                System.out.println(" // ... ");
                System.out.println("}");
                break;
            case '3':
                System.out.println("Oпepaтop for:\n");
                System.out.print("for(инициaлизaция; условие; итерация)");
                System.out.println(" оператор;");
                break;
            case '4':
                System.out.println("Oпepaтop while:\n");
                System.out.println("while(ycлoвиe) оператор;");
                break;
            case '5':
                System.out.println("Oпepaтop do-while:\n");
                System.out.println("do {");
                System.out.println(" оператор;");
                System.out.println("} while (условие;");
                break;
            case '6':
                System.out.println("Oпepaтop break:\n");
                System.out.println("break; или break метка;");
                break;
            case '7':
                System.out.println("Oпepaтop continue:\n");
                System.out.println("continue; или continue метка;");
                break;

        }
        System.out.println();
    }
    void showmenu () {
        System.out.println("Cпpaвкa:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println(" З. for");
        System.out.println(" 4. while");
        System.out.println(" 5. do-while");
        System.out.println(" 6. break");
        System.out.println(" 7. continue\n");
        System.out.print("Bыбepитe (q - выход): ");
    }
    boolean isvalid (int ch) {
        if (ch < '1' | ch > '7' & ch != 'q') return false;
        else return true;
    }
}
public class HelpClassDemo {
    public static void main (String args[])
        throws java.io.IOException {
            char choice,ignore;
            Help hlpobj = new Help();

            for (;;){
                do {
                    hlpobj.showmenu();

                    choice = (char) System.in.read();
                    do {
                        ignore = (char) System.in.read();
                    } while (ignore != '\n');

                } while (!hlpobj.isvalid(choice));
                if (choice == 'q') break;
                System.out.println("\n");
                hlpobj.helpon(choice);
            }
    }
}
