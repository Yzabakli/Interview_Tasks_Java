package other_algo_questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class RemoveWholeSquares {

    public static void main(String[] args) throws IOException {

//        String inputData = "";
//        String thisLine;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        while ((thisLine = br.readLine()) != null) {
//            if (thisLine.isEmpty()) break;
//            inputData += thisLine + "\n";
//        }
//
//        System.out.println(codeHere(inputData));
        System.out.println(codeHere("10\n9\n151\n16\n8\n"));
        LinkedList<Integer> list = new LinkedList<>(List.of(1, 2, 3));
        System.out.println(list.size());
    }


    private static String codeHere(String inputData) {

        String modifiedInputData = inputData.replaceAll("\n", "n");
        String currentNumber = "";
        String lastWholeNumber = "";

        for (int i = 0; i < modifiedInputData.length(); ) {

            if (Character.isDigit(modifiedInputData.charAt(i))) {

                currentNumber += "" + modifiedInputData.charAt(i);

            } else if (modifiedInputData.charAt(i) == 'n') {

                if (Math.sqrt(Integer.parseInt(currentNumber)) % 1 == 0) {

                    lastWholeNumber = currentNumber;
                    modifiedInputData = modifiedInputData.substring(0, i - currentNumber.length()) + modifiedInputData.substring(i + 1);
                    i -= currentNumber.length() + 1;
                }
                currentNumber = "";
            }
            i++;
        }

        return (modifiedInputData.replaceAll("[^n]", "").length()) + "\n" + lastWholeNumber;
    }
}
