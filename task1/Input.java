package thecommand;

public class Input {
	 /**
     * �����������
     */
    private Command command = null;
    /**
     * ���췽��
     */
    public Input(Command command){
        this.command = command;
    }
    /**
     * �ж�����
     */
    public void action(){
        
        command.execute();
    }

}
