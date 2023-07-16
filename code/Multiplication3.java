public class Multiplication3 {
    public void multi(int num) {
        StringBuilder tape = new StringBuilder();
        tape.append("0".repeat(Math.max(0, 3)));
        tape.append("1");
        tape.append("0".repeat(Math.max(0, num)));
        tape.append("1");
        tape.append("$".repeat(Math.max(0, 10 * num)));
        StringBuilder input = new StringBuilder(tape.toString());
        String state = "q0";
        int curr = 0;
        System.out.println("Part1(3n)");
        System.out.println("Input : " + input);
        StringBuilder output ;
        while (true) {
            if (state.equals("q0")) {
                if (input.charAt(curr) == '0') {
                    input.setCharAt(curr, '$');
                    curr++;
                    state = "q1";
                } else if (input.charAt(curr) == '1') {
                    input.setCharAt(curr, '$');
                    curr++;
                    state = "q7";
                }else {
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
                    input.setCharAt(curr, 'X');
                    curr++;
                    state = "q3";
                } else if (input.charAt(curr) == '1') {
                    input.setCharAt(curr, '1');
                    curr--;
                    state = "q5";
                } else {
                    break;
                }
            } else if (state.equals("q3")) {
                if (input.charAt(curr) == '1') {
                    input.setCharAt(curr, '1');
                    curr++;
                } else if (input.charAt(curr) == '0') {
                    input.setCharAt(curr, '0');
                    curr++;
                } else if (input.charAt(curr) == '$') {
                    input.setCharAt(curr, '0');
                    curr--;
                    state = "q4";
                } else {
                    break;
                }
            } else if (state.equals("q4")) {
                if (input.charAt(curr) == '0') {
                    curr--;
                } else if (input.charAt(curr) == '1') {
                    input.setCharAt(curr, '1');
                    curr--;
                } else if (input.charAt(curr) == 'X') {
                    input.setCharAt(curr, 'X');
                    curr++;
                    state = "q2";
                }
                else {
                    break;
                }
            } else if (state.equals("q5")) {
                if (input.charAt(curr) == 'X') {
                    input.setCharAt(curr, '0');
                    curr--;
                } else if (input.charAt(curr) == '1') {
                    input.setCharAt(curr, '1');
                    curr--;
                    state = "q6";
                } else {
                    break;
                }
            } else if (state.equals("q6")) {
                if (input.charAt(curr) == '0') {
                    input.setCharAt(curr, '0');
                    curr--;
                } else if (input.charAt(curr) == '$') {
                    input.setCharAt(curr, '$');
                    curr++;
                    state = "q0";
                } else {
                    break;
                }
            } else if (state.equals("q7")) {
                if (input.charAt(curr) == '0') {
                    input.setCharAt(curr, '$');
                    curr++;
                } else if (input.charAt(curr) == '1') {
                    input.setCharAt(curr, '$');
                    curr++;
                    state = "q8";
                } else {
                    break;
                }
            } else if (state.equals("q8")) {
                output = input;
                System.out.print("Output : ");
                System.out.println(input);
                System.out.println("******************************************************");
                NFactorialTuringMachine factorial1 = new NFactorialTuringMachine();
                String[] m1 = output.toString().split("0");
                factorial1.factorial(m1.length-1);
                return;
            }
        }
    }
}