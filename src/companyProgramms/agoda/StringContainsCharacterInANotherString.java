package companyProgramms.agoda;
// Determine if all the characters in a string B are present in string A
public class StringContainsCharacterInANotherString {
    public static void main(String[] args) {
        checkIfOneStringContainsAlltheCharactersofAnother("siba","ashkjdhas, ibbbbaaaa");
    }
    private static void checkIfOneStringContainsAlltheCharactersofAnother(String str1, String str2){
        boolean isContainsAllChar = true;
        for(String s : str1.split("")){
            if (!str2.contains(s)){
                isContainsAllChar = false;
                System.out.println(str2+" is not containing all the characters of "+str1);
                break;
            }
        }
        if(isContainsAllChar){
            System.out.println(str2+" is containing all the characters of "+str1);
        }
    }
}
