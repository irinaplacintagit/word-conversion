package com.challenge.model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author iplacinta
 *
 */
public class ConversionMapper
{
    public static Map<Integer, String> numberWordMap = new HashMap<Integer, String>()
    {
        private static final long serialVersionUID = 8245062791257428169L;

        {
            put(0, EnglishNumbers.ZERO);
            put(1, EnglishNumbers.ONE);
            put(2, EnglishNumbers.TWO);
            put(3, EnglishNumbers.THREE);
            put(4, EnglishNumbers.FOUR);
            put(5, EnglishNumbers.FIVE);
            put(6, EnglishNumbers.SIX);
            put(7, EnglishNumbers.SEVEN);
            put(8, EnglishNumbers.EIGHT);
            put(9, EnglishNumbers.NINE);

            put(10, EnglishNumbers.TEN);
            put(11, EnglishNumbers.ELEVEN);
            put(12, EnglishNumbers.TWELVE);
            put(13, EnglishNumbers.THIRTEEN);
            put(14, EnglishNumbers.FOURTEEN);
            put(15, EnglishNumbers.FIFTEEN);
            put(16, EnglishNumbers.SIXTEEN);
            put(17, EnglishNumbers.SEVENTEEN);
            put(18, EnglishNumbers.EIGHTEEN);
            put(19, EnglishNumbers.NINETEEN);
            put(20, EnglishNumbers.TWENTY);

            put(30, EnglishNumbers.THIRTY);
            put(40, EnglishNumbers.FORTY);
            put(50, EnglishNumbers.FIFTY);
            put(60, EnglishNumbers.SIXTY);
            put(70, EnglishNumbers.SEVENTY);
            put(80, EnglishNumbers.EIGHTY);
            put(90, EnglishNumbers.NINETY);
        }
    };
    
    public static Map<Integer, String> unitWordMap = new LinkedHashMap<Integer, String>() {
        
        private static final long serialVersionUID = 3712015496322357351L;

        {
            put(1000000, EnglishNumbers.MILLION);
            put(1000, EnglishNumbers.THOUSAND);
            put(100, EnglishNumbers.HUNDRED);
        }
    };

}
