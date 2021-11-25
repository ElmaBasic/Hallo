import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HalloTest
{
Hallo una;

    @BeforeEach
    void setUp()
    {
        una = new Hallo('w', 'z', 22, 170);
    }

    @Test
    void auswertungTagTest()
    {assertEquals("sehr cool", una.auswertungTag());
    }
}