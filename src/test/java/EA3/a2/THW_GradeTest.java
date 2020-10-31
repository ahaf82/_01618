package EA3.a2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class THW_GradeTest {
    @Test
    public void assertThatEnumIsConvertedCorrectlyToLowerCaseLettersAfterFirstLetter(){
        Assertions.assertEquals("Helfer", THW_Grade.HELFER.toString());
        Assertions.assertEquals("Truppfuehrer", THW_Grade.TRUPPFUEHRER.toString());
        Assertions.assertEquals("Gruppenfuehrer", THW_Grade.GRUPPENFUEHRER.toString());
        Assertions.assertEquals("Zugtruppenfuehrer", THW_Grade.ZUGTRUPPENFUEHRER.toString());
        Assertions.assertEquals("Zugfuehrer", THW_Grade.ZUGFUEHRER.toString());
    }

    @Test
    public void assertThatHierarchyAreKept(){
        Assertions.assertFalse(THW_Grade.HELFER.istVorgesetzterVor(THW_Grade.HELFER));
        Assertions.assertTrue(THW_Grade.TRUPPFUEHRER.istVorgesetzterVor(THW_Grade.HELFER));
        Assertions.assertTrue(THW_Grade.GRUPPENFUEHRER.istVorgesetzterVor(THW_Grade.HELFER));
        Assertions.assertTrue(THW_Grade.ZUGTRUPPENFUEHRER.istVorgesetzterVor(THW_Grade.HELFER));
        Assertions.assertTrue(THW_Grade.ZUGFUEHRER.istVorgesetzterVor(THW_Grade.HELFER));

        Assertions.assertFalse(THW_Grade.HELFER.istVorgesetzterVor(THW_Grade.TRUPPFUEHRER));
        Assertions.assertFalse(THW_Grade.TRUPPFUEHRER.istVorgesetzterVor(THW_Grade.TRUPPFUEHRER));
        Assertions.assertTrue(THW_Grade.GRUPPENFUEHRER.istVorgesetzterVor(THW_Grade.TRUPPFUEHRER));
        Assertions.assertTrue(THW_Grade.ZUGTRUPPENFUEHRER.istVorgesetzterVor(THW_Grade.TRUPPFUEHRER));
        Assertions.assertTrue(THW_Grade.ZUGFUEHRER.istVorgesetzterVor(THW_Grade.TRUPPFUEHRER));

        Assertions.assertFalse(THW_Grade.HELFER.istVorgesetzterVor(THW_Grade.GRUPPENFUEHRER));
        Assertions.assertFalse(THW_Grade.TRUPPFUEHRER.istVorgesetzterVor(THW_Grade.GRUPPENFUEHRER));
        Assertions.assertFalse(THW_Grade.GRUPPENFUEHRER.istVorgesetzterVor(THW_Grade.GRUPPENFUEHRER));
        Assertions.assertTrue(THW_Grade.ZUGTRUPPENFUEHRER.istVorgesetzterVor(THW_Grade.GRUPPENFUEHRER));
        Assertions.assertTrue(THW_Grade.ZUGFUEHRER.istVorgesetzterVor(THW_Grade.GRUPPENFUEHRER));

        Assertions.assertFalse(THW_Grade.HELFER.istVorgesetzterVor(THW_Grade.ZUGTRUPPENFUEHRER));
        Assertions.assertFalse(THW_Grade.TRUPPFUEHRER.istVorgesetzterVor(THW_Grade.ZUGTRUPPENFUEHRER));
        Assertions.assertFalse(THW_Grade.GRUPPENFUEHRER.istVorgesetzterVor(THW_Grade.ZUGTRUPPENFUEHRER));
        Assertions.assertFalse(THW_Grade.ZUGTRUPPENFUEHRER.istVorgesetzterVor(THW_Grade.ZUGTRUPPENFUEHRER));
        Assertions.assertTrue(THW_Grade.ZUGFUEHRER.istVorgesetzterVor(THW_Grade.ZUGTRUPPENFUEHRER));

        Assertions.assertFalse(THW_Grade.HELFER.istVorgesetzterVor(THW_Grade.ZUGFUEHRER));
        Assertions.assertFalse(THW_Grade.TRUPPFUEHRER.istVorgesetzterVor(THW_Grade.ZUGFUEHRER));
        Assertions.assertFalse(THW_Grade.GRUPPENFUEHRER.istVorgesetzterVor(THW_Grade.ZUGFUEHRER));
        Assertions.assertFalse(THW_Grade.ZUGTRUPPENFUEHRER.istVorgesetzterVor(THW_Grade.ZUGFUEHRER));
        Assertions.assertFalse(THW_Grade.ZUGFUEHRER.istVorgesetzterVor(THW_Grade.ZUGFUEHRER));
    }
}