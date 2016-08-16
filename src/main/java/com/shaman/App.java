package com.shaman;
import java.util.ArrayList;
import java.util.regex.*;
import java.util.Collections;
import java.util.Comparator;

/**
 * ������� ������_2 ������_1  ������� � ������
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
    	int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] resultmatrix = new int[rows][columns];
    	for (int r = 0; r < rows ; r++){
        	for (int c = 0; c < columns ; c++){
        		resultmatrix[c][rows - 1 - r] = matrix[r][c];
        	}
        }
    	for (int r = 0; r < rows; r++){
        	for (int c = 0; c < columns; c++){
        		System.out.print(matrix[r][c] + " ");
        	}
        	System.out.print("\t");
        	for (int c = 0; c < columns; c++){
        		if (c == columns - 1 ){
        			System.out.println(resultmatrix[r][c]);
        		} else {
        			System.out.print(resultmatrix[r][c] + " ");
        		}
        	}
        }
    	
    	class StrItem {
    		String phrase;
    		int vowelsnum;
    		StrItem (String p, int v) {
    			phrase = p;
    			vowelsnum = v;
    		}
    	}
       	ArrayList<StrItem> phrases = new ArrayList<StrItem>();
    	phrases.add(new StrItem ("���� ���������� ����", 0));
    	phrases.add(new StrItem ("�� ����� ��� ����� ��������", 0));
    	phrases.add(new StrItem ("� ������ �� ������� ������ ���������� ���������� �����", 0));
    	phrases.add(new StrItem ("������ ��������? �� ����, �������", 0));
    	phrases.add(new StrItem ("To be? Or not to be?", 0));
    	phrases.add(new StrItem ("��, ��� �����, ������!", 0));
    	System.out.println(" ��������������� ������");
    	for (StrItem ii: phrases) {
    		System.out.println(ii.phrase);
    	}
    	Pattern vowels = Pattern.compile("[AaIiUuEeOo���娸��������������]", Pattern.CASE_INSENSITIVE);
    	//int[] count = new int[phrases.size()];
    	
    	for (int i=0; i < phrases.size(); i++) {
    		Matcher m = vowels.matcher(phrases.get(i).phrase);
    		while(m.find()) phrases.get(i).vowelsnum ++; //count[i]++;
    	}
    	Collections.sort(phrases, new Comparator<StrItem>() {
    		//@Override
    		public int compare(StrItem si1, StrItem si2) {
    			return Integer.compare(si1.vowelsnum , si2.vowelsnum );
    		}
    	});
    	System.out.println("������, ������������� �� ���������� ������� � ������");
    	for (StrItem ii: phrases) {
    		System.out.println(ii.phrase);
    	}
    }
}
