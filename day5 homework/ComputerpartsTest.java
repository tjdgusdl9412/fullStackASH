public class ComputerpartsTest {
    public static void main(String[] args) {
        Computerparts oldcomputer = new Computer("팬티엄4", "볼마우스", 1 , 1);
        Computerparts newcomputer = new Computer();

        newcomputer.setDesktop("한성");
        newcomputer.setMouse("로지텍");
        newcomputer.setKeyboard(2);
        newcomputer.setHeadset(1);

        System.out.println("oldcomputer" + oldcomputer);
        System.out.println("newcomputer" + newcomputer);
    }
    
}