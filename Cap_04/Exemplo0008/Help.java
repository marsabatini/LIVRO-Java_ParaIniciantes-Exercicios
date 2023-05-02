package Cap_04.Exemplo0008;

public class Help {

    void showMenu(){
        System.out.println("Help on:");
        System.out.println("\t1. if");
        System.out.println("\t2. switch");
        System.out.println("\t3. for");
        System.out.println("\t4. while");
        System.out.println("\t5. do-while");
        System.out.println("\t6. break");
        System.out.println("\t7. continue");
        System.out.println("\tq. to quit");
        System.out.print("Choose: ");
    }

    void helpOn(int what){
        switch (what){
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;

            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("\tcase constant:");
                System.out.println("\t\tstatement sequence;");
                System.out.println("\t\tbreak;");
                System.out.println("\t// ...");
                System.out.println("}");
                break;

            case '3':
                System.out.println("The for:\n");
                System.out.println("for(init; condition; iteration){");
                System.out.println("\tstatement");
                System.out.println("}");
                break;

            case '4':
                System.out.println("The while:\n");
                System.out.println("while(condition){");
                System.out.println("\tstatement");
                System.out.println("}");
                break;

            case '5':
                System.out.println("The do-while:\n");
                System.out.println("do {");
                System.out.println(" statemente;");
                System.out.println("{");
                System.out.println("while(condition);");
                break;

            case '6':
                System.out.println("The break\n");
                System.out.println("break;");
                System.out.println("\t or");
                System.out.println("break label;");
                break;

            case '7':
                System.out.println("The continue:");
                System.out.println("continue;");
                System.out.println("\t or");
                System.out.println("continue label;");
                break;
        }
        System.out.println("");
    }

    boolean isValid(int ch){
        if(ch < '1' | ch > '7' & ch != 'q')
            return false;
        else
            return true;
    }
}
