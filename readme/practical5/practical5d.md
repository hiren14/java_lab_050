<h1 align="center" style="margin-top: 0px;"> Practical 5 d </h1> 

# 5. 	d) Write a program that use button to move the message to the left and right and  use the radio button to change the color for the message displayed. 
## code

```java
import javafx.application.Application;

import javafx.stage.Stage;

import javafx.scene.Scene;

import javafx.geometry.Insets;

import javafx.geometry.Pos;

import javafx.scene.control.Button;

import javafx.scene.layout.HBox;

import javafx.scene.layout.Pane;

import javafx.scene.layout.BorderPane;

import javafx.scene.text.Text;

import javafx.scene.control.RadioButton;

import javafx.scene.control.ToggleGroup;

import javafx.scene.paint.Color;

 

public class practical5d extends Application {

protected Text text = new Text(50, 50, "Learning JavaFX is exciting");

 

@Override // Override the stage method in the Application class

public void start(Stage primaryStage) {

HBox paneForButtons = new HBox(20);

Button btLeft = new Button("<=");

Button btRight = new Button("=>");

paneForButtons.getChildren().addAll(btLeft, btRight);

paneForButtons.setAlignment(Pos.CENTER);

BorderPane pane = new BorderPane();

 

pane.setBottom(paneForButtons);

pane.setPadding(new Insets(10, 20, 10, 20));

 

HBox paneForRadioButtons = new HBox(20);

RadioButton rbRed = new RadioButton("Red");

RadioButton rbYellow = new RadioButton("Yellow");

RadioButton rbBlack = new RadioButton("Black");

RadioButton rbOrange = new RadioButton("Orange");

RadioButton rbGreen = new RadioButton("Green");

RadioButton rbBlue = new RadioButton("Blue");

paneForRadioButtons.getChildren().addAll(rbRed, rbYellow, rbBlack, rbOrange, rbGreen, rbBlue);

 

ToggleGroup group = new ToggleGroup();

rbRed.setToggleGroup(group);

rbYellow.setToggleGroup(group);

rbBlack.setToggleGroup(group);

rbOrange.setToggleGroup(group);

rbGreen.setToggleGroup(group);

rbBlue.setToggleGroup(group);

 

Pane paneForText = new Pane();

paneForText.getChildren().add(text);

pane.setCenter(paneForText);

pane.setTop(paneForRadioButtons);

 

btLeft.setOnAction(e -> text.setX(text.getX() - 10));

btRight.setOnAction(e -> text.setX(text.getX() + 10));

 

rbRed.setOnAction(e -> {

if (rbRed.isSelected()) {

text.setFill(Color.RED);

}

});

 

rbYellow.setOnAction(e -> {

if (rbYellow.isSelected()) {

text.setFill(Color.YELLOW);

}

});

 

rbBlack.setOnAction(e -> {

if (rbBlack.isSelected()) {

text.setFill(Color.BLACK);

}

});

 

rbOrange.setOnAction(e -> {

if (rbOrange.isSelected()) {

text.setFill(Color.ORANGE);

}

});

 

rbGreen.setOnAction(e -> {

if (rbGreen.isSelected()) {

text.setFill(Color.GREEN);

}

});

 

rbBlue.setOnAction(e -> {

if (rbBlue.isSelected()) {

text.setFill(Color.BLUE);

}

});

 

// Create a scene and place it in the stage

Scene scene = new Scene(pane, 450, 250);

primaryStage.setTitle("Program-20"); // Set the stage title

primaryStage.setScene(scene); // Place the scene in the stage

primaryStage.show(); // Display the stage

}

}
```

## License
[MIT](https://hiren14.github.io/java_lab_050/LICENSE)