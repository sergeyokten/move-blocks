package okteweb.moveblocks.controllers;

public class OutputModel {

    private String name;
    private String color;

    public OutputModel() {
    }

    public OutputModel(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public OutputModel(InputModel inputModel) {
        name = inputModel.getName();
        color = inputModel.getColor();
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
}
