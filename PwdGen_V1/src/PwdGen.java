import java.util.Random;
import java.util.Scanner;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class PwdGen {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Random random = new Random();
        String opc = "";
        String pass = null;
        String pass1 = "";
        String sub = "";//

        int val = args.length;

        if (val == 1) {

            if (args[0].length() < 3) {

                if (args[0].equals("-?")) {
                    System.out.println("Displays the options to generate secure restrictions in PwdGen.");
                    System.out.println();

                    System.out.println(" -U          Include uppercase letters.");
                    System.out.println(" -L 	     Include lowercase letters.");
                    System.out.println(" -N  	     Include numbers.");
                    System.out.println(" -S  	     Include symbols.");
                    System.out.println(" -A  	     Exclude old characters.");
                    System.out.println(" -E          Exclude the symbols supplied.");
                    System.out.println(" -C          Password Copy.");
                    System.out.println(" -T          Generate three passwords.");
                    System.out.println(" -D          Default.");
                    System.out.println(" -SIZE       Password size.");
                    System.out.print("Press any Key to continue . . .");
                    x.nextLine();
                } else if (args[0].equals("-D")) {
                    String[] default1 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r",
                        "s", "t", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
                    int length1 = default1.length;
                    int newlong = 16;
                    String val2 = "";
                    for (int i = 0; i < newlong; i++) {
                        pass = default1[random.nextInt(length1)];
                        pass1 = pass1 + pass;
                    }
                    System.out.println(pass1);
                } else if (args[0].equals("-T")) {
                    for (int j = 0; j < 3; j++) {
                        String[] quantitypas = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r",
                            "s", "t", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
                        int length1 = quantitypas.length;
                        int newlong = 16;
                        String val2 = "";
                        for (int i = 0; i < newlong; i++) {
                            pass = quantitypas[random.nextInt(length1)];
                            pass1 = pass1 + pass;
                        }
                        System.out.println((j + 1) + pass1);
                        pass = null;
                        pass1 = "";
                    }

                } else if (args[0].equals("-U")) {
                    String[] capitalletter = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r",
                        "s", "t", "v", "w", "x", "y", "z"};
                    int length1 = capitalletter.length;
                    int newlong = 16;
                    String val2 = "";
                    for (int i = 0; i < newlong; i++) {
                        pass = capitalletter[random.nextInt(length1)];
                        pass1 = pass1 + pass;
                    }
                    String pa = pass1.toUpperCase();
                    System.out.println(pa);

                } else if (args[0].equals("-L")) {
                    String[] lowercaseletter = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r",
                        "s", "t", "v", "w", "x", "y", "z"};
                    int length1 = lowercaseletter.length;
                    int newlong = 16;
                    String val2 = "";
                    for (int i = 0; i < newlong; i++) {
                        pass = lowercaseletter[random.nextInt(length1)];
                        pass1 = pass1 + pass;
                    }
                    System.out.println(pass1);

                } else if (args[0].equals("-N")) {
                    String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
                    int length1 = numbers.length;
                    int newlong = 16;
                    String val2 = "";
                    for (int i = 0; i < newlong; i++) {
                        pass = numbers[random.nextInt(length1)];
                        pass1 = pass1 + pass;
                    }
                    System.out.println(pass1);

                } else if (args[0].equals("-S")) {
                    String[] symbols = {"$", "#", "&", "/", "(", ")", "=", "?", "¡", "¿", "°", "|", "[", "[", "]", "@", "[]", "{}", ",", "ª"};
                    int length1 = symbols.length;
                    int newlong = 16;
                    String val2 = "";
                    for (int i = 0; i < newlong; i++) {
                        pass = symbols[random.nextInt(length1)];
                        pass1 = pass1 + pass;
                    }
                    System.out.println(pass1);

                } else if (args[0].equals("-A")) {
                    String[] excambiguous = {"a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "m", "n", "ñ", "p", "q", "r",
                        "s", "t", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "M", "N", "P", "Q",
                         "R", "S", "T", "U", "V", "W", "X", "z", "2", "3", "4", "5", "6", "7", "8", "9"};
                    int length1 = excambiguous.length;
                    int newlong = 16;
                    String val2 = "";
                    for (int i = 0; i < newlong; i++) {
                        pass = excambiguous[random.nextInt(length1)];
                        pass1 = pass1 + pass;
                    }
                    System.out.println(pass1);
                } else if (args[0].equals("-E")) {
                    String[] excsymbol = {"$", "#", "&", "/", "(", ")", "=", "?", "¡", "¿", "°", "|", "[", "[", "]"};
                    int length1 = excsymbol.length;
                    int newlong = 16;
                    String val2 = "";
                    for (int i = 0; i < newlong; i++) {
                        pass = excsymbol[random.nextInt(length1)];
                        pass1 = pass1 + pass;
                    }
                    System.out.println(pass1);
                } else {

                    System.out.println("dir /? ");
                }

            } else if (args[0].length() > 4) {

                int cont = args[0].length();
                if (cont > 6) {

                    sub = args[0].substring(6);

                    String[] passsize = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r",
                        "s", "t", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R",
                        "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
                    int length1 = passsize.length;
                    int newlong = Integer.parseInt(sub);
                    String val2 = "";
                    for (int i = 0; i < newlong; i++) {
                        pass = passsize[random.nextInt(length1)];
                        pass1 = pass1 + pass;
                    }
                    System.out.println(pass1);

                }

            }

        } else if (val == 2) {

            if ((args[0].equals("-U") && args[1].equals("-L")) || (args[0].equals("-L") && args[1].equals("-U"))) {

                String[] caplow = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r",
                    "s", "t", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R",
                    "S", "T", "U", "V", "W", "X", "Y", "Z"};
                int length1 = caplow.length;
                int newlong = 16;
                String val2 = "";
                for (int i = 0; i < newlong; i++) {
                    pass = caplow[random.nextInt(length1)];
                    pass1 = pass1 + pass;
                }
                System.out.println(pass1);

            } else if ((args[0].equals("-U") && args[1].equals("-S")) || (args[0].equals("-S") && args[1].equals("-U"))) {

                String[] capsymbol = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V",
                    "W", "X", "Y", "Z", "$", "#", "&", "/", "(", ")", "=", "?", "¡", "¿", "°", "|", "[", "[", "]", "@", "[]", "{}", ",", "ª"};
                int length1 = capsymbol.length;
                int newlong = 16;
                String val2 = "";
                for (int i = 0; i < newlong; i++) {
                    pass = capsymbol[random.nextInt(length1)];
                    pass1 = pass1 + pass;
                }
                System.out.println(pass1);

            } else if ((args[0].equals("-L") && args[1].equals("-S")) || (args[0].equals("-S") && args[1].equals("-L"))) {

                String[] lowersym = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s",
                    "t", "v", "x", "y", "z", "$", "#", "&", "/", "(", ")", "=", "?", "¡", "¿", "°", "|", "[", "[", "]", "@", "[]", "{}", ",", "ª"};
                int length1 = lowersym.length;
                int newlong = 16;
                String val2 = "";
                for (int i = 0; i < newlong; i++) {
                    pass = lowersym[random.nextInt(length1)];
                    pass1 = pass1 + pass;
                }
                System.out.println(pass1);

            } else if ((args[0].equals("-N") && args[1].equals("-U")) || (args[0].equals("-U") && args[1].equals("-N"))) {

                String[] numbcap = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V",
                    "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
                int length1 = numbcap.length;
                int newlong = 16;
                String val2 = "";
                for (int i = 0; i < newlong; i++) {
                    pass = numbcap[random.nextInt(length1)];
                    pass1 = pass1 + pass;
                }
                System.out.println(pass1);
            } else if ((args[0].equals("-L") && args[1].equals("-N")) || (args[0].equals("-N") && args[1].equals("-L"))) {

                String[] lownumb = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s",
                    "t", "v", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
                int length1 = lownumb.length;
                int newlong = 16;
                String val2 = "";
                for (int i = 0; i < newlong; i++) {
                    pass = lownumb[random.nextInt(length1)];
                    pass1 = pass1 + pass;
                }
                System.out.println(pass1);
            } else if ((args[0].equals("-A") && args[1].equals("-U")) || (args[0].equals("-U") && args[1].equals("-A"))) {

                String[] ambcap = {"A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "M", "N", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Z"};
                int length1 = ambcap.length;
                int newlong = 16;
                String val2 = "";
                for (int i = 0; i < newlong; i++) {
                    pass = ambcap[random.nextInt(length1)];
                    pass1 = pass1 + pass;
                }
                System.out.println(pass1);
            } else if ((args[0].equals("-L") && args[1].equals("-A")) || (args[0].equals("-A") && args[1].equals("-L"))) {

                String[] lowamb = {"a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "m", "n", "ñ", "p", "q", "r",
                    "s", "t", "v", "w", "x", "y", "z"};
                int length1 = lowamb.length;
                int newlong = 16;
                String val2 = "";
                for (int i = 0; i < newlong; i++) {
                    pass = lowamb[random.nextInt(length1)];
                    pass1 = pass1 + pass;
                }
                System.out.println(pass1);
            } else if (args[0].length() > 4 && args[1].equals("-S")) {
                int cont = args[0].length();
                if (cont > 6) {

                    sub = args[0].substring(6);

                    String[] sizesym = {"$", "#", "&", "/", "(", ")", "=", "?", "¡", "¿", "°", "|", "[", "[", "]", "@", "[]", "{}", ",", "ª"};
                    int length1 = sizesym.length;
                    int newlong = Integer.parseInt(sub);
                    String val2 = "";
                    for (int i = 0; i < newlong; i++) {
                        pass = sizesym[random.nextInt(length1)];
                        pass1 = pass1 + pass;
                    }
                    System.out.println(pass1);
                }

                // -U -Copy
            } else if (args[0].equals("-U") && args[1].length() == 5) {
                String[] capcopy = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r",
                    "s", "t", "v", "w", "x", "y", "z"};
                int length1 = capcopy.length;
                int newlong = 16;
                String val2 = "";
                for (int i = 0; i < newlong; i++) {
                    pass = capcopy[random.nextInt(length1)];
                    pass1 = pass1 + pass;
                }
                String pa = pass1.toUpperCase();
                System.out.println(pa);
                StringSelection selection = new StringSelection(pa);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(selection, selection);
            }
        } else if (val == 3) {

            if ((args[0].equals("-U") && args[1].equals("-L") && args[2].equals("-S"))) {
                String[] caplowsym = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r",
                    "s", "t", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R","S", "T", "U", "V", "W", "X", "Y", "Z", "$", "#", "&", "/", "(", ")", "=", "?", "¡", "¿", "°", "|", "[", "[", "]"};
                int length1 = caplowsym.length;
                int newlong = 16;
                String val2 = "";
                for (int i = 0; i < newlong; i++) {
                    pass = caplowsym[random.nextInt(length1)];
                    pass1 = pass1 + pass;
                }
                System.out.println(pass1);

            } else if ((args[0].equals("-S") && args[1].equals("-L") && args[2].equals("-U"))) {
                String[] symlowcap = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r",
                    "s", "t", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R",
                    "S", "T", "U", "V", "W", "X", "Y", "Z", "$", "#", "&", "/", "(", ")", "=", "?", "¡", "¿", "°", "|", "[", "[", "]"};
                int length1 = symlowcap.length;
                int newlong = 16;
                String val2 = "";
                for (int i = 0; i < newlong; i++) {
                    pass = symlowcap[random.nextInt(length1)];
                    pass1 = pass1 + pass;
                }
                System.out.println(pass1);
            } else if ((args[0].equals("-L") && args[1].equals("-S") && args[2].equals("-U"))) {
                String[] lowsymcap = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r",
                    "s", "t", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R","S", "T", "U", "V", "W", "X", "Y", "Z", "$", "#", "&", "/", "(", ")", "=", "?", "¡", "¿", "°", "|", "[", "[", "]"};
                int length1 = lowsymcap.length;
                int newlong = 16;
                String val2 = "";
                for (int i = 0; i < newlong; i++) {
                    pass = lowsymcap[random.nextInt(length1)];
                    pass1 = pass1 + pass;
                }
                System.out.println(pass1);
            } else if ((args[0].equals("-L") && args[1].equals("-U") && args[2].equals("-S"))) {
                String[] lowcapsym = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r",
                    "s", "t", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R","S", "T", "U", "V", "W", "X", "Y", "Z", "$", "#", "&", "/", "(", ")", "=", "?", "¡", "¿", "°", "|", "[", "[", "]"};
                int length1 = lowcapsym.length;
                int newlong = 16;
                String val2 = "";
                for (int i = 0; i < newlong; i++) {
                    pass = lowcapsym[random.nextInt(length1)];
                    pass1 = pass1 + pass;
                }
                System.out.println(pass1);

            } else if ((args[0].equals("-A") && args[1].equals("-U") && args[2].equals("-L"))) {
                String[] ambcaplow = {"a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "m", "n", "ñ", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z", "A","B", "C", "D", "E", "F", "G", "H", "J", "K", "M", "N", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Z"};
                int length1 = ambcaplow.length;
                int newlong = 16;
                String val2 = "";
                for (int i = 0; i < newlong; i++) {
                    pass = ambcaplow[random.nextInt(length1)];
                    pass1 = pass1 + pass;
                }
                System.out.println(pass1);
            } else if ((args[0].equals("-U") && args[1].equals("-A") && args[2].equals("-L"))) {
                String[] capambilow = {"a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "m", "n", "ñ", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z", "A","B", "C", "D", "E", "F", "G", "H", "J", "K", "M", "N", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Z"};
                int length1 = capambilow.length;
                int newlong = 16;
                String val2 = "";
                for (int i = 0; i < newlong; i++) {
                    pass = capambilow[random.nextInt(length1)];
                    pass1 = pass1 + pass;
                }
                System.out.println(pass1);
            } else if ((args[0].equals("-L") && args[1].equals("-A") && args[2].equals("-U"))) {
                String[] lowambcap = {"a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "m", "n", "ñ", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z", "A",
                    "B", "C", "D", "E", "F", "G", "H", "J", "K", "M", "N", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Z"};
                int length1 = lowambcap.length;
                int newlong = 16;
                String val2 = "";
                for (int i = 0; i < newlong; i++) {
                    pass = lowambcap[random.nextInt(length1)];
                    pass1 = pass1 + pass;
                }
                System.out.println(pass1);
            } else if ((args[0].equals("-A") && args[1].equals("-U") && args[2].equals("-L"))) {
                String[] ambcaplow = {"a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "m", "n", "ñ", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z", "A","B", "C", "D", "E", "F", "G", "H", "J", "K", "M", "N", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Z"};
                int length1 = ambcaplow.length;
                int newlong = 16;
                String val2 = "";
                for (int i = 0; i < newlong; i++) {
                    pass = ambcaplow[random.nextInt(length1)];
                    pass1 = pass1 + pass;
                }
                System.out.println(pass1);
            } else if ((args[0].equals("-L") && args[1].equals("-U") && args[2].equals("-A"))) {
                String[] lowcapamb = {"a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "m", "n", "ñ", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z", "A","B", "C", "D", "E", "F", "G", "H", "J", "K", "M", "N", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Z"};
                int length1 = lowcapamb.length;
                int newlong = 16;
                String val2 = "";
                for (int i = 0; i < newlong; i++) {
                    pass = lowcapamb[random.nextInt(length1)];
                    pass1 = pass1 + pass;
                }
                System.out.println(pass1);
            } else if ((args[0].equals("-N") && args[1].equals("-U") && args[2].equals("-L"))) {
                String[] numcaplow = {"a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "m", "n", "ñ", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z", "A","B", "C", "D", "E", "F", "G", "H", "J", "K", "M", "N", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
                int length1 = numcaplow.length;
                int newlong = 16;
                String val2 = "";
                for (int i = 0; i < newlong; i++) {
                    pass = numcaplow[random.nextInt(length1)];
                    pass1 = pass1 + pass;
                }
                System.out.println(pass1);
            } else if ((args[0].equals("-L") && args[1].equals("-N") && args[2].equals("-U"))) {
                String[] lownumcap = {"a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "m", "n", "ñ", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z", "A","B", "C", "D", "E", "F", "G", "H", "J", "K", "M", "N", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
                int length1 = lownumcap.length;
                int newlong = 16;
                String val2 = "";
                for (int i = 0; i < newlong; i++) {
                    pass = lownumcap[random.nextInt(length1)];
                    pass1 = pass1 + pass;
                }
                System.out.println(pass1);
            } else if ((args[0].equals("-U") && args[1].equals("-N") && args[2].equals("-L"))) {
                String[] capnumlow = {"a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "m", "n", "ñ", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z", "A","B", "C", "D", "E", "F", "G", "H", "J", "K", "M", "N", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
                int length1 = capnumlow.length;
                int newlong = 16;
                String val2 = "";
                for (int i = 0; i < newlong; i++) {
                    pass = capnumlow[random.nextInt(length1)];
                    pass1 = pass1 + pass;
                }
                System.out.println(pass1);
            } else if ((args[0].equals("-U") && args[1].equals("-N") && args[2].equals("-A"))) {
                String[] capnumamb = {"A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "M", "N", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "z", "2", "3", "4", "5", "6","7", "8", "9"};
                int length1 = capnumamb.length;
                int newlong = 16;
                String val2 = "";
                for (int i = 0; i < newlong; i++) {
                    pass = capnumamb[random.nextInt(length1)];
                    pass1 = pass1 + pass;
                }
                System.out.println(pass1);
            } else if ((args[0].equals("-U") && args[1].equals("-S") && args[2].equals("-A"))) {
                String[] capsymamb = {"A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "M", "N", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "z", "2", "3", "4", "5", "6","7", "8", "9", "$", "#", "&", "/", "(", ")", "=", "?", "¡", "¿", "°", "|", "[", "[", "]", "@", "[]", "{}", ",", "ª"};
                int length1 = capsymamb.length;
                int newlong = 16;
                String val2 = "";
                for (int i = 0; i < newlong; i++) {
                    pass = capsymamb[random.nextInt(length1)];
                    pass1 = pass1 + pass;
                }
                System.out.println(pass1);
            } else if (args[0].length() > 4 && args[1].equals("-S") && args[2].length() == 5) {
                int cont = args[0].length();
                if (cont > 6) {

                    sub = args[0].substring(6);

                    String[] sizsymcop = {"$", "#", "&", "/", "(", ")", "=", "?", "¡", "¿", "°", "|", "[", "[", "]", "@", "[]", "{}", ",", "ª"};
                    int length1 = sizsymcop.length;
                    int newlong = Integer.parseInt(sub);
                    String val2 = "";
                    for (int i = 0; i < newlong; i++) {
                        pass = sizsymcop[random.nextInt(length1)];
                        pass1 = pass1 + pass;
                    }

                    StringSelection selection = new StringSelection(pass1);
                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                    clipboard.setContents(selection, selection);
                    System.out.println(pass1);
                }
            }
        }
    }
}