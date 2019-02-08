package okteweb.moveblocks.controllers;

public class InputModel {

    private String name;
    private String color;

    public InputModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "InputModel{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
