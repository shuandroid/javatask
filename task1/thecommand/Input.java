package thecommand;

public class Input {
	 /**
     * 持有命令对象
     */
    private Command command = null;
    /**
     * 构造方法
     */
    public Input(Command command){
        this.command = command;
    }
    /**
     * 行动方法
     */
    public void action(){
        
        command.execute();
    }

}
