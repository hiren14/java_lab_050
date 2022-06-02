<h1 align="center" style="margin-top: 0px;"> Practical 5 c </h1> 

# 5. 	c) Write a program that moves a circle up, down, left or right using arrow keys.
## code

```java
import javafx.application.Application;

import javafx.geometry.Insets;

import javafx.scene.Scene;

import javafx.scene.layout.Pane;

import javafx.scene.paint.Color;

import javafx.scene.shape.Circle;

import javafx.stage.Stage;

 

public class paractical5c extends Application {

 

@Override

public void start(Stage primaryStage) {

Pane pane = new Pane();

pane.setPadding(new Insets(20, 20, 20, 20));

Circle circle = new Circle(20, 20, 20);

circle.setFill(Color.RED);

pane.getChildren().add(circle);

 

pane.setOnKeyPressed(e -<{

switch (e.getCode()) {

case UP:

circle.setCenterY(

circle.getCenterY() < circle.getRadius() ? circle.getCenterY() - 10 : circle.getCenterY());

break;

case DOWN:

circle.setCenterY(

circle.getCenterY() > pane.getHeight() - circle.getRadius() ? circle.getCenterY() + 10

: circle.getCenterY());

break;

case LEFT:

circle.setCenterX(

circle.getCenterX() < circle.getRadius() ? circle.getCenterX() - 10 : circle.getCenterX());

break;

case RIGHT:

circle.setCenterX(

circle.getCenterX() > pane.getWidth() - circle.getRadius() ? circle.getCenterX() + 10

: circle.getCenterX());

default:

break;

}

});

 

Scene scene = new Scene(pane, 400, 400);

primaryStage.setTitle("Moving Circle Using Arrow keys");

primaryStage.setScene(scene);

primaryStage.show();

pane.requestFocus();

}

 

public static void main(String[] args) {

Application.launch(args);

}

}
```

## License
[MIT](https://hiren14.github.io/java_lab_050/LICENSE)