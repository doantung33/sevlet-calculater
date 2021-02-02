public class Calculater {
    public static float calculater(float firstOperand, float secondOperand,char operand){
        switch (operand){
            case '+':
                return firstOperand+secondOperand;
                case '-':
                return firstOperand-secondOperand;
                case '*':
                return firstOperand*secondOperand;
                case '/':
            if (secondOperand!=0){
                return firstOperand/secondOperand;
            }else {
                throw new RuntimeException("Không thể chia cho 0");
            } default:
                throw new RuntimeException("404");
        }
    }
}
