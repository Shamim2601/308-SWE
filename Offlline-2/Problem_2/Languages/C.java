package Problem_2.Languages;

import Problem_2.Fonts.Courier;
import Problem_2.Parsers.Cparser;

public class C extends Language {
    public C(){
        this.parser = new Cparser();
        this.font = new Courier();
    }
}
