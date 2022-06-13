package Problem_2.Parsers;

public class Cparser extends LangParser {
    public Cparser(){
        System.out.println(this.ParsingMessage());
    }

    public String ParsingMessage(){
        return "Parsing a C file.....";
    }
}
