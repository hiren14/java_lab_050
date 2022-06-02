<h1 align="center" style="margin-top: 0px;"> Practical 5 a </h1> 

# 5. 	a) Write a program that displays the color of a circle as red when the mouse button  is pressed and as blue when the mouse button is released.

## code

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class practical5a extends Application 
{
 @Override
     public void start(Stage primaryStage) 
{
         double width = 450;
         double height = 450;
        Circle c = new Circle(width / 2, height / 2, Math.min(width, height) / 10, Color.BLUE);

         c.setStroke(Color.WHITE);

         StackPane pane = new StackPane(c);

         primaryStage.setScene(new Scene(pane, width, height));
         pane.setOnMousePressed(e -> c.setFill(Color.RED));
         pane.setOnMouseReleased(e -> c.setFill(Color.BLUE));
         primaryStage.setTitle("Click circle..");
         primaryStage.show();
     }
    public static void main(String[] args) {
        Application.launch(args);

    }
}
```

## License
[MIT](https://hiren14.github.io/java_lab_050/LICENSE)