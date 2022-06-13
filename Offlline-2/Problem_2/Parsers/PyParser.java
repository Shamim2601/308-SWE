package Problem_2.Parsers;

public class PyParser extends LangParser {

    public PyParser() {
        System.out.println(this.ParsingMessage());
    }
    
    public String ParsingMessage(){
        return "Parsing a Py file.....";
    }
}
