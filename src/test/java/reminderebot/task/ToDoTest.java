package reminderebot.task;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Test for ToDo class.
 */
public class ToDoTest {
    /**
     * Test if the toFile method works as intended.
     * @throws Exception
     */
    @Test
    public void testToFile() throws Exception {
        // test if ToFile converts to required format for storage
        String description = "blah";
        ToDo toDo = new ToDo(description);
        assertEquals("T| |blah", toDo.toFile());
        toDo.markAsDone();
        assertEquals("T|X|blah", toDo.toFile());
    }
}
