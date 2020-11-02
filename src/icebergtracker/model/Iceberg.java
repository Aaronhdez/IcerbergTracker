package icebergtracker.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Iceberg {
    
    private final int id;
    private final String comment;
    private final LocalDate appeared;

    public Iceberg(int id, String comment, LocalDate appeared) {
        this.id = id;
        this.comment = comment;
        this.appeared = appeared;
    }
    
    @Override
    public String toString() {
        return "Iceberg{" + "ID=" + id + ", Comentarios=" + comment + ", Inicio=" + appeared + '}';
    }
    
    
}
