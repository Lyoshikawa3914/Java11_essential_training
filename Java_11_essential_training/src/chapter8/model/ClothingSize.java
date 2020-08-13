package chapter8.model;

public enum ClothingSize {
    //contains possible values for program
    S("small"), M("medium"), L("large");
    private String description;

    ClothingSize(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return  description;
    }
}
