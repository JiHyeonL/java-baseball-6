package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class GameController {

    public PrintMessage printMessage = new PrintMessage();
    public List<Integer> computer = new ArrayList<>();  // 컴퓨터(정답) 번호
    public List<Integer> user = new ArrayList<>();  // 유저가 입력한 번호
    public int status = 1;   // 야구 게임의 상태가 새로 시작(1) 인지, 종료(2) 인지 구분
    public void start() {
        printMessage.start();

        while(status == 1) {
            gaming();
        }
    }

    private void gaming() {
        GameTool gameTool = new GameTool();
        Exception exception = new Exception();
        computer = gameTool.generatedRandomNumbers(3); // 3개 랜덤 숫자 생성
        // 테스트
        System.out.println(computer);

        while(true) {
            printMessage.requestNumber();
            String number = Console.readLine();

            user = exception.isValid(number);    // 예외 발생하지 않으면 List<Integer> 형태로 숫자 반환

            int strike = gameTool.countStrike(computer, user);
            int ball = gameTool.countBall(computer, user);
            boolean nothing = gameTool.isNothing(computer, user);

            printMessage.hint(strike, ball, nothing);

            if (strike == 3) {
                printMessage.gameEnd();
                status = Integer.parseInt(Console.readLine());
                break;
            }
       }
    }
}