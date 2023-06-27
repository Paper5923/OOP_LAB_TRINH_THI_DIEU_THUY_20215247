package hust.soict.globalict.javafx1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.fxml.FXML;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;

public class PainterController {
	@FXML
    private RadioButton eraser;
	
	@FXML
	private RadioButton pen;
	
	@FXML
	private Pane drawingAreaPane;
	
	@FXML
	void clearButtonPressed(ActionEvent event) {
		// implement clearing of canvas here
		drawingAreaPane.getChildren().clear();
	}
	
	@FXML
	void drawingAreaMouseDragged(MouseEvent event) {
        Rectangle clipArea = new Rectangle(0, 0, drawingAreaPane.getWidth(), drawingAreaPane.getHeight());
        Color color;
        drawingAreaPane.setClip(clipArea);
        
            if (pen.isSelected()) {
                color = Color.BLACK;
            } else if(eraser.isSelected()){
                color = Color.WHITE;
            }
            Circle newCircle = new Circle();
            newCircle = Circle(event.getX(), event.getY(), 4, color);
            drawingAreaPane.getChildren().add(newCircle);
        }	
    }
	

