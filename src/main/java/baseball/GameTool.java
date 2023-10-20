package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class GameTool {

    public List<Integer> generatedRandomNumbers(int n) {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < n) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }
    /*
     * 스트라이크 개수를 반환
     */
    public int countStrike(List<Integer> computer, List<Integer> user) {

    }
    /*
     * 볼 개수를 반환
     */
    public int countBall(List<Integer> computer, List<Integer> user) {

    }
    /*
     * 낫싱일 경우 true, 아닐 경우 false 반환
     */
    public boolean isNothing(List<Integer> computer, List<Integer> user) {

    }
    /*
     * 힌트 결과 출력
     */
    public void printHint(int strike, int ball, boolean nothing) {

    }
}