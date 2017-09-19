/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Refractor: -> Brian Kamau
 */
public interface wordLibrary {
    
    ///contains abstract methods
    public String getWord(int index);
    public String getScrambledword(int index);
    public int getSize();
    public boolean Correct(int index, String userGuess);
    
    
}
