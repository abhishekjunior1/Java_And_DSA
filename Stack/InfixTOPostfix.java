// import java.util.*;

// class InfixTOPostfix {
//     public static void main(String args[]) {
//         String infix = "9-(5+3)*4/6";
//         Stack<String> data = new Stack<>();
//         Stack<Character> op = new Stack<>();

//         for (int i = 0; i < infix.length(); i++) {
//             char ch = infix.charAt(i);
//             if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
//                 String s = "" + ch;
//                 data.push(s);
//             } else if (ch == '(' || op.isEmpty() || op.peek() == '(') {
//                 op.push(ch);
//             } else if (ch == ')') {
//                 while (op.peek() != '(') {
//                     String v2 = data.pop();
//                     String v1 = data.pop();
//                     char o = op.pop();
//                     String t = v1 + v2 + o;
//                     data.push(t);
//                 }
//                 op.pop(); // Remove the '('
//             } else {
//                 if (ch == '+' || ch == '-') {
//                     while (!op.isEmpty() && (op.peek() == '+' || op.peek() == '-' || op.peek() == '*' || op.peek() == '/')) {
//                         String v2 = data.pop();
//                         String v1 = data.pop();
//                         char o = op.pop();
//                         String t = v1 + v2 + o;
//                         data.push(t);
//                     }
//                     op.push(ch);
//                 } else if (ch == '*' || ch == '/') {
//                     while (!op.isEmpty() && (op.peek() == '*' || op.peek() == '/')) {
//                         String v2 = data.pop();
//                         String v1 = data.pop();
//                         char o = op.pop();
//                         String t = v1 + v2 + o;
//                         data.push(t);
//                     }
//                     op.push(ch);
//                 } else {
//                     op.push(ch);
//                 }
//             }
//         }

//         while (!op.isEmpty()) {
//             String v2 = data.pop();
//             String v1 = data.pop();
//             char o = op.pop();
//             String t = v1 + v2 + o;
//             data.push(t);
//         }
//         System.out.println(data.peek());
//     }
// }
// import java.util.*;

// class InfixToPostfix {
//     public static int precedence(char ch) {
//         switch (ch) {
//             case '+':
//             case '-':
//                 return 1;
//             case '*':
//             case '/':
//                 return 2;
//             case '%':
//                 return 3;
//         }
//         return -1;
//     }

//     public static String infixToPostfix(String infix) {
//         Stack<String> data = new Stack<>();
//         Stack<Character> op = new Stack<>();

//         for (int i = 0; i < infix.length(); i++) {
//             char ch = infix.charAt(i);
//             if (Character.isLetterOrDigit(ch)) {
//                 data.push(String.valueOf(ch));
//             } else if (ch == '(') {
//                 op.push(ch);
//             } else if (ch == ')') {
//                 while (!op.isEmpty() && op.peek() != '(') {
//                     String v2 = data.pop();
//                     String v1 = data.pop();
//                     char o = op.pop();
//                     String t = v1 + v2 + o;
//                     data.push(t);
//                 }
//                 op.pop(); // Remove the '('
//             } else {
//                 while (!op.isEmpty() && precedence(ch) <= precedence(op.peek())) {
//                     String v2 = data.pop();
//                     String v1 = data.pop();
//                     char o = op.pop();
//                     String t = v1 + v2 + o;
//                     data.push(t);
//                 }
//                 op.push(ch);
//             }
//         }

//         while (!op.isEmpty()) {
//             String v2 = data.pop();
//             String v1 = data.pop();
//             char o = op.pop();
//             String t = v1 + v2 + o;
//             data.push(t);
//         }

//         return data.peek();
//     }

//     public static void main(String args[]) {
//         String infix = "9-(5+3)*4/6";
//         String postfix = infixToPostfix(infix);
//         System.out.println(postfix);
//     }
// }

