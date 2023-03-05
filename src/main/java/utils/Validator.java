package utils;

public class Validator {

    static int LOTTO_PRICE = 1000;
    private enum ConsoleMessage {
        INVALID_NOT_NUMERIC("자연수만 입력 가능합니다."),
        INVALID_UNIT_OF_BUDGET(String.format("%d원 단위로 구매 가능합니다.", LOTTO_PRICE));
        private final String BASE_MESSAGE = "[ERROR] %s";
        String message;
        ConsoleMessage(String message) {
            this.message = String.format(BASE_MESSAGE, message);
        }
    }

    public static void inputBudget(String budget){

        try{
            if (Integer.parseInt(budget) % LOTTO_PRICE != 0) {
                throw new IllegalArgumentException(ConsoleMessage.INVALID_UNIT_OF_BUDGET.message);
            }
        }catch (NumberFormatException e){
            throw new IllegalArgumentException(ConsoleMessage.INVALID_NOT_NUMERIC.message);
        }
    }
}
