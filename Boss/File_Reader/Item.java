package Boss.File_Reader;

enum Color {
    RED, GREEN, BLUE, BLACK
}

public class Item {
    private String numberString;
    private String typeOfTrial;
    private String colorWord;
    private String inkColor;
    private String responseColor;
    private String resultResponse;
    private Float reactionTime;

    public Item(
            String numberString,
            String typeOfTrial,
            String colorWord,
            String inkColor,
            String responseColor,
            String resultResponse,
            Float reactionTime) {
        this.numberString = numberString;
        this.typeOfTrial = typeOfTrial;
        this.colorWord = colorWord;
        this.inkColor = inkColor;
        this.responseColor = responseColor;
        this.resultResponse = resultResponse;
        this.reactionTime = reactionTime;
    }

    public void setNumberString(String numberString) {
        this.numberString = numberString;
    }

    public void setTypeOfTrial(String typeOfTrial) {
        this.typeOfTrial = typeOfTrial;
    }

    public void setColorWord(String colorWord) {
        this.colorWord = colorWord;
    }

    public void setInkColor(String inkColor) {
        this.inkColor = inkColor;
    }

    public void setResponseColor(String responseColor) {
        this.responseColor = responseColor;
    }

    public void setResultResponse(String resultResponse) {
        this.resultResponse = resultResponse;
    }

    public void setReactionTime(Float reactionTime) {
        this.reactionTime = reactionTime;
    }

    public String getNumberString() {
        return numberString;
    }

    public String getTypeOfTrial() {
        return typeOfTrial;
    }

    public String getColorWord() {
        return colorWord;
    }

    public String getInkColor() {
        return inkColor;
    }

    public String getResponseColor() {
        return responseColor;
    }

    public String isResultResponse() {
        return resultResponse;
    }

    public Float getReactionTime() {
        return reactionTime;
    }
}
