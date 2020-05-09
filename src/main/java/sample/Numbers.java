package MatirxWindows;

import javafx.animation.TranslateTransition;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Numbers extends Text {
    private int number;
    private int XCord;
    private int YCord;

    public Numbers(int number, int XCord, int YCord) {
        this.number = number;
        this.XCord = XCord;
        this.YCord = YCord;
        setText(String.valueOf(number));
        setFont(Font.font("Calibri", FontWeight.BOLD, FontPosture.REGULAR,30));
    }

    public int getNumber() {
        return number;
    }

    public int getXCord() {
        return XCord;
    }

    public int getYCord() {
        return YCord;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setXCord(int XCord) {
        this.XCord = XCord;
    }

    public void setYCord(int YCord) {
        this.YCord = YCord;
    }
}
