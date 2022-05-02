/* Name: Aiden Rader
 * Class: Object-Oriented Programming (1510)
 * Date: 4/28/22
 * Lab: 014
 * Instructor: Dr.Hobbs
 * 
 * Description: American Flag extends JavaFX Application to make an American flag 
 * raise up and stay there while the US anthem plays in the background. This is done
 * by using a primaryStage with a pane and image setups where it goes into the 
 * project bin file and same with media where it searches for a specific file located
 * in the bin file. By using pathTransistions, we can move the image on the GUI 
 * we have made with the pane we made earlier then that. The flag and the anthem must 
 * stop and start again when the LEFT mouse button is pressed and when it is released.
 * Lastly, the whole project must restart after the anthem is finished playing.
 * 
 */

import java.io.File;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

//All of our imports above

public class AmericanFlag extends Application //Extends JavaFX into our class
{
	private static final String IMAGE = ("image/USA.gif"); //Get the image from the project bin file with its pathname

	@Override
	public void start(Stage primaryStage) //Our start method that uses primaryStage value as an arg
	{
		
		Pane pane = new Pane(); //Create a GUI/Window

		ImageView image = new ImageView(IMAGE); //Uses the private above the "Start" method 
		
		pane.getChildren().add(image); //Adds the Image of the US flag gets added to the pane/GUI window

		Media media = new Media(new File("bin/anthem/USA.mp3").toURI().toString()); //Finds the media file/anthem mp3 that 
																					//is located in the bin file
		
		MediaPlayer mP = new MediaPlayer(media); //Creates the MediaPlayer using the anthem

		PathTransition pT = new PathTransition(Duration.millis(30000), 
				new Line(235, 580, 235, 150), image); // new Line(StartX, StartY, EndX, EndY)
																	
		
		Scene scene = new Scene(pane, 500, 450); //Creates how big the window/GUI/pane
		primaryStage.setTitle("AmericanFlag"); //Sets the title for the window
		primaryStage.setScene(scene); 
		primaryStage.show(); //Shows the primaryStage in which we created earlier in the program
		
		
		//By default we start playing the picture pathTransition 
		//and the Music file when the program begins
		//VVVVV
		pT.play();
		mP.play(); 
		

		
			pane.setOnMousePressed(e -> 
			{
				if(e.getButton().equals(MouseButton.PRIMARY)); //If the LEFT mouse button is pressed in,
															   //the music and the picture stops playing
															  
				pT.pause(); //Pauses image 
				mP.pause(); //Pauses music
			});
			

			pane.setOnMouseReleased(e -> 
			{
				if(e.getButton().equals(MouseButton.PRIMARY)); //If the LEFT mouse button is pressed in,
				   											   //the music and the picture starts playing again
				{
					pT.playFrom(pT.getCurrentTime()); //This plays the image from where it had paused at
				}
				mP.play(); //The music starts once again
			});
			
			
			if (mP.getCurrentTime().compareTo(Duration.millis(77400)) == -1) 
			{
				mP.setCycleCount(Timeline.INDEFINITE); 
				
				//This is so the music file can repeat when it 
				//hits this time in milliseconds, It should repeat infinitely!
			}
			
			mP.setOnRepeat(new Runnable() //While the anthem repeats...
			{
				public void run() 
				{
					pT.play(); //The flag also repeats with it!
				}
			});
		}
		
	public static void main(String[] args) //Launch main method
	{
		launch(args); //Launch the program
	}
}
