import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ScrabbleGameController {
    int counterA = 9;
    int counterB = 2;
    int counterC = 2;
    int counterD = 4;
    int counterE = 12;
    int counterF = 2;
    int counterG = 3;
    int counterH = 2;
    int counterI = 8;
    int counterJ = 1;
    int counterK = 1;
    int counterL = 4;
    int counterM = 2;
    int counterN = 6;
    int counterO = 8;
    int counterP = 2;
    int counterQ = 1;
    int counterR = 6;
    int counterS = 4;
    int counterT = 6;
    int counterU = 4;
    int counterV = 2;
    int counterW = 2;
    int counterX = 1;
    int counterY = 2;
    int counterZ = 1;




    int Score[] ={7,5,20,5,7,3,9,8,6,5,4,9,13,14,20,11,22,7,5,7,5,9,10,27,21,11};

    @FXML
    private Button clickBButton;

    @FXML
    private Button clickCButton;

    @FXML
    private Button clickDButton;

    @FXML
    private Button clickEButton;

    @FXML
    private Button clickFButton;

    @FXML
    private Button clickGButton;

    @FXML
    private Button clickHButton;

    @FXML
    private Button clickOButton;

    @FXML
    private Button clickVButton;

    @FXML
    private Button clickIButton;

    @FXML
    private Button clickPButton;

    @FXML
    private Button clickXButton;

    @FXML
    private Button clickAButton;

    @FXML
    private Button clickJButton;

    @FXML
    private Button clickQButton;

    @FXML
    private Button clickYButton;

    @FXML
    private Button clickKButton;

    @FXML
    private Button clickRButton;

    @FXML
    private Button clickZ;

    @FXML
    private Button clickLButton;

    @FXML
    private Button clickSButton;

    @FXML
    private Button clickMButton;

    @FXML
    private Button clickTButton;

    @FXML
    private Button clickNButton;

    @FXML
    private Button clickUButton;

    @FXML
    private TextArea TextFieldID;
    @FXML
    private TextField WordLabel;
    @FXML
    private Button submitButton;

    @FXML
    private Button totalScoreButton;

    @FXML
    private TextField totalScoreID;
    @FXML
    private Label error;
    private String word;



    @FXML
    void DisplayA(ActionEvent event) {
        Button button = (Button) (event.getSource());
        String buttonValue = button.getText();
        if(counterA <1){
            error.setText("sorry you are out of A");
        } else {
            counterA--;
            WordLabel.setText(WordLabel.getText() + buttonValue);
        }
    }

    @FXML
    void DisplayE(ActionEvent event) {
        Button button = (Button) (event.getSource());
        String buttonValue = button.getText();
        if(counterE<1){
            error.setText("sorry you are out of E");
        }else{
        counterE--;
            WordLabel.setText(WordLabel.getText() + buttonValue);}

    }

    @FXML
    void dislpayB(ActionEvent event) {
        Button button = (Button) (event.getSource());
        String buttonValue = button.getText();
        if(counterB <1){
            error.setText("sorry you are out of B ");
        }else{
        counterB--;
            WordLabel.setText(WordLabel.getText() + buttonValue);


        }

    }

    @FXML
    void displayC(ActionEvent event) {
        Button button = (Button) (event.getSource());
        String buttonValue = button.getText();

        if(counterC <1){
            error.setText("sorry you are out of C");
        }else{
        counterC--;
        WordLabel.setText(WordLabel.getText() + buttonValue);
        }

    }

    @FXML
    void displayD(ActionEvent event) {
        Button button = (Button) (event.getSource());
        String buttonValue = button.getText();
        if(counterD <1){
            error.setText("sorry you are out of D");
        }else{
        counterD--;
        WordLabel.setText(WordLabel.getText() + buttonValue);
        }

    }

    @FXML
    void displayF(ActionEvent event) {
        Button button = (Button) (event.getSource());
        String buttonValue = button.getText();
        if(counterF <1){
            error.setText("sorry you are out of F ");
        }else{
        counterF --;
            WordLabel.setText(WordLabel.getText() + buttonValue);
        }

    }

    @FXML
    void displayG(ActionEvent event) {
        Button button = (Button) (event.getSource());
        String buttonValue = button.getText();
        if(counterG <1){
            error.setText("sorry you are out of G");
        }else{
        counterG--;
        WordLabel.setText(WordLabel.getText() + buttonValue);;}

    }

    @FXML
    void displayH(ActionEvent event) {
        Button button = (Button) (event.getSource());
        String buttonValue = button.getText();
        if(counterH <1){
            error.setText("sorry you are out of H ");
        }else{
        counterH--;
        WordLabel.setText(WordLabel.getText() + buttonValue);
        }

    }

    @FXML
    void displayI(ActionEvent event) {
        Button button = (Button) (event.getSource());
        String buttonValue = button.getText();
        if(counterI <1){
            error.setText("sorry you are out of I ");
        }else{
            counterI--;
            WordLabel.setText(WordLabel.getText() + buttonValue);
        }

    }

    @FXML
    void displayJ(ActionEvent event) {
        Button button = (Button) (event.getSource());
        String buttonValue = button.getText();
        if(counterJ <1){
            error.setText("sorry you are out of J ");
        }else{
            counterJ--;
            WordLabel.setText(WordLabel.getText() + buttonValue);
        }

    }

    @FXML
    void displayK(ActionEvent event) {
        Button button = (Button) (event.getSource());
        String buttonValue = button.getText();
        if(counterK <1){
            error.setText("sorry you are out of K ");
        }else{
            counterK--;
            WordLabel.setText(WordLabel.getText() + buttonValue);
        }

    }

    @FXML
    void displayL(ActionEvent event) {
        Button button = (Button) (event.getSource());
        String buttonValue = button.getText();
        if(counterL <1){
            error.setText("sorry you are out of L ");
        }else{
            counterL--;
            WordLabel.setText(WordLabel.getText() + buttonValue);
        }

    }

    @FXML
    void displayM(ActionEvent event) {
        Button button = (Button) (event.getSource());
        String buttonValue = button.getText();
        if(counterM <1){
            error.setText("sorry you are out of M");
        }else{
            counterM--;
            WordLabel.setText(WordLabel.getText() + buttonValue);
        }


    }

    @FXML
    void displayN(ActionEvent event) {
        Button button = (Button) (event.getSource());
        String buttonValue = button.getText();
        if(counterN <1){
            error.setText("sorry you are out of N ");
        }else{
            counterN--;
            WordLabel.setText(WordLabel.getText() + buttonValue);
        }

    }

    @FXML
    void displayOButton(ActionEvent event) {
        Button button = (Button) (event.getSource());
        String buttonValue = button.getText();
        if(counterO <1){
            error.setText("sorry you are out of O ");
        }else{
            counterO--;
            WordLabel.setText(WordLabel.getText() + buttonValue);
        }

    }

    @FXML
    void displayP(ActionEvent event) {
        Button button = (Button) (event.getSource());
        String buttonValue = button.getText();
        if(counterM <1){
            error.setText("sorry you are out of M ");
        }else{
            counterM--;
            WordLabel.setText(WordLabel.getText() + buttonValue);
        }

    }

    @FXML
    void displayQ(ActionEvent event) {
        Button button = (Button) (event.getSource());
        String buttonValue = button.getText();
        if(counterQ <1){
            error.setText("sorry you are out of Q ");
        }else{
            counterQ--;
            WordLabel.setText(WordLabel.getText() + buttonValue);
        }

    }

    @FXML
    void displayR(ActionEvent event) {
        Button button = (Button) (event.getSource());
        String buttonValue = button.getText();
        if(counterR <1){
            error.setText("sorry you are out of R ");
        }else{
            counterR--;
            WordLabel.setText(WordLabel.getText() + buttonValue);
        }

    }

    @FXML
    void displayS(ActionEvent event) {
        Button button = (Button) (event.getSource());
        String buttonValue = button.getText();
        if(counterS <1){
            error.setText("sorry you are out of S ");
        }else{
            counterS--;
            WordLabel.setText(WordLabel.getText() + buttonValue);
        }

    }

    @FXML
    void displayT(ActionEvent event) {
        Button button = (Button) (event.getSource());
        String buttonValue = button.getText();
        if(counterT <1){
            error.setText("sorry you are out of T ");
        }else{
            counterT--;
            WordLabel.setText(WordLabel.getText() + buttonValue);
        }

    }

    @FXML
    void displayU(ActionEvent event) {
        Button button = (Button) (event.getSource());
        String buttonValue = button.getText();
        if(counterU <1){
            error.setText("sorry you are out of U ");
        }else{
            counterU--;
            WordLabel.setText(WordLabel.getText() + buttonValue);
        }

    }

    @FXML
    void displayV(ActionEvent event) {
        Button button = (Button) (event.getSource());
        String buttonValue = button.getText();
        if(counterV <1){
            error.setText("sorry you are out of V ");
        }else{
            counterV--;
            WordLabel.setText(WordLabel.getText() + buttonValue);
        }

    }
    @FXML
    void displayW(ActionEvent event) {
        Button button = (Button) (event.getSource());
        String buttonValue = button.getText();
        if(counterW < 1){
            error.setText("sorry you are out of W");
          }else{
            counterW--;
            WordLabel.setText(WordLabel.getText() + buttonValue);
        }

    }

    @FXML
    void displayX(ActionEvent event) {
        Button button = (Button) (event.getSource());
        String buttonValue = button.getText();
        if(counterX <1){
            error.setText("sorry you are out of X ");
        }else{
            counterX--;
            WordLabel.setText(WordLabel.getText() + buttonValue);
        }

    }

    @FXML
    void displayY(ActionEvent event) {
        Button button = (Button) (event.getSource());
        String buttonValue = button.getText();
        if(counterY <1){
            error.setText("sorry you are out of Y ");
        }else{
            counterY--;
            WordLabel.setText(WordLabel.getText() + buttonValue);
        }

    }

    @FXML
    void displayZ(ActionEvent event) {
        Button button = (Button) (event.getSource());
        String buttonValue = button.getText();
        if(counterZ <1){
            error.setText("sorry you are out of Z ");
        }else{
            counterZ--;
            WordLabel.setText(WordLabel.getText() + buttonValue);
        }

    }


    @FXML
    void SubmitAction(ActionEvent event) {

         String word = WordLabel.getText();
         char[] s = word.toCharArray();
         if(word.contains("a")|| word.contains("e")|| word.contains("i")||word.contains("o")||word.contains("u")||word.contains("A")||word.contains("E")||word.contains("I")||word.contains("O")||word.contains("U")){
             if(word.length()>2 || word.length()<8){
                 error.setText("");
                 TextFieldID.setText(word);
             }
             WordLabel.setText("");
        }
         else{
         error.setText("should  be 2-8 char & contain vowels ");
         }
    }
    @FXML
    void totalScoreAction(ActionEvent event) {

        }

    public static void CheckWords(String word){


    }


}
