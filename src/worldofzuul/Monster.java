/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldofzuul;

/**
 *
 * @author Simon
 */
public class Monster {
    
    private int dmg;
    private int hp;
    
    public Monster(int _hp, int _dmg) {
        this.hp = _hp;
        this.dmg = _dmg;
        
    }
    
    public void fight(Character character) {
        character.setHp(character.getHp() - this.dmg);
    }
    
    public int getHp() {
        return this.hp;
    }
    
    public void setHp(int damageTaken){
        this.hp = hp - damageTaken;
    }
    
    public boolean isDead() {
        if(this.hp > 0){
            return false;
        }
        return true;
    }
}