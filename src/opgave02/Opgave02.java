package opgave02;

public class Opgave02 {
    public static void main(String[] args) {
        char[] characterArray = getCharacterArray();
        int[] test = new int[9];
        test = numberOfVocals(characterArray);
        double lix = lixtal(characterArray);

    }

    private static char[] getCharacterArray() {
        return ("Der var så dejligt ude på landet; det var sommer, kornet stod gult, havren grøn, " +
                "høet var rejst i stakke nede i de grønne enge, og der gik storken på sine lange, " +
                "røde ben og snakkede ægyptisk, for det sprog havde han lært af sin moder. Rundt om" +
                " ager og eng var der store skove, og midt i skovene dybe søer; jo, der var rigtignok " +
                "dejligt derude på landet! Midt i solskinnet lå der en gammel herregård med dybe kanaler" +
                " rundt om, og fra muren og ned til vandet voksede store skræppeblade, der var så høje," +
                " at små børn kunne stå oprejste under de største; der var lige så vildsomt derinde, som " +
                "i den tykkeste skov, og her lå en and på sin rede; hun skulle ruge sine små ællinger ud, " +
                "men nu var hun næsten ked af det, fordi det varede så længe, og hun sjælden fik visit;" +
                " de andre ænder holdt mere af at svømme om i kanalerne, end at løbe op og sidde under " +
                "et skræppeblad for at snadre med hende." +
                "Endelig knagede det ene æg efter det andet: pip! pip! sagde det, alle æggeblommerne " +
                "var blevet levende og stak hovedet ud." +
                "Rap! rap! sagde hun, og så rappede de sig alt hvad de kunne, og så til alle sider " +
                "under de grønne blade, og moderen lod dem se så meget de ville, for det grønne er godt for " +
                "øjnene. Hvor dog verden er stor! sagde alle ungerne; thi de havde nu rigtignok ganske " +
                "anderledes plads, end da de lå inde i ægget. Tror I, det er hele verden! sagde moderen, " +
                "den strækker sig langt på den anden side haven, lige ind i præstens mark! " +
                "men der har jeg aldrig været! – I er her dog vel alle sammen! – og så rejste hun sig" +
                " op, nej, jeg har ikke alle! det største æg ligger der endnu; hvor længe skal det vare! nu er " +
                "jeg snart ked af det! og så lagde hun sig igen.").toCharArray();
    }

    public static int[] numberOfVocals(char[] text){
        int[] vocalFrequency = new int[9];
        char[] vocals = {'a','e','i','o','u','y','æ','ø','å','A','E','I','O','U','Y','Æ','Ø','Å'};

        for (int index = 0; index < text.length; index++){
            for (int vocal = 0; vocal < 9; vocal++){
                if (text[index] == vocals[vocal] || text[index] == vocals[(vocal + 8)]){
                    vocalFrequency[vocal]++;
                }
            }
        }
            return vocalFrequency;
    }

    private static int numberOfPeriods (char[] text){
        int numberOfPeriods = 0;
        for (int index = 0; index < text.length; index++){
            if (text[index] == '.') {
                numberOfPeriods++;
            }
        }
        return numberOfPeriods;
    }

    private static int numberOfWords (char[] text){
        int numberOfWords = 1;
        for (int index = 0; index < text.length; index++){
            if (text[index] == ' '){
                numberOfWords++;
            }
        }
        return numberOfWords;
    }

    private static int numberOfLongWords (char[] text) {
        int numberOfLongWords = 0;
        int wordLengthCounter = 0;
        for (int index = 0; index < text.length; index++){
            if (text[index] == ' ' || text[index] == '.' || text[index] == ',' || text[index] == ':' || text[index] == ';' || text[index] == '!' || text[index] == '?') {
                wordLengthCounter = 0;
            } else {
                wordLengthCounter++;
            }
            if (wordLengthCounter == 7) {
                numberOfLongWords++;
            }
        }
        return numberOfLongWords;
    }

    private static double lixtal (char[] text){
        return numberOfWords(text) / numberOfPeriods(text) + numberOfLongWords(text) * 100 / numberOfWords(text);
    }
}
