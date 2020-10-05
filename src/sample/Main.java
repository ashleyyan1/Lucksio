package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {
    Label title = new Label("Neon Lucksio");
    Label cow = new Label("You lost all your MOOney :(");
    Image die1 = new Image ("file:./res/Dice1.png", 100, 100, false, false);
    Image die1Held = new Image ("file:./res/Dice1Held.png",100, 100, false, false);
    Image die2 = new Image ("file:./res/Dice2.png",100, 100, false, false);
    Image die2Held = new Image ("file:./res/Dice2Held.png",100, 100, false, false);
    Image die3 = new Image ("file:./res/Dice3.png",100, 100, false, false);
    Image die3Held = new Image ("file:./res/Dice3held.png",100, 100, false, false);
    Image die4 = new Image ("file:./res/Dice4.png",100, 100, false, false);
    Image die4Held = new Image ("file:./res/Dice4held.png",100, 100, false, false);
    Image die5 = new Image ("file:./res/Dice5.png",100, 100, false, false);
    Image die5Held = new Image ("file:./res/Dice5held.png",100, 100, false, false);
    Image die6 = new Image ("file:./res/Dice6.png",100, 100, false, false);
    Image die6Held = new Image ("file:./res/Dice6held.png",100, 100, false, false);
    Image rock = new Image("file:./res/rock.png", 100, 100, false,false);
    Image paper = new Image("file:./res/paper.png", 100, 100, false,false);
    Image scissors = new Image("file:./res/scissors.png", 100, 100, false,false);
    Image cherry = new Image("file:./res/cherry.jpg",100,100,false,false);
    Image orange = new Image("file:./res/orange.jpg",100,100,false,false);
    Image plum  = new Image("file:./res/plum.jpg",100,100,false,false);
    Image bell = new Image("file:./res/bell.jpg",100,100,false,false);
    Image melon = new Image("file:./res/melon.jpg",100,100,false,false);
    Image bar = new Image("file:./res/bar.jpg",100,100,false,false);

    ImageView a = new ImageView(die6);
    ImageView b = new ImageView(die6);
    ImageView c = new ImageView(die6);
    ImageView d = new ImageView(die6);
    ImageView e = new ImageView(die6);
    ImageView h =  new ImageView(rock);
    ImageView i = new ImageView(paper);
    ImageView j = new ImageView(scissors);
//    ImageView k = new ImageView(cherry);
//    ImageView l = new ImageView(orange);
//    ImageView m = new ImageView(plum);
//    ImageView n = new ImageView(bell);
//    ImageView o = new ImageView(melon);
//    ImageView p = new ImageView(bar);
    ImageView x = new ImageView(cherry);
    ImageView y = new ImageView(orange);
    ImageView z = new ImageView(plum);
    Label label = new Label("Choose a hand!");
    Label comp = new Label("");
    Label result = new Label("");
    int counter = 0;

    int upoints = 0;
    int cpoints = 0;
    Random random = new Random();
    int rollCount = 1;
    Button button = new Button("Roll Dice");
    HBox hbox = new HBox();
    int tempRandom, tempRandom1, tempRandom2, tempRandom3, tempRandom4;
    Image[] images = new Image[12];
    Label score = new Label();
    Label points = new Label();
    Label totalscore = new Label();
    int totalpoints = 0;
    int ones, twos, threes, fours, fives, sixes;

    Button button1 = new Button("Dice");
    Button button2 = new Button("Rock, Paper, Scissors");
    Button button3 = new Button("Slot Machine");
    Button play = new Button("Try your luck");
    Button exit = new Button("Exit Casino");
    Button goodbye = new Button("Go to Bank");
    Button previous = new Button("Main Menu");
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vbox1 = new VBox(30,title,button1,button2,button3);
        vbox1.setAlignment(Pos.CENTER);
        vbox1.setPadding(new Insets(50));
        Scene scene1 = new Scene(vbox1);
        title.setStyle("-fx-text-fill: turquoise; -fx-font: 24 arial; -fx-font-weight: bold;");
        scene1.getStylesheets().add("mainmenu.css");
        primaryStage.setScene(scene1);
        primaryStage.show();

        button1.setOnAction(Event -> {
            images[0] = die1;
            images[1] = die2;
            images[2] = die3;
            images[3] = die4;
            images[4] = die5;
            images[5] = die6;
            images[6] = die1Held;
            images[7] = die2Held;
            images[8] = die3Held;
            images[9] = die4Held;
            images[10] = die5Held;
            images[11] = die6Held;

            button.setOnAction(diceevent -> {
                previous.setOnAction(exitaction ->{
//                    VBox vbox = new VBox(100,cow,goodbye);
//                    Scene scene = new Scene(vbox);
//                    cow.setStyle("-fx-text-fill: white;");
//                    vbox.setPadding(new Insets(150));
//                    scene.getStylesheets().add("cow.css");
//                    primaryStage.setScene(scene);
//                    primaryStage.show();
//                    goodbye.setOnAction(closeevent ->{
                        primaryStage.setScene(scene1);
//                    });
                });
                if (rollCount < 4) {

                    button.setText("Roll Dice");

                    if (rollCount == 1) {
                        tempRandom = random.nextInt(6);
                        tempRandom1 = random.nextInt(6);
                        tempRandom2 = random.nextInt(6);
                        tempRandom3 = random.nextInt(6);
                        tempRandom4 = random.nextInt(6);
                        a.setImage(images[tempRandom]);
                        b.setImage(images[tempRandom1]);
                        c.setImage(images[tempRandom2]);
                        d.setImage(images[tempRandom3]);
                        e.setImage(images[tempRandom4]);
                    }
                    if (rollCount != 1 && rollCount < 4) {
                        if (a.getImage().equals(images[tempRandom])) {
                            tempRandom = random.nextInt(6);
                            a.setImage(images[tempRandom]);
                        }
                        if (b.getImage().equals(images[tempRandom1])) {
                            tempRandom1 = random.nextInt(6);
                            b.setImage(images[tempRandom1]);
                        }
                        if (c.getImage().equals(images[tempRandom2])) {
                            tempRandom2 = random.nextInt(6);
                            c.setImage(images[tempRandom2]);
                        }
                        if (d.getImage().equals(images[tempRandom3])) {
                            tempRandom3 = random.nextInt(6);
                            d.setImage(images[tempRandom3]);
                        }
                        if (e.getImage().equals(images[tempRandom4])) {
                            tempRandom4 = random.nextInt(6);
                            e.setImage(images[tempRandom4]);
                        }
                    }

                    a.setOnMouseClicked(event -> {
                        if (a.getImage().equals(images[tempRandom]) && rollCount != 1 && rollCount < 4) {
                            a.setImage(images[tempRandom + 6]);
                        } else if (rollCount < 4 && rollCount != 1) {
                            a.setImage(images[tempRandom]);
                        }
                    });
                    b.setOnMouseClicked(event -> {
                        if (b.getImage().equals(images[tempRandom1]) && rollCount != 1 && rollCount < 4) {
                            b.setImage(images[tempRandom1 + 6]);
                        } else if (rollCount < 4 && rollCount != 1) {
                            b.setImage(images[tempRandom1]);
                        }
                    });
                    c.setOnMouseClicked(event -> {
                        if (c.getImage().equals(images[tempRandom2]) && rollCount != 1 && rollCount < 4) {
                            c.setImage(images[tempRandom2 + 6]);
                        } else if (rollCount < 4 && rollCount != 1) {
                            c.setImage(images[tempRandom2]);
                        }
                    });
                    d.setOnMouseClicked(event -> {
                        if (d.getImage().equals(images[tempRandom3]) && rollCount != 1 && rollCount < 4) {
                            d.setImage(images[tempRandom3 + 6]);
                        } else if (rollCount < 4 && rollCount != 1) {
                            d.setImage(images[tempRandom3]);
                        }
                    });
                    e.setOnMouseClicked(event -> {
                        if (e.getImage().equals(images[tempRandom4]) && rollCount != 1 && rollCount < 4) {
                            e.setImage(images[tempRandom4 + 6]);
                        } else if (rollCount < 4 && rollCount != 1) {
                            e.setImage(images[tempRandom4]);
                        }
                    });
                }
                if (rollCount == 3) {
                    tempRandom++;
                    tempRandom1++;
                    tempRandom2++;
                    tempRandom3++;
                    tempRandom4++;
                    if (tempRandom == 1) ones++;
                    if (tempRandom1 == 1) ones++;
                    if (tempRandom2 == 1) ones++;
                    if (tempRandom3 == 1) ones++;
                    if (tempRandom4 == 1) ones++;
                    if (tempRandom == 2) twos++;
                    if (tempRandom1 == 2) twos++;
                    if (tempRandom2 == 2) twos++;
                    if (tempRandom3 == 2) twos++;
                    if (tempRandom4 == 2) twos++;
                    if (tempRandom == 3) threes++;
                    if (tempRandom1 == 3) threes++;
                    if (tempRandom2 == 3) threes++;
                    if (tempRandom3 == 3) threes++;
                    if (tempRandom4 == 3) threes++;
                    if (tempRandom == 4) fours++;
                    if (tempRandom1 == 4) fours++;
                    if (tempRandom2 == 4) fours++;
                    if (tempRandom3 == 4) fours++;
                    if (tempRandom4 == 4) fours++;
                    if (tempRandom == 5) fives++;
                    if (tempRandom1 == 5) fives++;
                    if (tempRandom2 == 5) fives++;
                    if (tempRandom3 == 5) fives++;
                    if (tempRandom4 == 5) fives++;
                    if (tempRandom == 6) sixes++;
                    if (tempRandom1 == 6) sixes++;
                    if (tempRandom2 == 6) sixes++;
                    if (tempRandom3 == 6) sixes++;
                    if (tempRandom4 == 6) sixes++;


                    button.setText("Play Again");
//                        if((ones==1 && twos==1 && threes==1 && fours==1 && (fives==1||sixes==1)||(ones==1 && twos==1 && threes==1 && (fours==1 || fives==1) && sixes==1
//                        )||(ones==1 && twos==1 && (threes==1 || fours==1) && fives==1 && sixes==1)||(ones==1 && (twos==1 || threes==1) && fours==1 && fives==1 && sixes==1))
//                        ||(ones==1 && (twos==1 || threes==1) && fours==1 && fives==1 && sixes==1)||((ones==1 || twos==1) && threes==1 && fours==1 && fives==1 && sixes==1))
//                        {
//                                            score.setText("Straight!");
//                                            points.setText("8 points");
//                                            totalpoints = totalpoints + 8;
//                        } //one of each of any

                    if ((ones == 1 && twos == 1 && threes == 1 && fours == 1 && fives == 1) || (sixes == 1 && twos == 1 && threes == 1 && fours == 1 && fives == 1) ||
                            (ones == 1 && sixes == 1 && threes == 1 && fours == 1 && fives == 1) || (sixes == 1 && ones == 1 && twos == 1 && fours == 1 && fives == 1) ||
                            (ones == 1 && twos == 1 && threes == 1 && sixes == 1 && fives == 1) || (ones == 1 && twos == 1 && threes == 1 && fours == 1 && sixes == 1)) {
                        score.setText("Straight!");
                        points.setText("8 points");
                        totalpoints = totalpoints + 8;
                    }


                    if (ones == 5 || twos == 5 || threes == 5 || fours == 5 || fives == 5 || sixes == 5) {
                        score.setText("5 of a kind!");
                        points.setText("10 points");
                        totalpoints = totalpoints + 10;
                    }
                    if (ones == 4 || twos == 4 || threes == 4 || fours == 4 || fives == 4 || sixes == 4) {
                        score.setText("4 of a kind!");
                        points.setText("7 points");
                        totalpoints = totalpoints + 7;
                    }
//                        if(ones==3||twos==3||threes==3||fours==3||fives==3||sixes==3){
//                            score.setText("3 of a kind!");
//                            points.setText("5 points");
//                            totalpoints = totalpoints+5;
//                        }

                    if (ones == 2 && twos != 3 && threes != 3 && fours != 3 && fives != 3 && sixes != 3) {
                        if (twos == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else if (threes == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else if (fours == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else if (fives == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else if (sixes == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else {
                            score.setText("2 of a kind!");
                            points.setText("1 point");
                            totalpoints = totalpoints + 1;
                        }
                    } else if (twos == 2 && ones != 3 && threes != 3 && fours != 3 && fives != 3 && sixes != 3) {
                        if (ones == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else if (threes == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else if (fours == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else if (fives == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else if (sixes == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else {
                            score.setText("2 of a kind!");
                            points.setText("1 point");
                            totalpoints = totalpoints + 1;
                        }
                    } else if (threes == 2 && twos != 3 && ones != 3 && fours != 3 && fives != 3 && sixes != 3) {
                        if (twos == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else if (ones == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else if (fours == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else if (fives == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else if (sixes == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else {
                            score.setText("2 of a kind!");
                            points.setText("1 point");
                            totalpoints = totalpoints + 1;
                        }
                    } else if (fours == 2 && twos != 3 && threes != 3 && ones != 3 && fives != 3 && sixes != 3) {
                        if (twos == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else if (threes == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else if (ones == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else if (fives == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else if (sixes == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else {
                            score.setText("2 of a kind!");
                            points.setText("1 point");
                            totalpoints = totalpoints + 1;
                        }
                    } else if (fives == 2 && twos != 3 && threes != 3 && fours != 3 && ones != 3 && sixes != 3) {
                        if (twos == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else if (threes == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else if (fours == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else if (ones == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else if (sixes == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else {
                            score.setText("2 of a kind!");
                            points.setText("1 point");
                            totalpoints = totalpoints + 1;
                        }
                    } else if (sixes == 2 && twos != 3 && threes != 3 && fours != 3 && fives != 3 && ones != 3) {
                        if (twos == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else if (threes == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else if (fours == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else if (fives == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else if (ones == 2) {
                            score.setText("2 pairs!");
                            points.setText("4 points");
                            totalpoints = totalpoints + 4;
                        } else {
                            score.setText("2 of a kind!");
                            points.setText("1 point");
                            totalpoints = totalpoints + 1;
                        }
                    }

                    if (ones == 3) {
                        if (threes == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else if (fours == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else if (twos == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else if (fives == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else if (sixes == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else {
                            score.setText("3 of a kind!");
                            points.setText("5 points");
                            totalpoints = totalpoints + 5;
                        }
                    } else if (twos == 3) {
                        if (ones == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else if (threes == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else if (fours == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else if (fives == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else if (sixes == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else {
                            score.setText("3 of a kind!");
                            points.setText("5 points");
                            totalpoints = totalpoints + 5;
                        }
                    } else if (threes == 3) {
                        if (ones == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else if (fours == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else if (twos == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else if (fives == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else if (sixes == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else {
                            score.setText("3 of a kind!");
                            points.setText("5 points");
                            totalpoints = totalpoints + 5;
                        }
                    } else if (fours == 3) {
                        if (ones == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else if (threes == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else if (twos == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else if (fives == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else if (sixes == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else {
                            score.setText("3 of a kind!");
                            points.setText("5 points");
                            totalpoints = totalpoints + 5;
                        }
                    } else if (fives == 3) {
                        if (ones == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else if (threes == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else if (fours == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else if (twos == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else if (sixes == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else {
                            score.setText("3 of a kind!");
                            points.setText("5 points");
                            totalpoints = totalpoints + 5;
                        }
                    } else if (sixes == 3) {
                        if (ones == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else if (threes == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else if (fours == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else if (twos == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else if (fives == 2) {
                            score.setText("Full House!");
                            points.setText("6 points");
                            totalpoints = totalpoints + 6;
                        } else {
                            score.setText("3 of a kind!");
                            points.setText("5 points");
                            totalpoints = totalpoints + 5;
                        }
                    }
                }


                if (rollCount == 4) {
                    if (button.getText() == "Play Again") {
                        rollCount = 0;
                        ones = 0;
                        twos = 0;
                        threes = 0;
                        fours = 0;
                        fives = 0;
                        sixes = 0;
                        a.setImage(images[5]);
                        b.setImage(images[5]);
                        c.setImage(images[5]);
                        d.setImage(images[5]);
                        e.setImage(images[5]);
                        score.setText("");
                        points.setText("");
                    }
                    totalscore.setText("Total score: " + totalpoints);
                    button.setText("Roll Dice");
                }
                rollCount++;
            });
            hbox.getChildren().addAll(a, b, c, d, e);
            totalscore.setStyle("-fx-font-size: 30pt ; -fx-text-fill: #FFFFFF ; -fx-font-style: bolder");
            score.setStyle("-fx-font-size: 20pt ; -fx-font-style: bolder ; -fx-text-fill: #FFFFFF ; -fx-text-fi");
            points.setStyle("-fx-font-size: 12pt ; -fx-text-fill: #FFFFFF ; -fx-font-style: bolder");

            VBox vbox = new VBox(20, totalscore, hbox, button, score, points, previous);
            vbox.setAlignment(Pos.CENTER);
            vbox.setPadding(new Insets(20));
            vbox.setId("background");
            primaryStage.setTitle("Dice Game");
            Scene scene = new Scene(vbox);
            scene.getStylesheets().add("mystyles.css");
            primaryStage.setScene(scene);
            primaryStage.show();
        });

        button2.setOnAction(rockpaperscissorsevent ->{
                HBox finalbox = new HBox(20);
                Label userpoints = new Label("");
                Label comppoints = new Label("");
                HBox points = new HBox(userpoints,comppoints);
                points.setAlignment(Pos.CENTER);
                points.setPadding(new Insets(20));
                VBox vbox = new VBox(10,label, finalbox);
                vbox.setAlignment(Pos.CENTER);
                VBox vboxx = new VBox(comp, result,points,previous);
                vboxx.setAlignment(Pos.CENTER);
                VBox vboxxx = new VBox(100,vbox,vboxx);
                vboxxx.setAlignment(Pos.CENTER);
                vboxxx.setPadding(new Insets(10));
                Random random = new Random();
//                previous.setOnAction(exitaction ->{
//                    cow.setText("");
//                    label.setText("");
//                VBox vbox9 = new VBox(20,cow,label);
//                Label label = new Label("         ");
//                VBox vbox10 = new VBox(20,label,goodbye);
//                HBox box = new HBox(100,vbox9,vbox10);
//                Scene scene = new Scene(box);
//                cow.setStyle("-fx-text-fill: white;");
//                box.setPadding(new Insets(120));
//                scene.getStylesheets().add("doge.css");
//                primaryStage.setScene(scene);
//                primaryStage.show();
                previous.setOnAction(closeevent ->{
                   primaryStage.setScene(scene1);
                });
//                });

                    h.setOnMouseClicked(event -> {
                        int computer = random.nextInt(3);
                        if (computer == 1) {
                            comp.setText("Rock vs. Rock");
                            result.setText("You tied!");
                        } else if (computer == 2) {
                            comp.setText("Rock vs. Paper");
                            result.setText("You lost!");
                            cpoints++;
                        } else {
                            comp.setText("Rock vs. Scissors");
                            result.setText("You won!");
                            upoints++;
                        }
                        userpoints.setText("User points: " + upoints);
                        comppoints.setText("     Computer points: " + cpoints);
                    });
                    i.setOnMouseClicked(event -> {
                        int computer = random.nextInt(3);
                        if (computer == 1) {
                            comp.setText("Paper vs. Rock");
                            result.setText("You won!");
                            upoints++;
                        } else if (computer == 2) {
                            comp.setText("Paper vs. Paper");
                            result.setText("You tied!");
                        } else {
                            comp.setText("Paper vs. Scissors");
                            result.setText("You lost!");
                            cpoints++;
                        }
                        userpoints.setText("User points: " + upoints);
                        comppoints.setText("     Computer points: " + cpoints);
                    });
                    j.setOnMouseClicked(event -> {
                        int computer = random.nextInt(3);
                        if (computer == 1) {
                            comp.setText("Scissors vs. Rock");
                            result.setText("You lost!");
                            cpoints++;
                        } else if (computer == 2) {
                            comp.setText("Scissors vs. Paper");
                            result.setText("You won!");
                            upoints++;
                        } else {
                            comp.setText("Scissors vs. Scissors");
                            result.setText("You tied!");
                        }
                        userpoints.setText("User points: " + upoints);
                        comppoints.setText("     Computer points: " + cpoints);
                    });
                    button.setOnAction(mainmenuevent->{
                        primaryStage.close();
                    });
                Scene scene2 = new Scene(vboxxx);
                scene2.getStylesheets().add("rockpaperscissors.css");
                finalbox.getChildren().addAll(h, i, j);
                finalbox.setPadding(new Insets(20));
                primaryStage.setScene(scene2);
                primaryStage.show();
        });

        button3.setOnAction(slotmachine->{
            VBox first = new VBox(play);
            first.setPadding(new Insets(100));
            Scene scene2 = new Scene(first);
            scene2.getStylesheets().add("styles.css");
            primaryStage.setScene(scene2);
            primaryStage.show();
//                Label label = new Label("");
//                HBox hbox = new HBox(label);
//                cow.setText("$you broke");
//                VBox vbox = new VBox(cow,goodbye);
//                vbox.setAlignment(Pos.CENTER);
//                HBox hboxx = new HBox(vbox,hbox);
//                vbox.setPadding(new Insets(60));
//                Scene scene = new Scene(hboxx);
//                cow.setStyle("-fx-text-fill: lawngreen; -fx-font-size: 20pt; -fx-font-weight: bold;");
//                hbox.setPadding(new Insets(150));
//                scene.getStylesheets().add("money.css");
//                primaryStage.setScene(scene);
//                primaryStage.show();
            play.setOnAction(playevent ->{

                previous.setOnAction(closeevent ->{
                    primaryStage.setScene(scene1);
                });
            Image[] array = new Image[6];
            Button playagain = new Button("Play Again");
            HBox hboxx = new HBox(10);
            Label matches = new Label("");
            Label match = new Label("");
            Label pointslabel = new Label("");
            HBox hboxxx = new HBox(pointslabel);
            VBox vbox = new VBox(30, hboxx);
            VBox vbox4 = new VBox(10,matches,match,hboxxx,playagain,previous);
            vbox4.setAlignment(Pos.CENTER);
            VBox vbox2 = new VBox(30,vbox,vbox4);
            vbox2.setAlignment(Pos.CENTER);
            vbox2.setPadding(new Insets(20));
            array[0]=cherry;
            array[1]=orange;
            array[2]=plum;
            array[3]=bell;
            array[4]=melon;
            array[5]=bar;
            int random1 = random.nextInt(6);
            int random2 = random.nextInt(6);
            int random3 = random.nextInt(6);
            x.setImage(array[random1]);
            y.setImage(array[random2]);
            z.setImage(array[random3]);
            hboxx.getChildren().addAll(x,y,z);
            Scene scene3 = new Scene(vbox2);
            scene3.getStylesheets().add("styles.css");
            matches.setStyle("-fx-text-fill: white; -fx-font: 18 impact;");
            match.setStyle("-fx-text-fill: white; -fx-font: 18 impact;");
            pointslabel.setStyle("-fx-text-fill: white; -fx-font: 18 impact;");
            primaryStage.setScene(scene3);
            primaryStage.show();

            if(random1==random2&&random2==random3) {
                counter += 3;
                matches.setText("  You matched three!");
                match.setText("Buy yourself a lotto ticket! :D");
            }
            else if(random1==random2||random1==random3||random2==random3) {
                counter += 2;
                matches.setText("  You matched two!");
                match.setText("2 points for you!");
            }
            else{
                counter -=1;
                matches.setText("  You matched none");
                match.setText("stop gambling :(");
            }
            pointslabel.setText("                                         Points: " + counter);
            playagain.setOnAction(playagainbutton->{
                int random4 = random.nextInt(6);
                int random5 = random.nextInt(6);
                int random6 = random.nextInt(6);
                x.setImage(array[random4]);
                y.setImage(array[random5]);
                z.setImage(array[random6]);
                if(random4==random5&&random5==random6) {
                    counter += 3;
                    matches.setText("  You matched three!!! (+3 points)");
                    match.setText("Buy yourself a lotto ticket! :D");

                }
                else if(random4==random5||random4==random6||random5==random6) {
                    counter += 2;
                    matches.setText("  You matched two! (+2 points)");
                    match.setText("Keep it up!");
                }
                else {
                    counter -= 1;
                    matches.setText("  You matched none... (-1 point)");
                    match.setText("why are you still gambling? :(");
                }

                pointslabel.setText("                                         Points: " + counter);
                hboxx.getChildren().addAll(x,y,z);
                hboxx.setPadding(new Insets(20));
                Scene scene4 = new Scene(vbox);
                scene4.getStylesheets().add("styles.css");
                primaryStage.setScene(scene4);
                primaryStage.show();
            });
            });
        });
    }


    public static void main(String[] args) {
        launch(args);
    }
}