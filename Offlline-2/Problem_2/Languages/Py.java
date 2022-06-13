package Problem_2.Languages;

import Problem_2.Fonts.Consolas;
import Problem_2.Parsers.PyParser;

public class Py extends Language{
    public Py(){
        this.parser = new PyParser();
        this.font = new Consolas();
    }
}
