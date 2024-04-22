/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming;

;

/**
 *
 * @author Zaki
 */
public class invalidinput extends RuntimeException {
    public invalidinput() {
    }

    public invalidinput(String message) {
        super(message);
    }

}
