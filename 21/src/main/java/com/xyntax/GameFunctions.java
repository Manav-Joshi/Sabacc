/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xyntax;
import java.lang.Math;
import java.util.Arrays;

/**
 *
 * @author nikhi
 */
public class GameFunctions {
    private int[] before;
    private int[] cards;
    GameFunctions(int[] cards){
        this.cards = cards;
    }
    int[] getCard(int[] cards){
        before = cards;
        for(int i = 0; i<3;i++){
            if (cards[i] == 0){
                cards[i] = (int)(Math.random() * ((10 - 1) + 1)) + 1;//(Math.random() * ((max - min) + 1)) + min
                i = 5;
            }
            
        }
        if(cards[2] != 0 && Arrays.equals(before, cards) && cards[3] == 1){
            cards[3] = 0;
            return(newGame(cards));
        }
        if(cards[2] != 0){
            cards[3] = 1;
        }
        return(cards);       
    }
    int[] newGame(int[] cards){
        
        cards[2] = 0;
        cards[1] = 0;
        cards[0] = (int)(Math.random() * ((10 - 1) + 1)) + 1;//(Math.random() * ((max - min) + 1)) + min
        return(cards);
    }
    
    
}
