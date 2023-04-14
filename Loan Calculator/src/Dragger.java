public class Dragger {
    public void drag(UIWidget widget) {
        widget.drag();
        widget.resize();
        widget.render();
    };
}
