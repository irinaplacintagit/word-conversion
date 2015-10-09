package com.challenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConversionTest
{
    @Test
    public void testConvertOneDigit()
    {
        assertEquals("undefined", Conversion.convert(-1));
        assertEquals("undefined", Conversion.convert(1000000000));
        assertEquals("zero", Conversion.convert(0));
        assertEquals("seven", Conversion.convert(7));
    }
    
    @Test
    public void testConvertTwoDigits()
    {
        assertEquals("eighteen", Conversion.convert(18));
        assertEquals("twenty one", Conversion.convert(21));
        assertEquals("thirty nine", Conversion.convert(39));
        assertEquals("seventy", Conversion.convert(70));
        assertEquals("eighty four", Conversion.convert(84));
    }
    
    @Test
    public void testConvertHundredsDigits()
    {
        assertEquals("two hundred and ten", Conversion.convert(210));
        assertEquals("one hundred", Conversion.convert(100));
        assertEquals("five hundred and twenty two", Conversion.convert(522));
        assertEquals("nine hundred and one", Conversion.convert(901));
        assertEquals("nine hundred and ninety nine", Conversion.convert(999));
    }
    
    @Test
    public void testConvertThousandsDigits()
    {
        assertEquals("one thousand", Conversion.convert(1000));
        assertEquals("two thousand and four", Conversion.convert(2004));
        assertEquals("one thousand one hundred and five", Conversion.convert(1105));
        assertEquals("five thousand five hundred and ninety nine", Conversion.convert(5599));
        assertEquals("fifty five thousand and one", Conversion.convert(55001));
        assertEquals("ninety nine thousand four hundred and fifty", Conversion.convert(99450));
    }
    
    @Test
    public void testConvertMillionsDigits()
    {
        assertEquals("one million", Conversion.convert(1000000));
        assertEquals("two million and four", Conversion.convert(2000004));
        assertEquals("forty million two thousand and fifty two", Conversion.convert(40002052));
        assertEquals("fifty six million nine hundred and forty five thousand seven hundred and eighty one", Conversion.convert(56945781));
        assertEquals("nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine", Conversion.convert(999999999));
    }

}
