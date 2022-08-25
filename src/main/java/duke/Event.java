package duke;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Event extends Task{
    private LocalDate date;

    public Event(String description, LocalDate date) {
        super(description);
        this.date = date;
    }


    public boolean onThisDate(LocalDate date){
        return this.date.equals(date);
    }

    public String toStringDate() {
        return super.toString();
    }

    @Override
    public String parseTask() {
        return "E" + super.parseTask() + "/" + this.date;
    }

    @Override
    public String toString(){
        return "[E]" + super.toString()  + " (at: " + this.date.format(DateTimeFormatter.ofPattern("MMM d yyyy")) + ")";
    }
}
