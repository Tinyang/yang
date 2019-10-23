package study.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class ExcelSheetColumnNameTest {

    @Test
    public void testConvertToTitle(){
        Assert.assertEquals(701, new ExcelSheetColumnNumber().titleToNumber("ZY"));
        Assert.assertEquals(1, new ExcelSheetColumnNumber().titleToNumber("A"));
        Assert.assertEquals(28, new ExcelSheetColumnNumber().titleToNumber("AB"));
    }
}
