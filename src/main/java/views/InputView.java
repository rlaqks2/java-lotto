package views;

import camp.nextstep.edu.missionutils.Console;
import utils.Validator;

public class InputView {




    private enum ConsoleMessage {
        INPUT_BUDGET("구입금액을 입력해 주세요."),
        INPUT_WINNING_NUMBER("당첨 번호를 입력해 주세요."),
        INPUT_BONUS_NUMBER("보너스 번호를 입력해 주세요.");
        private final String message;

        ConsoleMessage(String message) {
            this.message = message;
        }
    }

    public static int readBudget(){
        System.out.println(ConsoleMessage.INPUT_BUDGET.message);
        String budget = Console.readLine();

        Validator.inputBudget(budget);
        return Integer.parseInt(budget);
    }
}
