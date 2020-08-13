package chapter7.model;

public enum clothingSize {
    //contains possible values for program
    S("small"), M("medium"), L("large");
    private String description;

    clothingSize(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return  description;
    }
}
