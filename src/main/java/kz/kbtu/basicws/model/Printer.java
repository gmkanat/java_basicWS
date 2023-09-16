package kz.kbtu.basicws.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Printer {
    @Autowired
    IPrintable printable;

    public Printer() {
    }

    public void setup(IPrintable printable) {
        this.printable = printable;
    }


    public String print(String text) {
        return printable.print(text);
    }
}