public class JavaExercise3{ 
public static void main(String[] args) {
    // Take a character and check whether it is:
    // 1. Vowel (a, e, i, o, u – both lowercase and uppercase)
    // 2. Consonant (anothor 21 letters)
    // 3. Not an alphabet
    char ch = 'i';
    boolean isAlphabet = false;
    boolean isVowel = false;

    if (ch<64 || (ch>=91 && ch<=96) || ch>=123){
      isAlphabet = false;
    } else if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
      isAlphabet = true;
      isVowel = true;
    } else{
      isAlphabet = true;
      isVowel = false;
    }

    if (isAlphabet){
      System.out.println("Is the char an Alphbet: " + isAlphabet + "\nIs the char a Vowel: " + isVowel );
    }else{
      System.out.println("Is the char an Alphbet: " + isAlphabet);
    }

    // Take salary and years of experience, then calculate and print bonus
    // Experience ≥ 10 years → 20% bonus
    // 5–9 years → 10% bonus
    // < 5 years → 5% bonus
    int exp = 12;
    int salary = 110_000;
    double bonus;

    if (exp >= 10){
      bonus = salary * 0.2;
    } else if (exp >=5 && exp <9){
      bonus = salary * 0.1;
    } else {
      bonus = salary * 0.05;
    }
    System.out.println("The bonus is " + bonus);
}
}