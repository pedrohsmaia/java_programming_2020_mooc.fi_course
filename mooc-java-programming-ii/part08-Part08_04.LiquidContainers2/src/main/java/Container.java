/**
 *
 * @author pedromaia
 */
public class Container {
    private int content;
    
    public Container() {
        this.content = 0;
    }
    
    public int contains() {
        return content;
    }
    
    public void add(int amount) {
        if(amount < 0){
            return;
        }
        
        content += amount;
        if(content > 100) {
            content = 100;
        }
    }
    
    public void remove(int amount) {
        if(amount < 0) {
            return;
        }
        content -= amount;
        if(content < 0) {
            content = 0;
        }
    }

    @Override
    public String toString() {
        return content + "/100";
    }
}
