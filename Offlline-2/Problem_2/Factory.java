package Problem_2;

import Problem_2.Languages.*;

public class Factory {
    public Language getLanguage(String fileType){
        if(fileType.equals("c")){
            return new C();
        }else if(fileType.equals("cpp")){
            return new Cpp();
        }else if(fileType.equals("py")){
            return new Py();
        }else{
            System.out.println("Invalid file name!");
            return null;
        }
    }
}
