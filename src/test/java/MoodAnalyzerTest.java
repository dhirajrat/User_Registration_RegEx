import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void testMoodAnalysis(){
        MoodAnalyzer moodAnalyzerObj = new MoodAnalyzer();

        String mood=moodAnalyzerObj.analyzeMood("This is a happy name Message");

        Assertions.assertEquals(mood,"SAD");
    }
    @Test
    public void testOtherMoodAnalysis(){
        MoodAnalyzer moodAnalyzerObj = new MoodAnalyzer();

        String mood = moodAnalyzerObj.analyzeMood("this contains happy message");

        Assertions.assertEquals(mood,"HAPPY");
    }
}
