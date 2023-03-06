package views;

import models.Budget;

public class OutputView {

    private enum ConsoleMessage {
        OUTPUT_TOTAL_BUY_LOTTO("개를 구매했습니다.");
        private final String message;

        ConsoleMessage(String message) {
            this.message = message;
        }
    }
    public static void buyTheLotto(int budget){
        System.out.println(Budget.divideAmount(budget)
                +ConsoleMessage.OUTPUT_TOTAL_BUY_LOTTO.message);
    }
}
