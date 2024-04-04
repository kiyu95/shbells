package com.kimbaekjung.semiproject.calendar.dto;

public class CalendarDTO {
    private String title;
    private String start;
    private String end;
    private String color;

    public CalendarDTO() {
    }

    public CalendarDTO(String title, String start, String end, String color) {
        this.title = title;
        this.start = start;
        this.end = end;
        this.color = color;
    }

    @Override
    public String toString() {
        return "CalendarDTO{" +
                "title='" + title + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
