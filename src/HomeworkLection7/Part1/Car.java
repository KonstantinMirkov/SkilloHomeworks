package HomeworkLection7.Part1;

public class Car {
    private String name;
    private String color;
    private int releaseYear;
    private int horsePower;
    private boolean isSecondHand;

    public Car(String name, String color, int releaseYear, int horsePower, boolean isSecondHand) {
        if (name == null || name.isEmpty()) {
            this.name = "N/A";
        } else {
            this.name = name;
        }

        if (color == null || color.isEmpty()) {
            this.color = "N/A";
        } else {
            this.color = color;
        }

        if (releaseYear < 0) {
            this.releaseYear = -1;
        } else {
            this.releaseYear = releaseYear;
        }

        if (horsePower < 0) {
            this.horsePower = -1;
        } else {
            this.horsePower = horsePower;
        }

        this.isSecondHand = isSecondHand;
    }

    public Car(String name, int releaseYear, int horsePower, boolean isSecondHand) {
        this(name, "N/A", releaseYear, horsePower, isSecondHand);
    }

    public Car(String name, String color, int releaseYear, int horsePower) {
        this(name, color, releaseYear, horsePower, false);
    }

    public Car(String name, String color, boolean isSecondHand) {
        this(name, color, -1, -1, isSecondHand);
    }

    public Car() {
        this("N/A", "N/A", -1, -1, false);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public boolean isSecondHand() {
        return isSecondHand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setSecondHand(boolean secondHand) {
        isSecondHand = secondHand;
    }
}
