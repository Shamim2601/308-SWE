package Problem_2.Languages;

import Problem_2.Fonts.Monaco;
import Problem_2.Parsers.CppParser;

public class Cpp extends Language{
    public Cpp(){
        this.parser = new CppParser();
        this.font = new Monaco();
    }
}
