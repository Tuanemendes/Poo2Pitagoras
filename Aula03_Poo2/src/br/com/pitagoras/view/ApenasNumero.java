package br.com.pitagoras.view;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class ApenasNumero extends PlainDocument {


    public void insertString(int offs, String str, javax.swing.text.AttributeSet a) throws BadLocationException {

        super.insertString(offs, str.replaceAll("[^0-9]" ,""), a);

    }
}
