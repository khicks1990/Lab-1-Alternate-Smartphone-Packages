import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.ToggleGroup;
import javafx.collections.ObservableList;

/**
   Smartphone Packages
*/

public class Main extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }

   @Override
   public void start(Stage primaryStage)
   {
      // Data plan radio buttons
      RadioButton gig8RadioButton = new RadioButton("8 Gigabytes per month");
      RadioButton gig16RadioButton = new RadioButton("16 Gigabytes per month");
      RadioButton gig20RadioButton = new RadioButton("20 Gigabytes per month");
      gig8RadioButton.setSelected(true);
      ToggleGroup dataGroup = new ToggleGroup();
      gig8RadioButton.setToggleGroup(dataGroup);
      gig16RadioButton.setToggleGroup(dataGroup);
      gig20RadioButton.setToggleGroup(dataGroup);
      Label dataPrompt = new Label("Select a Data Plan");
      Label dataDescriptor = new Label("Data Plan Cost:");
      Label dataCostLabel = new Label("$45 per month");
      HBox dataCostHBox = new HBox(10, dataDescriptor, dataCostLabel);  
      VBox dataVBox = new VBox(10, dataPrompt, gig8RadioButton, gig16RadioButton,
                                   gig20RadioButton, dataCostHBox);

      // Register event handlers for the data plan radio buttons
      gig8RadioButton.setOnAction(event ->
      {
         dataCostLabel.setText("$45 per month");
      });

      gig16RadioButton.setOnAction(event ->
      {
         dataCostLabel.setText("$65 per month");
      });

      gig20RadioButton.setOnAction(event ->
      {
         dataCostLabel.setText("$99 per month");
      });

      // Phone radio buttons






      // Register event handlers for the phone radio buttons







      // Options
      CheckBox insuranceCheckBox = new CheckBox("Phone Replacement Insurance");
      CheckBox hotspotCheckBox = new CheckBox("WiFi Hotspot Capabilty");
      Label optionsDescriptor = new Label("Options Cost:");
      Label optionsCostLabel = new Label("$0");
      HBox optionsCostHBox = new HBox(10, optionsDescriptor, optionsCostLabel);
      VBox optionsVBox = new VBox(10, insuranceCheckBox, hotspotCheckBox, optionsCostHBox);

      // Register event handlers for the check boxes
      insuranceCheckBox.setOnAction(event ->
      {

      });

      hotspotCheckBox.setOnAction(event ->
      {


      });

      // Put everything into a VBox
      VBox mainVBox = new VBox(10, dataVBox, phoneVBox, optionsVBox);
      mainVBox.setAlignment(Pos.CENTER);
      mainVBox.setPadding(new Insets(10));

      // Add the main VBox to a scene.
      Scene scene = new Scene(mainVBox);

      // Set the scene to the stage aand display it.
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}