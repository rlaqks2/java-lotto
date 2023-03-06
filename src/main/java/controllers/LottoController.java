package controllers;


import views.InputView;
import views.OutputView;

public class LottoController {

    public static void play() {
        int budget = InputView.readBudget();
        OutputView.buyTheLotto(budget);
    }
}
