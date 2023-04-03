public class TextBox extends UIControl {
    private String text = "";

//    public TextBox(boolean isEnabled) {
//        super(isEnabled);
//        System.out.println("Text Box");
//    }

    @Override
    public void render() {
//        super.render()
        System.out.println("Render TextBox");
    }

    @Override
    public String toString() {return text;}

    public void setText(String text) {this.text = text;}

    public void clear() {text = "";}
}
