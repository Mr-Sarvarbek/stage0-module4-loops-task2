package school.mjc.stage0.loops.task2;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

class WordsBuilderTest extends BaseIOTest {

//     @Test
    void buildPhraseBuildsAPhrase() {
        WordsBuilder builder = new WordsBuilder();

        builder.buildPhrase('l', 'o', 'o', 'p', 's', ' ', 'a', 'r', 'e', ' ', 'c', 'o', 'o', 'l');

        assertOutEquals("loops are cool");
    }
}
