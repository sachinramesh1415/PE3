package com.stackroute;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SelectNameTest {
    private static SelectName selectName;
    @BeforeClass
    public void setup() {
        selectName = new SelectName();
    }
    @AfterClass
    public void teardown() {
        selectName = null;
    }
    @Test
    public void readFile_ReadFileOfExtension_ReturnFileContent()
    {
        selectName.setFolderPath("../../../../../Files");
        selectName.setExtension("txt");
        assertEquals("This is a txt file.Leverage agile frameworks to provide a robust synopsis for high level overviews. Iterative approaches to corporate strategy foster collaborative thinking to further the overall value proposition. Organically grow the holistic world view of disruptive innovation via workplace diversity and empowerment.",selectName.readFile());
        selectName.setExtension("csv");
        assertEquals("This is a csv file",selectName.readFile());
        selectName.setExtension("java");
        assertEquals("File Not Found", selectName.readFile());
    }
    @Test
    public void readFile_ReadFileOfExtension_ReturnFileContentFailure()
    {
        selectName.setFolderPath("../../../../../Files");
        selectName.setExtension("txt");
        assertNotEquals("Leverage agile frameworks to provide a robust synopsis for high level overviews. Iterative approaches to corporate strategy foster collaborative thinking to further the overall value proposition. Organically grow the holistic world view of disruptive innovation via workplace diversity and empowerment.",selectName.readFile());
    }
}