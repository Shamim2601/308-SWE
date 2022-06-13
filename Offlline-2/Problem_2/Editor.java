package Problem_2;

import java.util.Scanner;

public final class Editor {
    private static Editor editor = new Editor();
    protected Factory factory;

    private Editor(){
        
    }

    public static Editor geteditor(String fileType){
        if(editor==null){
            editor = new Editor();
        }

        return editor;
    }
 

    public void parseFile(String fileType){
        factory = new Factory();
        try{
            factory.getLanguage(fileType);
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while(true)
            {
                String fileType;

                System.out.print("\nEnter file name(exit to end program): ");
                String fileName = scanner.nextLine();
                if(fileName.equalsIgnoreCase("exit")) System.exit(0);

                String str[] = fileName.split("\\.");
                if(str[0].length()!=0){
                    fileType = str[1];
                    editor.parseFile(fileType);
                }else{
                    System.out.println("Invalid file name!");
                }

                
            }
        }
    }
    
}
