import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilsTest {

    private StringUtils classUnderTest;

    @Before
    public void setUp() {
        classUnderTest = new StringUtils();
    }

    @After
    public void tearDown() {
    }

    @Test

    public void zipCodeTest() throws Exception {

        String[] zipCodeArray = {"02-679", "02698", "00-02", "0-003", "0-0-003"};
        boolean[] resultArray = {true, false, false, false, false};

        boolean isZipCode;
        for (int i = 0; i < zipCodeArray.length; ++i) {
            isZipCode = classUnderTest.isValidZipCode(zipCodeArray[i]);
            assertEquals("Error for zip code: " + zipCodeArray[i], resultArray[i],isZipCode);
        }
    }

    @Test
    public void upperCaseTest() throws Exception {

        String[] wordArray = {"ALX", "alx", "ALX Java", "alx3"};
        String[] resultArray = {"ALX", "ALX", "ALX JAVA", "ALX3"};

        String upperCaseWord;
        for (int i = 0; i < wordArray.length; ++i){
            upperCaseWord = classUnderTest.toUpperCase(wordArray[i]);
            assertEquals("Error for sentence: " + wordArray[i], resultArray[i], upperCaseWord);
        }
    }

    @Test
    public void lowerCaseTest() throws Exception {

        String[] wordArray = {"ALX", "alx", "ALX Java", "ALX3"};
        String[] resultArray = {"alx", "alx", "alx java", "alx3"};

        String lowerCaseWord;
        for (int i = 0; i < wordArray.length; ++i){
            lowerCaseWord = classUnderTest.toLowerCase(wordArray[i]);
            assertEquals("Error for sentence: " + wordArray[i], resultArray[i], lowerCaseWord);
        }
    }

    @Test
    public void femaleNameTest() throws Exception {

        String[] nameArray = {"Joanna", "Krzysztof"};
        boolean[] resultArray = {true, false};

        boolean nameCheck;
        for (int i = 0; i < nameArray.length; ++i){
            nameCheck = classUnderTest.isFemaleName(nameArray[i]);
            assertEquals("Error for name: " + nameArray[i], resultArray[i], nameCheck);
        }
    }

    @Test
    public void underscoreInsteadSpaceTest() throws Exception {

        String[] sentenceArray = {"My house is big", "House", "My_house big"};
        String[] resultArray = {"My_house_is_big", "House", "My_house_big"};

        String sentenceWithUnderscores;
        for (int i = 0; i < sentenceArray.length; ++i){
            sentenceWithUnderscores = classUnderTest.replaceSpacesWithUnderscore(sentenceArray[i]);
            assertEquals("Error for sentence: " + sentenceArray[i], resultArray[i], sentenceWithUnderscores);
        }
    }

    @Test
    public void wordsCountingTest() throws Exception {
        String[] wordArray = {"oneword", "two words", "f o u_r words"};
        int[] resultArray = {1, 2, 4};

        int countOfWords;
        for (int i = 0; i < wordArray.length; ++i) {
            countOfWords = classUnderTest.countWordsInSentence(wordArray[i]);
            assertEquals("Error for word: " + wordArray[i], resultArray[i], countOfWords);
        }
    }
}
