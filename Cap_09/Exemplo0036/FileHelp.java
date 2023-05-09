package Cap_09.Exemplo0036;

    // Demonstra o sistema de ajuda baseado em arquivo

public class FileHelp {

    public static void main(String args[]){

        Help hlpobj = new Help("/home/sabatini/helpfile.txt");      // caminho do arquivo
        String topic;

        System.out.println("Try the help system. " + "Enter 'stop' to end");

        do{
            topic = hlpobj.getSelection();

            if(!hlpobj.helpOn(topic))
                System.out.println("Topic not found.\n");
        } while(topic.compareTo("stop") != 0);
    }
}
