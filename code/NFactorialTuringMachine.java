
public class NFactorialTuringMachine {

    void factorial(int num) {
        StringBuilder stringInput = new StringBuilder();
        String state = "q0";
        int curr = 0;
        stringInput.append("$".repeat(Math.max(0, 10 * num)));
        stringInput.append("0".repeat(Math.max(0, num)));
        stringInput.append("1");
        stringInput.append("0");
        stringInput.append("$".repeat(Math.max(0,250 * num)));
        StringBuilder input = new StringBuilder(stringInput.toString());
        StringBuilder output ;
        System.out.println("Part2(3n)!");
        System.out.println("Input : " + input);
        while (true) {
            if (state.equals("q0")) {
                if (input.charAt(curr) == '$'){
                    input.setCharAt(curr, '$');
                    curr++;
                }
                else if (input.charAt(curr) == '0') {
                    input.setCharAt(curr, 'Z');
                    curr++;
                    state = "q1";
                } else if (input.charAt(curr) == '1') {
                    input.setCharAt(curr, '1');
                    curr++;
                    state = "q13";
                } else {
                    break;
                }
            } else if (state.equals("q1")) {
                if (input.charAt(curr) == '0') {
                    input.setCharAt(curr, '0');
                    curr++;
                } else if (input.charAt(curr) == '1') {
                    input.setCharAt(curr, '1');
                    curr++;
                    state = "q2";
                } else {
                    break;
                }
            } else if (state.equals("q2")) {
                if (input.charAt(curr) == '0') {
                    input.setCharAt(curr, 'Y');
                } else if (input.charAt(curr) == 'Y') {
                    input.setCharAt(curr, 'Y');
                    curr++;
                }
                else if (input.charAt(curr) == '1') {
                    input.setCharAt(curr, '1');
                    curr++;
                }
                else if (input.charAt(curr) == '$') {
                    input.setCharAt(curr, '$');
                    curr--;
                    state = "q3";
                }
                else {
                    break;
                }
            } else if (state.equals("q3")) {
                if (input.charAt(curr) == '0') {
                    input.setCharAt(curr, '0');
                    curr--;
                } else if (input.charAt(curr) == 'V') {
                    input.setCharAt(curr, 'V');
                    curr--;
                } else if (input.charAt(curr) == 'Y') {
                    input.setCharAt(curr, 'V');
                    curr++;
                    state = "q4";
                } else if (input.charAt(curr) == '1') {
                    input.setCharAt(curr, '1');
                    curr++;
                    state = "q9";
                }
                else {
                    break;
                }
            } else if (state.equals("q4")) {
                if (input.charAt(curr) == '0') {
                    input.setCharAt(curr, '0');
                    curr++;
                } else if (input.charAt(curr) == 'V') {
                    input.setCharAt(curr, 'V');
                    curr++;
                } else if (input.charAt(curr) == '$') {
                    input.setCharAt(curr, '0');
                    curr--;
                    state = "q3";
                } else {
                    break;
                }
            } else if (state.equals("q5")) {
                if (input.charAt(curr) == '0') {
                    input.setCharAt(curr, '0');
                    curr--;
                } else if (input.charAt(curr) == '1') {
                    input.setCharAt(curr, '1');
                    curr--;
                } else if (input.charAt(curr) == 'Z') {
                    input.setCharAt(curr, 'Z');
                    curr--;
                }
                else if (input.charAt(curr) == 'Y') {
                    input.setCharAt(curr, 'Y');
                    curr--;
                }
                else if (input.charAt(curr) == 'X') {
                    input.setCharAt(curr, 'Z');
                    curr++;
                    state = "q10";
                }
                else if (input.charAt(curr) == '$') {
                    input.setCharAt(curr, '$');
                    curr++;
                    state = "q8";
                } else {
                    break;
                }
            } else if (state.equals("q6")) {
                if (input.charAt(curr) == 'X') {
                    input.setCharAt(curr, '$');
                    curr--;
                } else if (input.charAt(curr) == 'Z') {
                    input.setCharAt(curr, '$');
                    curr--;
                } else if (input.charAt(curr) == '1') {
                    input.setCharAt(curr, '$');
                    curr--;
                }else if (input.charAt(curr) == '$') {
                    input.setCharAt(curr, '$');
                    curr--;
                    state = "q7";
                }
                else {
                    break;
                }
            } else if (state.equals("q8")) {
                if (input.charAt(curr) == 'Z') {
                    input.setCharAt(curr, 'X');
                    curr++;
                } else if (input.charAt(curr) == '0') {
                    input.setCharAt(curr, '0');
                    curr++;
                } else if (input.charAt(curr) == '1') {
                    input.setCharAt(curr, '1');
                    curr++;
                    state = "q11";
                }
                else {
                    break;
                }
            }else if (state.equals("q9")) {
                if (input.charAt(curr) == 'V') {
                    input.setCharAt(curr, 'Y');
                    curr++;
                } else if (input.charAt(curr) == '0') {
                    input.setCharAt(curr, '0');
                    curr--;
                    state = "q5";
                } else {
                    break;
                }
            }else if (state.equals("q10")) {
                if (input.charAt(curr) == '0') {
                    input.setCharAt(curr, '0');
                    curr++;
                } else if (input.charAt(curr) == '1') {
                    input.setCharAt(curr, '1');
                    curr++;
                } else if (input.charAt(curr) == 'Z') {
                    input.setCharAt(curr, 'Z');
                    curr++;
                } else if (input.charAt(curr) == 'Y') {
                    input.setCharAt(curr, 'Y');
                    curr++;
                } else if (input.charAt(curr) == '$') {
                    input.setCharAt(curr, '$');
                    curr--;
                    state = "q3";
                } else {
                    break;
                }
            }else if (state.equals("q11")) {
                if (input.charAt(curr) == '1') {
                    input.setCharAt(curr, '1');
                    curr++;
                } else if (input.charAt(curr) == 'Y') {
                    input.setCharAt(curr, '1');
                    curr++;
                } else if (input.charAt(curr) == '0') {
                    input.setCharAt(curr, '0');
                    curr--;
                    state = "q12";
                } else {
                    break;
                }
            }else if (state.equals("q12")) {
                if (input.charAt(curr) == '1') {
                    input.setCharAt(curr, '1');
                    curr--;
                } else if (input.charAt(curr) == '0') {
                    input.setCharAt(curr, '0');
                    curr--;
                } else if (input.charAt(curr) == 'X') {
                    input.setCharAt(curr, 'X');
                    curr++;
                    state = "q0";
                } else {
                    break;
                }
            }else if (state.equals("q13")) {
                if (input.charAt(curr) == '1') {
                    input.setCharAt(curr, '1');
                    curr++;
                } else if (input.charAt(curr) == '0') {
                    input.setCharAt(curr, '0');
                    curr--;
                    state = "q6";
                } else {
                    break;
                }
            }
            else if (state.equals("q7")) {
                System.out.println("Output : " + input);
                output = input;
                Multiplication2 multiplication2 = new Multiplication2();
                String result = output.toString();
                int m = 0;
                for(int i = 0;i<result.length();i++){
                    if(result.charAt(i) == '0')
                        m++;
                }
                System.out.println("**********************************************");
                multiplication2.multi(m);
                return;
            }
        }
    }
}