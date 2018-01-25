package control;

public class control_main {

    static int i=0;
    //接口的传递就免了，这里就靠这个整形的值进行操作的判断
    static int number_of_=0;
    //对打开的线程数目进行记录


    public static void main(String args[]){
        control_control one=new control_control();
        boolean know=one.UI_setting();
        if (know==false){
            //设置失败
            return;
        }
        while (true){
            i=one.player_perpaer();
            //需要在perpaer中进行操作信息的发送，同样需要一个while循环，你懂得
            switch (i){
                case 1:
                    new Thread(){
                        @Override
                        public void run() {
                            super.run();
                            number_of_++;
                            one.player_begin();
                            number_of_--;
                        }
                    }.start();
                    break;
                case 2:
                    new Thread(){
                        @Override
                        public void run() {
                            super.run();
                            number_of_++;
                            one.quick_play();
                            number_of_--;
                        }
                    }.start();
                    break;
                case 3:
                    new Thread(){
                        @Override
                        public void run() {
                            super.run();
                            number_of_++;
                            one.slow_play();
                            number_of_--;
                        }
                    }.start();
                    break;
                case 4:
                    new Thread(){
                        @Override
                        public void run() {
                            super.run();
                            number_of_++;
                            one.player_stop();
                            number_of_--;
                        }
                    }.start();
                    break;
                case 5:
                    new Thread(){
                        @Override
                        public void run() {
                            super.run();
                            number_of_++;
                            one.player_begin();
                            number_of_--;
                        }
                    }.start();
                    break;
                case 6:
                    new Thread(){
                        @Override
                        public void run() {
                            super.run();
                            number_of_++;
                            one.player_begin();
                            number_of_--;
                        }
                    }.start();
                    break;
            }
        }
    }
}
